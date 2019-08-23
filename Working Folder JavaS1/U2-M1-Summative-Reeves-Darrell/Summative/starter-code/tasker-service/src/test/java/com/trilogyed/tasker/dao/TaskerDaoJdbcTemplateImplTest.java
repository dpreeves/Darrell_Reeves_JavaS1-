package com.trilogyed.tasker.dao;

import com.trilogyed.tasker.model.Task;
import com.trilogyed.tasker.util.feign.AdserverServiceClient;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TaskerDaoJdbcTemplateImplTest {
    @Autowired
    TaskerDao dao;

//    @Autowired
//    private final AdserverServiceClient client;

    @Before
    public  void setUp() throws Exception {
        List<Task> taskList = dao.getAllTasks();
        for (Task task : taskList){
            dao.deleteTask(task.getId());
        }
    }

    @Test
    public void addGetDeleteTask(){
        Task task = new Task();
        task.setDescription("get groceries");
        task.setCreateDate(LocalDate.of(2019,1,1));
        task.setDueDate(LocalDate.of(2019, 1 , 5));
        task.setCategory("personal");

        task = dao.createTask(task);

        Task task1 = dao.getTask(task.getId());
        assertEquals(task1, task);

        dao.deleteTask(task.getId());
        task1 = dao.getTask(task.getId());
        assertNull(task1);

    }

    @Test
    public void updateTask(){
        Task task = new Task();
        task.setDescription("get groceries");
        task.setCreateDate(LocalDate.now());
        task.setDueDate(LocalDate.now().plus(3, ChronoUnit.DAYS));
        task.setCategory("personal");

        task = dao.createTask(task);

        task.setDescription("get groceries and paper towels");
        task.setCreateDate(LocalDate.now());
        task.setDueDate(LocalDate.now().plus(5, ChronoUnit.DAYS));
        task.setCategory("personal");

        dao.updateTask(task);

        Task task1 = dao.getTask(task.getId());
        assertEquals(task1, task);
    }

    @Test
    public void getAllTask(){
        Task task = new Task();
        task.setDescription("get groceries");
        task.setCreateDate(LocalDate.now());
        task.setDueDate(LocalDate.now().plus(3, ChronoUnit.DAYS));
        task.setCategory("personal");

        task = dao.createTask(task);

        Task task1 = new Task();
        task1.setDescription("get groceries and paper towels");
        task1.setCreateDate(LocalDate.now());
        task1.setDueDate(LocalDate.now().plus(5, ChronoUnit.DAYS));
        task1.setCategory("personal");

        task1 = dao.createTask(task1);

        List<Task> taskList = dao.getAllTasks();
        assertEquals(2, taskList.size());
    }

    @Test
    public void getTaskByCategory(){
        Task task = new Task();
        task.setDescription("get groceries");
        task.setCreateDate(LocalDate.now());
        task.setDueDate(LocalDate.now().plus(3, ChronoUnit.DAYS));
        task.setCategory("personal");

        task = dao.createTask(task);

        Task task1 = new Task();
        task1.setDescription("get groceries and paper towels");
        task1.setCreateDate(LocalDate.now());
        task1.setDueDate(LocalDate.now().plus(5, ChronoUnit.DAYS));
        task1.setCategory("personal");

        task1 = dao.createTask(task1);

        Task task2 = new Task();
        task2.setDescription("get groceries and paper towels");
        task2.setCreateDate(LocalDate.now());
        task2.setDueDate(LocalDate.now().plus(5, ChronoUnit.DAYS));
        task2.setCategory("work");

        task2 = dao.createTask(task2);

        List<Task> taskList = dao.getTasksByCategory("personal");
        assertEquals(2, taskList.size());
    }
}
