package Concrete;

import java.util.Scanner;

import Abstract.ISellManager;
import Entities.Game;
import Entities.User;

public class SellManager implements ISellManager {

    @Override
    public void sell(Game game, User user) {
        Scanner scanner = new Scanner(System.in);

        double lastPrice = game.getGamePrice();

        if(game.getCampaign().getDiscountPercent() != 0){
            System.out.println(game.getGameName() + " has a campaign.");
            System.out.println("You can buy " + game.getGameName() + " with a discount of %" + game.getCampaign().getDiscountPercent());
            System.out.println("Which makes the price " + (game.getGamePrice() - (game.getGamePrice() * (game.getCampaign().getDiscountPercent() / 100))));
            System.out.println("Would you like to benefit from the campaign? (Y/N)");

            while(true){
                String response = scanner.nextLine();

                if(response.equals("Y") || response.equals("y")){
                    lastPrice = (game.getGamePrice() - (game.getGamePrice() * (game.getCampaign().getDiscountPercent() / 100)));
                    System.out.println("You're now buying the game with the campaign.");
                    break;
                }
                else if(response.equals("H") || response.equals("h")){
                    System.out.println("You have refused to benefit from the campaign.");
                    break;
                }
                else{
                    System.out.println("You have typed wrong. Please try again.");
                }
            }
        }

        if (user.getBudget() >= lastPrice) {
            user.setBudget(user.getBudget() - lastPrice);
            System.out.println(user.getFullName() + " has bought " + game.getGameName());
            System.out.println("Remaining budget : " + user.getBudget());
        }
    }

    @Override
    public void refund(Game game, User user) {
        user.setBudget(user.getBudget() + game.getGamePrice());
        System.out.println(user.getFullName() + " has refunded " + game.getGameName());
        System.out.println("New budget : " + user.getBudget());
    }
}
