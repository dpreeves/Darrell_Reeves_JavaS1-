package com.trilogyed.tasker.service;

import com.trilogyed.tasker.dao.TaskerDao;
import com.trilogyed.tasker.dao.TaskerDaoJdbcTemplateImpl;
import com.trilogyed.tasker.model.Task;
import com.trilogyed.tasker.model.TaskViewModel;
import com.trilogyed.tasker.util.feign.AdserverServiceClient;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

public class TaskServiceTest {
    TaskerDao taskerDao;
    TaskerServiceLayer taskerServiceLayer;

    @Autowired
    private AdserverServiceClient client;

    @Before
    public void setUp()throws Exception{
        setUpTaskerDaoMock();

        taskerServiceLayer = new TaskerServiceLayer(client, taskerDao);
    }

    private void setUpTaskerDaoMock(){
        taskerDao = mock(TaskerDaoJdbcTemplateImpl.class);

        Task task = new Task();
        task.setId(1);
        task.setDescription("get groceries");
        task.setCreateDate(LocalDate.now());
        task.setDueDate(LocalDate.now().plus(3, ChronoUnit.DAYS));
        task.setCategory("personal");

        Task task1 = new Task();
        task1.setDescription("get groceries");
        task1.setCreateDate(LocalDate.now());
        task1.setDueDate(LocalDate.now().plus(3, ChronoUnit.DAYS));
        task1.setCategory("personal");

//        Task task2 = new Task();
//        task2.setId(3);
//        task2.setDescription("get groceries and paper towels");
//        task2.setCreateDate(LocalDate.now());
//        task2.setDueDate(LocalDate.now().plus(5, ChronoUnit.DAYS));
//        task2.setCategory("work");

        List<Task> taskList = new ArrayList<>();
        List<Task> personalList = new ArrayList<>();
        taskList.add(task);
        personalList.add(task);
        personalList.add(task1);

        doReturn(task).when(taskerDao).createTask(task1);
        doReturn(task).when(taskerDao).getTask(1);
        doReturn(taskList).when(taskerDao).getAllTasks();
        doReturn(personalList).when(taskerDao).getTasksByCategory("personal");

    }

    @Test
    public void saveFindTask(){
        TaskViewModel task = new TaskViewModel();
        task.setDescription("get groceries");
        task.setCreateDate(LocalDate.now());
        task.setDueDate(LocalDate.now().plus(3, ChronoUnit.DAYS));
        task.setCategory("personal");

        task = taskerServiceLayer.newTask(task);
        TaskViewModel fromService = taskerServiceLayer.fetchTask(task.getId());
        assertEquals(task, fromService);
    }

    @Test
    public void findAllTasks(){
        TaskViewModel task = new TaskViewModel();
        task.setId(1);
        task.setDescription("get groceries");
        task.setCreateDate(LocalDate.now());
        task.setDueDate(LocalDate.now().plus(3, ChronoUnit.DAYS));
        task.setCategory("personal");
        task.setAdvertisement(client.getAd());

        taskerServiceLayer.newTask(task);

        TaskViewModel task1 = new TaskViewModel();
        task1.setDescription("get groceries");
        task1.setCreateDate(LocalDate.now());
        task1.setDueDate(LocalDate.now().plus(3, ChronoUnit.DAYS));
        task1.setCategory("personal");
        task.setAdvertisement(client.getAd());

        taskerServiceLayer.newTask(task1);

        List<TaskViewModel> taskViewModelList = taskerServiceLayer.fetchAllTasks();
        assertEquals(1,taskViewModelList.size());
        assertEquals(task, taskViewModelList.get(0));

        List<TaskViewModel> personalList = taskerServiceLayer.fetchTasksByCategory("personal");
        assertEquals(2,personalList.size());
        assertEquals(task, personalList.get(0));
    }





}


