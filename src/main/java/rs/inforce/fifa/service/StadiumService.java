package rs.inforce.fifa.service;

import java.util.ArrayList;

import rs.inforce.fifa.model.Stadium;

public interface StadiumService {

	ArrayList<Stadium> getAll();
	Stadium getById(int id);
	void add(Stadium newStadium);
	void update(Stadium stadium);
	void delete(int id);
}
