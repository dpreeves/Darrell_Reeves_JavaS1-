package com.trilogy.DarrellReevesU1Capstone.dao;

import com.trilogy.DarrellReevesU1Capstone.model.Game;

import java.util.List;

public interface GameDao {
    Game addGame(Game game);
    Game getGame(int gameId);
    List<Game> getAllGames();
    void updateGame(Game game);
    void deleteGame(int gameId);
    List<Game> getGamesByStudio(String studio);
    List<Game> getGamesByEsrbRating(String esrbRating);
    List<Game> getGamesByTitle(String title);

}
