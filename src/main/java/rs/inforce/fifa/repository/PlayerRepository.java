package rs.inforce.fifa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import rs.inforce.fifa.model.Player;

public interface PlayerRepository extends JpaRepository<Player, Integer> {

}
