package Concrete;

import java.util.*;

import Abstract.*;
import Entities.*;

public class PlayerManager implements PlayerService{

	private List <Player> players=new ArrayList<>();
	private PlayerCheckService playerCheckService;
	
	public PlayerManager(PlayerCheckService playerCheckService) {
		this.playerCheckService = playerCheckService;
	}
	
	@Override
	public void signUp(Player player) throws Exception {
		if (playerCheckService.CheckIfRealPerson(player)) {
			players.add(player);
			System.out.println("Player "+player.getFirstName()+" signed up!");
		}
		else {
			throw new Exception("Not a valid person.");
		}
	}

	@Override
	public void signIn(Player player) {
		if (players.contains(player)) {
			System.out.println(player.getFirstName()+" signed in!");
		}
		else {
			System.out.println("Player info is wrong!");
		}
		
	}

	@Override
	public void updateInfo(Player player) {
		if (players.contains(player)) {
			System.out.println("Info updated!");
		}
		else {
			System.out.println("Player info is wrong!");
		}
		
	}

	@Override
	public void deleteAccount(Player player) {
		if (players.contains(player)) {
			players.remove(player);
			System.out.println("Player account deleted successfully!");
		}
		else {
			System.out.println("There is no such player!");
		}
		
	}

	@Override
	public void listGames(Player player) {
		System.out.println("My Game Library");
		System.out.println("---------------");
		for (Game game : player.getMyGames()) {
			System.out.println(game.getName());
		}
		System.out.println("---------------");
	}

}
