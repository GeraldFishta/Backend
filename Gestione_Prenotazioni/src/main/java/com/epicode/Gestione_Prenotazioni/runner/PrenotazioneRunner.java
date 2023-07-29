package com.epicode.Gestione_Prenotazioni.runner;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.epicode.Gestione_Prenotazioni.classes.Prenotazione;
import com.epicode.Gestione_Prenotazioni.classes.Utente;
import com.epicode.Gestione_Prenotazioni.services.PostazioneService;
import com.epicode.Gestione_Prenotazioni.services.PrenotazioneService;
import com.epicode.Gestione_Prenotazioni.services.UtenteService;

@Component
@Order(4)
public class PrenotazioneRunner implements CommandLineRunner {

	@Autowired PrenotazioneService prenotazione;
	@Autowired UtenteService utente;
	@Autowired PostazioneService postazione;

	@Override
	public void run(String... args) throws Exception {
	
		Prenotazione prenotazione1 = prenotazione.creaPrenotazione(LocalDate.of(2023, 07, 22), utente.findUtente("oldboy7") , postazione.findPostazione(1l));
		prenotazione.savePrenotazione(prenotazione1);
		
	}
	

	
}
