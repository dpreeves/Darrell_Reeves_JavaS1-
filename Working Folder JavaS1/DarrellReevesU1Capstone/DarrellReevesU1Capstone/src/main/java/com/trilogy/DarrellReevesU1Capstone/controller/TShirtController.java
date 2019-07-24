package com.trilogy.DarrellReevesU1Capstone.controller;

import com.trilogy.DarrellReevesU1Capstone.exception.NotFoundException;
import com.trilogy.DarrellReevesU1Capstone.service.InvoiceInventoryService;
import com.trilogy.DarrellReevesU1Capstone.viewmodel.TShirtViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/tshirt")
public class TShirtController {

    @Autowired
    InvoiceInventoryService inventoryService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TShirtViewModel createTShirt(@RequestBody @Valid TShirtViewModel tShirtViewModel){
        return inventoryService.saveTShirt(tShirtViewModel);
    }

    @GetMapping("/{tShirtId}")
    @ResponseStatus(HttpStatus.OK)
    public TShirtViewModel getTShirt(@PathVariable("tShirtId") int tShirtId){
        TShirtViewModel tShirtViewModel = inventoryService.findTShirtById(tShirtId);
        if (tShirtViewModel == null)
            throw new NotFoundException();
        return tShirtViewModel;
    }

    @GetMapping("/{size}")
    @ResponseStatus(HttpStatus.OK)
    public List<TShirtViewModel> getTShirtBySize(@PathVariable("size") String size){
        List<TShirtViewModel> tShirtViewModelList = inventoryService.findTShirtBySize(size);
        if (tShirtViewModelList == null)
            throw new NotFoundException();
        return tShirtViewModelList;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<TShirtViewModel> getAllTShirts(){
        List<TShirtViewModel> tShirtViewModelList = inventoryService.findAllTShirts();
        if (tShirtViewModelList == null)
            throw new NotFoundException();
        return tShirtViewModelList;
    }

    @GetMapping("/{color}")
    @ResponseStatus(HttpStatus.OK)
    public List<TShirtViewModel> getTShirtByColor(@PathVariable("color") String color){
        List<TShirtViewModel> tShirtViewModelList = inventoryService.findTShirtByColor(color);
        if (tShirtViewModelList == null)
            throw new NotFoundException();
        return tShirtViewModelList;
    }

    @PutMapping("/{tShirtId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateTShirt(@PathVariable("tShirtId") int tShirtId, @RequestBody @Valid TShirtViewModel tShirtViewModel){
        if (tShirtViewModel.gettShirtId() == 0)
            tShirtViewModel.settShirtId(tShirtId);
        if (tShirtId != tShirtViewModel.gettShirtId()){
            throw new IllegalArgumentException();
        }
        inventoryService.updateTShirt(tShirtViewModel);
    }

    @DeleteMapping("/{tShirtId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTShirt(@PathVariable("tShirtId") int tShirtId){
        inventoryService.removeTShirt(tShirtId);
    }
}
