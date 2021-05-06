package GameSimulation.Services;

import GameSimulation.Entities.Campaign;
import GameSimulation.Entities.Game;
import GameSimulation.Entities.Gamer;

public interface SaleService {
    void Sell(Game game, Gamer gamer);
    void SellWithCampaign(Game game, Gamer gamer, Campaign campaign);
}
