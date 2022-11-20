package rs.inforce.fifa.model;

public class Player {

	private Integer id;
	private String firstName;
	private String lastName;
	private Integer number;
	
	public Player(Integer id, String firstName, String lastName, Integer number) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.number = number;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}
	
	
}
