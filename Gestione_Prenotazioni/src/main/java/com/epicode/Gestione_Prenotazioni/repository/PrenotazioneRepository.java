package com.epicode.Gestione_Prenotazioni.repository;


import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epicode.Gestione_Prenotazioni.classes.Postazione;
import com.epicode.Gestione_Prenotazioni.classes.Prenotazione;
import com.epicode.Gestione_Prenotazioni.classes.Utente;

@Repository
public interface PrenotazioneRepository extends CrudRepository<Prenotazione, Long> {


	@Query("SELECT p FROM Prenotazione p WHERE p.data = :data AND p.postazione = :postazione")
	public Prenotazione findPrenotazioneByDataAndPostazione(LocalDate data, Postazione postazione);
	
	@Query("SELECT p FROM Prenotazione p WHERE p.utente = :utente AND p.data = :data")
	public Prenotazione findPrenotazioneByUtenteAndData(Utente utente, LocalDate data);
	
}
