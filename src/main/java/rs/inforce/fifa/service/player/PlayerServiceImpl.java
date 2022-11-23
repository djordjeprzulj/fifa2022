package rs.inforce.fifa.service.player;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import rs.inforce.fifa.model.Player;
import rs.inforce.fifa.repository.PlayerRepository;

@Service
@Primary
public class PlayerServiceImpl implements PlayerService {

	@Autowired
	private PlayerRepository playerRepository;	
	
	@Override
	public List<Player> getAll() {
		return this.playerRepository.findAll();
	}

	@Override
	public Player getById(int id) {
		Optional<Player> opt = this.playerRepository.findById(id);
		if (opt.isPresent()) {
			return opt.get();
		} else {
			return null;
		}
	}

	@Override
	public void add(Player newPlayer) {
		if (!this.playerRepository.existsById(newPlayer.getId())) {
			this.playerRepository.save(newPlayer);
		}
	}

	@Override
	public void update(Player player) {
		if (this.playerRepository.existsById(player.getId())) {
			this.playerRepository.save(player);
		}
	}

	@Override
	public void delete(int id) {
		this.playerRepository.deleteById(id);
	}
}
