package com.trilogy.DarrellReevesU1Capstone.controller;

import com.trilogy.DarrellReevesU1Capstone.exception.NotFoundException;
import com.trilogy.DarrellReevesU1Capstone.service.InvoiceInventoryService;
import com.trilogy.DarrellReevesU1Capstone.viewmodel.ConsoleViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/console")
public class ConsoleController {

    @Autowired
    InvoiceInventoryService inventoryService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ConsoleViewModel createConsole(@RequestBody @Valid ConsoleViewModel consoleViewModel){
        return inventoryService.saveConsole(consoleViewModel);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ConsoleViewModel> getAllConsole(){
        List<ConsoleViewModel> consoleViewModelList = inventoryService.findAllConsoles();
        if (consoleViewModelList == null)
            throw new NotFoundException();
        return consoleViewModelList;
    }

    @GetMapping("/{consoleId}")
    @ResponseStatus(HttpStatus.OK)
    public ConsoleViewModel getConsole(@PathVariable("consoleId") int consoleId){
        ConsoleViewModel consoleViewModel = inventoryService.findConsoleById(consoleId);
        if (consoleViewModel == null)
            throw new NotFoundException();
        return consoleViewModel;
    }

//    @GetMapping
//    @ResponseStatus(HttpStatus.OK)
//    public List<ConsoleViewModel> getAllConsoles(){
//        List<ConsoleViewModel> consoleViewModelList = inventoryService.findAllConsoles();
//        if (consoleViewModelList == null)
//            throw new NotFoundException();
//        return consoleViewModelList;
//    }

    @GetMapping("/manufacturer/{manufacturer}")
    @ResponseStatus(HttpStatus.OK)
    public List<ConsoleViewModel> getConsoleByManufacturer(@PathVariable("manufacturer") String manufacturer){
        List<ConsoleViewModel> consoleViewModelList = inventoryService.findConsoleByManufacturer(manufacturer);
        if (consoleViewModelList == null)
            throw new NotFoundException();
        return consoleViewModelList;
    }

    @PutMapping("/{consoleId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateConsole(@PathVariable("consoleId") int consoleId, @RequestBody @Valid ConsoleViewModel consoleViewModel){
        if (consoleViewModel.getConsoleId() == 0)
            consoleViewModel.setConsoleId(consoleId);
        if (consoleId != consoleViewModel.getConsoleId()) {
            throw new IllegalArgumentException();
        }
        inventoryService.updateConsole(consoleViewModel);
    }

    @DeleteMapping("/{consoleId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteConsole(@PathVariable("consoleId") int consoleId){
        inventoryService.removeConsole(consoleId);
    }
}
