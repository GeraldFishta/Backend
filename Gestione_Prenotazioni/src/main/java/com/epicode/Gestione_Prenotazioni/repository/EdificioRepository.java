package com.epicode.Gestione_Prenotazioni.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epicode.Gestione_Prenotazioni.classes.Edificio;


@Repository
public interface EdificioRepository extends CrudRepository<Edificio, Long>{

}
