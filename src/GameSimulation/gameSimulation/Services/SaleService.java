package GameSimulation.gameSimulation.Services;

import GameSimulation.gameSimulation.Entities.Campaign;
import GameSimulation.gameSimulation.Entities.Game;
import GameSimulation.gameSimulation.Entities.Gamer;

public interface SaleService {
    void Sell(Game game, Gamer gamer);
    void SellWithCampaign(Game game, Gamer gamer, Campaign campaign);
}
