package rs.inforce.fifa.service;

import java.util.ArrayList;

import rs.inforce.fifa.model.Player;

public interface PlayerService {

	ArrayList<Player> getAll();
	Player getById(int id);
	void add(Player newPlayer);
	void update(Player player);
	void delete(int id);
}
