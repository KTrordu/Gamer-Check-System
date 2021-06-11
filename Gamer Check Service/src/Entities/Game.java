package Entities;

public class Game {
    private int id;
    private String gameName;
    private double gamePrice;
    private Campaign campaign;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getGameName() {
        return gameName;
    }
    public void setGameName(String gameName) {
        this.gameName = gameName;
    }
    public double getGamePrice() {
        return gamePrice;
    }
    public void setGamePrice(double gamePrice) {
        this.gamePrice = gamePrice;
    }
    public Campaign getCampaign() {
        return campaign;
    }
    public void setCampaign(Campaign campaign) {
        this.campaign = campaign;
    }
}
