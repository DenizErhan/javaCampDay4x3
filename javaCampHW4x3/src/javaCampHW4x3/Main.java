package javaCampHW4x3;

import java.util.*;

import Adapters.MernisServiceAdapter;
import Concrete.*;
import Entities.*;

public class Main {

	public static void main(String[] args) throws Exception {
		Player p1=new Player(1,"16498423962","Deniz","Erhan",1996,"denizerhan0046@gmail.com","123456");
		PlayerManager playerManager=new PlayerManager(new MernisServiceAdapter());	
		SalesManager salesManager=new SalesManager();
		
		playerManager.signUp(p1);
		playerManager.signIn(p1);
		playerManager.deleteAccount(p1);
		playerManager.signIn(p1);
		playerManager.deleteAccount(p1);
		playerManager.signUp(p1);
		
		Game skyrim=new Game("SkyrimV",50);
		Game gta=new Game("GTA Vice City",150);
		Game bioshock=new Game("Bioshock Infinite",120);
		
		List <Game> games=new ArrayList();
		
		games.add(skyrim);
		games.add(gta);
		
		salesManager.sellMultiple(games, p1,20);
		
		playerManager.listGames(p1);

		salesManager.sell(bioshock, p1, 10);
		
		playerManager.listGames(p1);
	}

}
