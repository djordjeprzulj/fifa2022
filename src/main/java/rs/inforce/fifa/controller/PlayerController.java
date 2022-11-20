package rs.inforce.fifa.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rs.inforce.fifa.model.Player;
import rs.inforce.fifa.model.Stadium;
import rs.inforce.fifa.service.PlayerService;
import rs.inforce.fifa.service.StadiumService;

@RestController
@RequestMapping("/players")
public class PlayerController {

	@Autowired
	private PlayerService playerService;
	
	@GetMapping
	public ArrayList<Player> getAll() {
		 return playerService.getAll();
	}
	
	@GetMapping("/{id}")
	public Player getById(@PathVariable Integer id) {
		return playerService.getById(id);
	}
	
	@PostMapping
	public void add(@RequestBody Player request) {
		playerService.add(request);
	}
	
	@PutMapping
	public void update(@RequestBody Player request) {
		playerService.update(request);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		playerService.delete(id);
	}

}
