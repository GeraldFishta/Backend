package com.epicode.Spring.main.repositories;

import org.springframework.data.repository.CrudRepository;

import com.epicode.Spring.main.models.Utente;

public interface UtentiRepository extends CrudRepository<Utente, String>{

}
