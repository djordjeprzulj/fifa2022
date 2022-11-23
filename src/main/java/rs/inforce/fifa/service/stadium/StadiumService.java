package rs.inforce.fifa.service.stadium;

import java.util.List;

import rs.inforce.fifa.model.Stadium;

public interface StadiumService {

	List<Stadium> getAll();
	Stadium getById(int id);
	void add(Stadium newStadium);
	void update(Stadium stadium);
	void delete(int id);
}
