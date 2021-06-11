package Concrete;

import java.util.ArrayList;

import Abstract.IGame;
import Entities.Game;

public class GameManager implements IGame{

    @Override
    public void addGame(Game game, ArrayList<Game> games) {
        games.add(game);
    }

    @Override
    public void updateGame(Game game, int id, String gameName, double gamePrice) {
        game.setId(id);
        game.setGameName(gameName);
        game.setGamePrice(gamePrice);
    }

    @Override
    public void deleteGame(Game game, ArrayList<Game> games) {
        games.remove(game);
    }
}
