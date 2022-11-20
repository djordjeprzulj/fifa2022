package rs.inforce.fifa.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import rs.inforce.fifa.model.Stadium;
import rs.inforce.fifa.service.StadiumService;

@RestController
public class StadiumController {
	
	@Autowired
	private StadiumService stadiumService;
	
	@GetMapping("/stadiums")
	public ArrayList<Stadium> getAll() {
		 return stadiumService.getAll();
	}
	
	@GetMapping("/stadiums/{id}")
	public Stadium getById(@PathVariable Integer id) {
		return stadiumService.getById(id);
	}
	
	@PostMapping("/stadiums")
	public void add(@RequestBody Stadium request) {
		stadiumService.add(request);
	}
	
	@PutMapping("/stadiums")
	public void update(@RequestBody Stadium request) {
		stadiumService.update(request);
	}
	
	@DeleteMapping("/stadiums/{id}")
	public void delete(@PathVariable Integer id) {
		stadiumService.delete(id);
	}

}
