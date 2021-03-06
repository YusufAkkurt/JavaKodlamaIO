package GameSimulation.gameSimulation;

import GameSimulation.gameSimulation.Adapters.MernisAdapter;
import GameSimulation.gameSimulation.Entities.Campaign;
import GameSimulation.gameSimulation.Entities.Game;
import GameSimulation.gameSimulation.Entities.Gamer;
import GameSimulation.gameSimulation.Managers.GameManager;
import GameSimulation.gameSimulation.Managers.GamerManager;
import GameSimulation.gameSimulation.Managers.SaleManager;

public class Main {
    public static void main(String[] args) {
        Gamer gamer = new Gamer();
        Game game = new Game();
        MernisAdapter mernisAdapter = new MernisAdapter();
        Campaign campaign = new Campaign();
        GamerManager gamerManager = new GamerManager();
        GameManager gameManager = new GameManager();
        SaleManager saleManager = new SaleManager();

        game.setId(1);
        game.setName("Assassin's Creed Valhalla");
        game.setPrice(150);

        gamer.setId(1);
        gamer.setFirstName("YUSUF");
        gamer.setLastName("AKKURT");
        gamer.setNationalId("12345678910");
        gamer.setBirthOfYear(1998);
        gamer.setMoney(100);

        campaign.setId(1);
        campaign.setName("Yeni kampanya");
        campaign.setDiscount(50);

        gameManager.add(game);
        mernisAdapter.customerCheck(gamer);

        gamerManager.add(gamer);
        System.out.println("-----------");
        saleManager.Sell(game, gamer);
        System.out.println("-----------");
        saleManager.SellWithCampaign(game, gamer, campaign);
    }
}