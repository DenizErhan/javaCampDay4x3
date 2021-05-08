package Concrete;

import java.util.List;

import Abstract.SalesService;
import Entities.*;

public class SalesManager implements SalesService{
	
	public SalesManager() {
		
	}	
	@Override
	public void sell(Game gameToBuy,Player player,int discount) {
		player.getMyGames().add(gameToBuy);
		System.out.println("Price:"+gameToBuy.getPrice());
		System.out.println("Price after discount:"+CampaignManager.discount(gameToBuy.getPrice(), discount));
		System.out.println(gameToBuy.getName()+" added to your library!");
	};
	

	public void sellMultiple(List<Game> gamesToBuy, Player player,int discount) {
		float total=0;
		for (Game game : gamesToBuy) {
			total+=game.getPrice();
			sell(game, player, discount);
		}
		System.out.println("Total price:"+total);
		System.out.println("Total price after discount:"+CampaignManager.discount(total, discount));
	}
}
