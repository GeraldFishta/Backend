package com.epicode.Gestione_Prenotazioni.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.epicode.Gestione_Prenotazioni.classes.Utente;

@Repository
public interface UtenteRepository extends CrudRepository<Utente, String> {

	
	
}
