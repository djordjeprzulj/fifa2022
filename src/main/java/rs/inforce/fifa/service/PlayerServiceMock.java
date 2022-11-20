package rs.inforce.fifa.service;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.stereotype.Service;

import rs.inforce.fifa.model.Player;

@Service
public class PlayerServiceMock implements PlayerService {

	private ArrayList<Player> data = new ArrayList<>();
	
	public PlayerServiceMock() {
		data.add(new Player(1, "Aleksandar", "Mitrovic", 9));
		data.add(new Player(2, "Dusan", "Tadic", 10));
		data.add(new Player(3, "Cristiano", "Ronaldo", 7));
		data.add(new Player(4, "Lionel", "Messi", 10));
		data.add(new Player(5, "Dusan", "Vlahovic", 18));
	}
	
	public ArrayList<Player> getAll() {
		return this.data;
	}

	public Player getById(int id) {
		Iterator<Player> it = this.data.iterator();
		while (it.hasNext()) {
			Player p = it.next();
			if (p.getId() == id) {
				return p;
			}
		}
		return null;
	}

	public void add(Player newPlayer) {
		this.data.add(newPlayer);
	}

	public void update(Player player) {
		Player existing = this.getById(player.getId());		
		if (existing != null) {
			existing.setFirstName(player.getFirstName());
			existing.setLastName(player.getLastName());
			existing.setNumber(player.getNumber());
		}

	}

	public void delete(int id) {
		Iterator<Player> it = this.data.iterator();
		while (it.hasNext()) {
			Player p = it.next();
			if (p.getId() == id) {
				it.remove();
			}
		}
	}

}
