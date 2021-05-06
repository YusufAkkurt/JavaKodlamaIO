package GameSimulation.Managers;

import GameSimulation.Entities.Campaign;
import GameSimulation.Entities.Game;
import GameSimulation.Entities.Gamer;
import GameSimulation.Services.SaleService;

public class SaleManager implements SaleService {
    public void Sell(Game game, Gamer gamer) {
        if (game.getPrice() > gamer.getMoney()) {
            System.out.println(game.getName() + ", oyununu alabilmek için bakiyeniz yetersiz");
            return;
        }

        System.out.println("Sayın " + gamer.getFirstName() + ", " + game.getName() + ", oyununu kiraladınız");

        double currentMoney = gamer.getMoney() - game.getPrice();
        gamer.setMoney(currentMoney);
        System.out.println("Kalan bakiyeniz: " + gamer.getMoney());
    }

    public void SellWithCampaign(Game game, Gamer gamer, Campaign campaign) {
        double newPrice = game.getPrice() - ((campaign.getDiscount() / 100) * game.getPrice());
        game.setPrice(newPrice);

        if (game.getPrice() > gamer.getMoney()) {
            System.out.println(game.getName() + ", oyununu alabilmek için bakiyeniz yetersiz");
            return;
        }

        System.out.println("Sayın " + gamer.getFirstName() + ", " + game.getName() + ", oyununu kiraladınız");

        double currentMoney = gamer.getMoney() - game.getPrice();
        gamer.setMoney(currentMoney);
        System.out.println("Kalan bakiyeniz: " + gamer.getMoney());
    }
}