package com.epicode.be;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import utils.JpaUtil;

public class EventoDAO {

    private EntityManagerFactory entityManagerFactory;

    public EventoDAO() {
        entityManagerFactory = JpaUtil.getEntityManagerFactory();
    }

    public void save(Evento evento) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = null;

        try {
            transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.persist(evento);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
    }
    
    
    public Evento getById(Long id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            return entityManager.find(Evento.class, id);
        } finally {
            entityManager.close();
        }
    }
    
    public void delete(Evento evento) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = null;

        try {
            transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.remove(entityManager.merge(evento));
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
    }
    
    public void refresh(Evento evento) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = null;

        try {
            transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.refresh(evento);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
    }
}