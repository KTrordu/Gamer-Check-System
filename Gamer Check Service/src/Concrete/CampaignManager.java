package Concrete;

import Abstract.ICampaign;
import Entities.Campaign;
import Entities.Game;

public class CampaignManager implements ICampaign{

    @Override
    public void addCampaign(Game game, Campaign campaign, double discountPercent) {
        campaign.setDiscountPercent(discountPercent);
        game.setCampaign(campaign);
    }

    @Override
    public void updateCampaign(Game game, double discountPercent) {
        game.getCampaign().setDiscountPercent(discountPercent);
    }

    @Override
    public void deleteCampaign(Game game, Campaign campaign) {
        game.setCampaign(null);
    }
}
