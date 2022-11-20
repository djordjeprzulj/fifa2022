package rs.inforce.fifa.service;

import java.util.ArrayList;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import rs.inforce.fifa.model.Stadium;

@Service
@Primary
public class StadiumServiceDatabase implements StadiumService {

	@Override
	public ArrayList<Stadium> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stadium getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Stadium newStadium) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Stadium stadium) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

}
