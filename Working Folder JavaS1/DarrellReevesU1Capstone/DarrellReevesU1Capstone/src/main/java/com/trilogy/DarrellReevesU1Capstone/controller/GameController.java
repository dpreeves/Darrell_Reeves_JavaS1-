package com.trilogy.DarrellReevesU1Capstone.controller;

import com.trilogy.DarrellReevesU1Capstone.exception.NotFoundException;
import com.trilogy.DarrellReevesU1Capstone.service.InvoiceInventoryService;
import com.trilogy.DarrellReevesU1Capstone.viewmodel.GameViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/game")
public class GameController {
    @Autowired
    InvoiceInventoryService inventoryService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public GameViewModel addGame(@RequestBody @Valid GameViewModel gameViewModel){
        return inventoryService.saveGame(gameViewModel);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<GameViewModel> getAllGames(){
        List<GameViewModel> gameViewModelList = inventoryService.findAllGames();
        if (gameViewModelList == null)
            throw new NotFoundException();
        return gameViewModelList;
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public GameViewModel getGame(@PathVariable("id") int gameId){
        GameViewModel gameViewModel = inventoryService.findGameById(gameId);
        if (gameViewModel == null)
            throw new NotFoundException();
        return gameViewModel;
    }

    @GetMapping("/{studio}")
    @ResponseStatus(HttpStatus.OK)
    public List<GameViewModel> getGameByStudio(@PathVariable("studio") String studio){
        List<GameViewModel> gameViewModelList = inventoryService.findGameByStudio(studio);
        if (gameViewModelList != null && gameViewModelList.size() == 0)
            throw new NotFoundException("Invoice could not be retrieved for customer ");
        return gameViewModelList;
    }

    @GetMapping("/{esrbRating}")
    @ResponseStatus(HttpStatus.OK)
    public List<GameViewModel> getGameByEsrbRating(@PathVariable("esrbRating") String esrbRating){
        List<GameViewModel> gameViewModelList = inventoryService.findGameByEsrbRating(esrbRating);
        if (gameViewModelList != null && gameViewModelList.size() == 0)
            throw new NotFoundException("Invoice could not be retrieved for customer ");
        return gameViewModelList;
    }

    @GetMapping("/{title}")
    @ResponseStatus(HttpStatus.OK)
    public List<GameViewModel> getGameByTitle(@PathVariable("title") String title){
        List<GameViewModel> gameViewModelList = inventoryService.findGameByTitle(title);
        if (gameViewModelList != null && gameViewModelList.size() == 0)
            throw new NotFoundException("Invoice could not be retrieved for customer ");
        return gameViewModelList;
    }

    @DeleteMapping("/{gameId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteGame(@PathVariable int gameId){
        inventoryService.removeGame(gameId);
    }

    @PutMapping("/{gameId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateGame(@PathVariable("gameId") int gameId, @RequestBody @Valid GameViewModel gameViewModel){
        if (gameViewModel.getGameId() == 0)
            gameViewModel.setGameId(gameId);
        if (gameId != gameViewModel.getGameId()){
            throw new IllegalArgumentException();
        }
        inventoryService.updateGame(gameViewModel);
    }
}
