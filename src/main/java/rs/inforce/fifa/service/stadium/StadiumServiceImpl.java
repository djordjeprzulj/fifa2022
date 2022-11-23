package rs.inforce.fifa.service.stadium;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import rs.inforce.fifa.model.Stadium;
import rs.inforce.fifa.repository.StadiumRepository;

@Service
@Primary
public class StadiumServiceImpl implements StadiumService {
	
	@Autowired
	private StadiumRepository stadiumRepository;

	@Override
	public List<Stadium> getAll() {
		return this.stadiumRepository.findAll();
	}

	@Override
	public Stadium getById(int id) {
		Optional<Stadium> opt = this.stadiumRepository.findById(id);
		if (opt.isPresent()) {
			return opt.get();
		} else {
			return null;	
		}		
	}

	@Override
	public void add(Stadium newStadium) {
		if (!this.stadiumRepository.existsById(newStadium.getId())) {
			this.stadiumRepository.save(newStadium);	
		}		
	}

	@Override
	public void update(Stadium stadium) {
		if (this.stadiumRepository.existsById(stadium.getId())) {
			this.stadiumRepository.save(stadium);	
		}		
	}

	@Override
	public void delete(int id) {
		this.stadiumRepository.deleteById(id);
	}

}
