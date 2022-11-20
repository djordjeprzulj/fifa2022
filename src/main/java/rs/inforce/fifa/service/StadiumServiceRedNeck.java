package rs.inforce.fifa.service;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.stereotype.Service;

import rs.inforce.fifa.model.Stadium;

@Service
public class StadiumServiceRedNeck implements StadiumService {

	private ArrayList<Stadium> data = new ArrayList<>();
	
	public StadiumServiceRedNeck() {
		data.add(new Stadium(1, "Endfield", 35000));
		data.add(new Stadium(2, "Poljance", 200));
		data.add(new Stadium(3, "Karadjordje", 20000));
		data.add(new Stadium(4, "Allianz Arena", 50000));
		data.add(new Stadium(5, "Marakana", 100000));
	}
	
	public ArrayList<Stadium> getAll() {
		return this.data;
	}
	
	public Stadium getById(int id) {
		Iterator<Stadium> it = this.data.iterator();
		while (it.hasNext()) {
			Stadium s = it.next();
			if (s.getId() == id) {
				return s;
			}
		}
		
		return null;
	}
	
	public void add(Stadium newStadium) {
		this.data.add(newStadium);
	}
	
	public void update(Stadium stadium) {
		Stadium existing = this.getById(stadium.getId());		
		if (existing != null) {
			existing.setName(stadium.getName());
			existing.setCapacity(stadium.getCapacity());
		}
	}
	
	public void delete(int id) {
		Iterator<Stadium> it = this.data.iterator();
		while (it.hasNext()) {
			Stadium s = it.next();
			if (s.getId() == id) {
				it.remove();
			}
		}		
	}
}
