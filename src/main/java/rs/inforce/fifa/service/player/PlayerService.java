package rs.inforce.fifa.service.player;

import java.util.List;

import rs.inforce.fifa.model.Player;

public interface PlayerService {

	List<Player> getAll();
	Player getById(int id);
	void add(Player newPlayer);
	void update(Player player);
	void delete(int id);
}
