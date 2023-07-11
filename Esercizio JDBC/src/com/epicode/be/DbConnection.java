package com.epicode.be;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class DbConnection {

	String url = "jdbc:postgresql://localhost:5432/Esercizio2";
	String user = "postgres";
	String pass = "root";
	Statement st;
	
	public DbConnection() throws SQLException {
		
		Connection conn = DriverManager.getConnection( url, user, pass);
		st = conn.createStatement();
		System.out.println("Connessione al DB avvenuta correttamente!");
		createTable();
		
		
	}
	
	public void createTable() throws SQLException {
		
		   String query = " CREATE TABLE IF NOT EXISTS school_students("

				+"id SERIAL PRIMARY KEY,"
				+"name VARCHAR,"
				+"lastname VARCHAR,"
				+"gender VARCHAR,"
				+"birthdate DATE,"
				+"avg DECIMAL, "
				+"min_vote DECIMAL,"
				+"max_vote DECIMAL"
				+");";
		   
		st.executeUpdate(query);
		System.out.println("Tabella degli studenti creata correttamente");
	}

	
	public void insertStudent( Studente s ) throws SQLException {
		
		String sql = "INSERT INTO school_students ("
				+"name, lastname, gender, birthdate, avg, min_vote, max_vote)"
				+ "VALUES ("
				+ "'" + s.getName() + " ', "
			    + "'" +s.getLastname() + "', "
				+ "'" +s.getGender() + "', "
				+ "'" +s.getBirthdate() + "', "
				+ s.getAvg() + ", "
			    + s.getMin_vote() + ", "
				+ s.getMax_vote()
				+ ")";
		st.executeUpdate(sql);
		System.out.println(s.getName()+ " " + s.getLastname() + "studente inserito corretamente nel databse" );
		
		
	}
	
	public void updateStudente (int id, HashMap<String, Object> s) {
		
		
		
		
	}	
	
	public void deleteStudente (int id) throws SQLException {
		
		String sql = "DELETE FROM schoool_students WHERE id =" + id;
		st.executeUpdate(sql);
		System.out.println("Studente correttamente eliminato dal database");
	}
	
    public void getBest() throws SQLException {
    	
    	String query = "SELECT * FROM school_students ORDER BY avg DESC LIMIT 1";
    	st.executeUpdate(query);
    	
    }
	
}
