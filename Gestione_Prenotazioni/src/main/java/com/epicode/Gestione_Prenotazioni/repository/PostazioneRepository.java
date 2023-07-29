package com.epicode.Gestione_Prenotazioni.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epicode.Gestione_Prenotazioni.classes.Postazione;
import com.epicode.Gestione_Prenotazioni.enums.TipoPostazione;

@Repository
public interface PostazioneRepository extends CrudRepository<Postazione, Long>{
	
	@Query("SELECT p FROM Postazione p WHERE p.tipo = :tipo AND p.edificio.citta = :citta")
	public List <Postazione> findByTipoAndCitta(TipoPostazione tipo, String citta);
	
	
}
