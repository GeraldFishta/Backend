package com.epicode.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main_project {
	
	static EntityManagerFactory  emf = Persistence.createEntityManagerFactory("EsercizioTEST");
	static EntityManager em = emf.createEntityManager();


	public static void main(String[] args) {
		
		
		
	}

}
