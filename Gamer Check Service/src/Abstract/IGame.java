package Abstract;

import java.util.ArrayList;

import Entities.Game;

public interface IGame {
    public void addGame(Game game, ArrayList<Game> games);

    public void updateGame(Game game, int id, String gameName, double gamePrice);

    public void deleteGame(Game game, ArrayList<Game> games);
}
