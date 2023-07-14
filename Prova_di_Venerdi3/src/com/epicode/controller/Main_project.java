package com.epicode.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main_project {
	
	static EntityManagerFactory  emf = Persistence.createEntityManagerFactory("Prova_di_Venerdi3");
    static EntityManager em = emf.createEntityManager();
    
    public static void main(String[] args) {
		
	}

}
