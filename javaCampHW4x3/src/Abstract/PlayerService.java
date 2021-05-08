package Abstract;

import Entities.*;

public interface PlayerService {
	void signUp(Player player) throws Exception;
	void signIn(Player player);
	void updateInfo(Player player);
	void deleteAccount(Player player);
	void listGames(Player player);
}
