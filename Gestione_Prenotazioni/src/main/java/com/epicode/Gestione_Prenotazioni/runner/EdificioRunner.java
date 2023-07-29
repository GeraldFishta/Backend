package com.epicode.Gestione_Prenotazioni.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.epicode.Gestione_Prenotazioni.classes.Edificio;
import com.epicode.Gestione_Prenotazioni.services.PostazioneService;
import com.epicode.Gestione_Prenotazioni.services.PrenotazioneService;
import com.epicode.Gestione_Prenotazioni.services.UtenteService;

@Component
@Order(1)
public class EdificioRunner implements CommandLineRunner {
	
	@Autowired PrenotazioneService prenotazione;
	@Autowired UtenteService utente;
	@Autowired PostazioneService postazione;
	
	@Override
	public void run(String... args) throws Exception {
		
		Edificio edificio1 = postazione.creaEdificio("Hotel", "Via dei pioppi, 3", "Ravenna");
		postazione.saveEdificio(edificio1);
		
	}
	
	

}
