package Main;

import java.util.ArrayList;

import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.SellManager;
import Concrete.UserManager;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class Main {

    private static ArrayList<User> users = new ArrayList<User>();
    private static ArrayList<Game> games = new ArrayList<Game>();
    public static void main(String[] args){
        UserManager userManager = new UserManager();
        GameManager gameManager = new GameManager();
        CampaignManager campaignManager = new CampaignManager();
        SellManager sellManager = new SellManager();

        User user1 = new User();
        userManager.register(user1);
        userManager.addUser(user1, users);

        Game game1 = new Game();
        game1.setGameName("Legendary Game");
        game1.setGamePrice(54.99);
        game1.setId(1);

        gameManager.addGame(game1, games);

        Campaign campaign1 = new Campaign();
        campaignManager.addCampaign(game1, campaign1, 35);

        sellManager.sell(game1, user1);
    }
}
