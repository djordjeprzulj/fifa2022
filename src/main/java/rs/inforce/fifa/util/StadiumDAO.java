package rs.inforce.fifa.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import rs.inforce.fifa.model.Stadium;

public class StadiumDAO {
	
	private Connection connection;
	
	public ArrayList<Stadium> getAll() throws Exception {
		
		ArrayList<Stadium> all = new ArrayList<>();
		
		String query = "SELECT id, name, capacity "
					+ "FROM STADIUM ";
		Statement st = connection.createStatement();
		ResultSet rs = st.executeQuery(query);
		while (rs.next()) {
			Integer id = rs.getInt(1);
			String name = rs.getString(2);
			Integer capacity = rs.getInt(3);
			Stadium s = new Stadium(id, name, capacity);
			all.add(s);
		}
		rs.close();
		st.close();
		
		return all;
	}
	
	public void add(Stadium stadium) throws Exception {
		String ins = "INSERT INTO stadium (id, name, capacity) VALUES (" + stadium.getId() +", '" + stadium.getName() +"', " + stadium.getCapacity() + ")";
		Statement st = connection.createStatement();
		st.executeUpdate(ins);
		st.close();		
	}

}
