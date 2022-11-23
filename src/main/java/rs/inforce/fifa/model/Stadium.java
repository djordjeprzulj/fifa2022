package rs.inforce.fifa.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Stadium {

	@Id
	private Integer id;
	private String name;
	private Integer capacity;
	
	public Stadium() {
		
	}
	
	public Stadium(Integer id, String name, Integer capacity) {
		super();
		this.id = id;
		this.name = name;
		this.capacity = capacity;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

}
