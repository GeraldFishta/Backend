package com.epicode.Gestione_Prenotazioni.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.epicode.Gestione_Prenotazioni.classes.Prenotazione;

@Repository
public interface PrenotazioneRepository extends CrudRepository<Prenotazione, Long> {

	

}
