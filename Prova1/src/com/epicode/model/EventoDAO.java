package com.epicode.model;

import javax.persistence.EntityManager;

import com.epicode.utils.JpaUtil;

public class EventoDAO {
	
	static EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
	
	public static void save(Evento evento) {
		
		em.getTransaction().begin();
		em.persist(evento);
		em.getTransaction().commit();
		System.out.println(evento);
		
	}
	
	public static void getById(Integer id) {
		
		em.getTransaction().begin();
		Evento e = em.find(Evento.class,id);
		em.getTransaction().commit();
		System.out.println(e);
		
	}
	
	public static void delete(Evento evento) {
		
		em.getTransaction().begin();
		em.remove(evento);
		em.getTransaction().commit();
		
	}
	
	public static void refresh(Evento evento) {
		
		em.getTransaction().begin();
		em.refresh(evento);
		em.getTransaction().commit();
		System.out.println(evento);

		
	}

}
