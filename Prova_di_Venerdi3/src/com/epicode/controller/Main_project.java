package com.epicode.controller;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.epicode.enumerated.Periodicita;
import com.epicode.models.Catalogo_Bibliotecario;
import com.epicode.models.Libro;
import com.epicode.models.Prestito;
import com.epicode.models.Rivista;
import com.epicode.models.Utenti;

public class Main_project {
	
	static EntityManagerFactory  emf = Persistence.createEntityManagerFactory("Prova_di_Venerdi3");
    static EntityManager em = emf.createEntityManager();
    
    public static void main(String[] args) {
    	
    	try {
    		
    	Libro libro1 = new Libro("777","Sportwear", 2016, 777, "Dark Polo Gang", "Trap biografica");
    	//save(libro1);
    	
    	Rivista rivista1 = new Rivista ("675","Life", 2023 , 35, Periodicita.SEMESTRALE);
    	//save(rivista1);
    	
    	Utenti utente1 = new Utenti ("Gianfranco", "Rossi", LocalDate.of(1986, 9, 10), 4593 );
    	//saveUtente(utente1);
    	
    	Utenti utente2 = new Utenti ("Franco", "Rossini", LocalDate.of(1990, 03, 07), 1212 );
    	//saveUtente(utente2);
    	
    	Prestito prestito1 = new Prestito(utente1, libro1, LocalDate.of(2023, 1, 3), LocalDate.of(2023, 2, 3), null );
    	//savePrestito(prestito1);
    	
    	Prestito prestito2 = new Prestito(utente2, rivista1, LocalDate.of(2023, 2, 3), LocalDate.of(2023, 3, 3), LocalDate.of(2023, 2, 18) );
    	//savePrestito(prestito2);
    	
    	
    	getByISBN("777");
    	getByDate(2023);
    	getByAuthor("Dark Polo Gang");
    	getByTitle("Life");
    	elementsOut(4593);
    	expiredLoans(LocalDate.of(2023, 2, 3));
    	
    	
    	} catch(SQLException e) {
    		System.out.println(e.getMessage());
    	} finally {
    		em.close();
    		emf.close();
    	}
	}
    


	public static void save(Catalogo_Bibliotecario elemento) throws SQLException {
    	
    	em.getTransaction().begin();
    	em.persist(elemento);
    	em.getTransaction().commit();
    	System.out.println(elemento);
    	
    }
	
	public static void saveUtente(Utenti elemento) throws SQLException {
	    	
	    	em.getTransaction().begin();
	    	em.persist(elemento);
	    	em.getTransaction().commit();
	    	System.out.println(elemento);
	    	
	    }

	public static void savePrestito(Prestito elemento) throws SQLException {
		
		em.getTransaction().begin();
		em.persist(elemento);
		em.getTransaction().commit();
		System.out.println(elemento);
		
	}
	

	public static void delete(String codice) throws SQLException {
    	
    	em.getTransaction().begin();
    	Catalogo_Bibliotecario elemento = em.find(Catalogo_Bibliotecario.class,codice);
    	em.remove(elemento);
    	em.getTransaction().commit();
    	
    }
	
	
	public static void getByISBN(String codice) throws SQLException {
			
			em.getTransaction().begin();
			Catalogo_Bibliotecario e = em.find(Catalogo_Bibliotecario.class,codice);
			em.getTransaction().commit();
			System.out.println(e);
			
		}

	
	public static void getByDate(Integer data) throws SQLException {
			
			Query query = em.createQuery("SELECT d FROM Catalogo_Bibliotecario d WHERE d.annoPubblicazione = :data");
			query.setParameter("data", data );
			List<Catalogo_Bibliotecario> resultList = query.getResultList();
			resultList.forEach(e -> System.out.println(e));
			
		}
	
	public static void getByAuthor(String autore) throws SQLException {
		
		Query query = em.createQuery("SELECT d FROM Catalogo_Bibliotecario d WHERE d.autore = :author");
		query.setParameter("author", autore );
		List<Catalogo_Bibliotecario> resultList = query.getResultList();
		resultList.forEach(e -> System.out.println(e));
		
	}
	
	public static void getByTitle(String titolo) throws SQLException {
		
		Query query = em.createQuery("SELECT d FROM Catalogo_Bibliotecario d WHERE d.titolo LIKE :title");
		query.setParameter("title", "%" + titolo + "%" );
		List<Catalogo_Bibliotecario> resultList = query.getResultList();
		resultList.forEach(e -> System.out.println(e));
		
	}
	
	public static void elementsOut(Integer numeroDiTessera) throws SQLException {
			
			Query query = em.createQuery("SELECT d FROM Prestito d WHERE d.utente.numeroDiTessera = :cardnumber");
			query.setParameter("cardnumber", numeroDiTessera );
			List<Prestito> resultList = query.getResultList();
			resultList.forEach(e -> System.out.println(e));
			
		}
	
	public static void expiredLoans(LocalDate data) throws SQLException {
		
		Query query = em.createQuery("SELECT d FROM Prestito d WHERE d.dataRestituzionePrevista < :data AND d.dataRestituzioneEffettiva IS NULL");
		query.setParameter("data", data );
		List<Prestito> resultList = query.getResultList();
		resultList.forEach(e -> System.out.println(e));
		
	}
	
	
}
	
	

	
