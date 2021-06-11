package Abstract;

import Entities.Campaign;
import Entities.Game;

public interface ICampaign {
    public void addCampaign(Game game, Campaign campaign, double discountPercent);

    public void updateCampaign(Game game, double discountPercent);

    public void deleteCampaign(Game game, Campaign campaign);
}
