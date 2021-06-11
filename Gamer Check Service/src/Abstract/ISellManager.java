package Abstract;

import Entities.Game;
import Entities.User;

public interface ISellManager {
    public void sell(Game game, User user);

    public void refund(Game game, User user);
}
