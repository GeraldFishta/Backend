package com.epicode.be;

import java.sql.Date;
import java.sql.SQLException;

public class Main_project {

	public static void main(String[] args) {
		
		try {
			
			DbConnection db = new DbConnection();
			
			Studente a = new Studente("Andrea", "Neri", Gender.f , Date.valueOf("1990-02-08"), 7.5, 5.0, 9.2);
			Studente b = new Studente("Paolo", "Bianchi", Gender.m , Date.valueOf("1990-02-08"), 7.5, 5.0, 9.2);
			Studente c = new Studente("Luca", "Rossi", Gender.m , Date.valueOf("1995-04-06"), 7.5, 5.0, 9.2);
			Studente d = new Studente("Antonio", "Verdi", Gender.m , Date.valueOf("1992-05-11"), 7.5, 5.0, 9.2);
			
			db.insertStudent(a);
			db.insertStudent(b);
			db.insertStudent(c);
			db.insertStudent(d);
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}

	}

}
