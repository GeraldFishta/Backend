package com.epicode.be;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main_project {
	
	static EntityManagerFactory  emf = Persistence.createEntityManagerFactory("paramsDb");
	static EntityManager em = emf.createEntityManager();

	public static void main(String[] args) {
		
		
		
	}

}
