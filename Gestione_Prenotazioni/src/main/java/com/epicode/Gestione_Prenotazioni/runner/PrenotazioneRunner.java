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
		
		Prenotazione prenotazione2 = prenotazione.creaPrenotazione(LocalDate.of(2023, 07, 22), utente.findUtente("youngboy6") , postazione.findPostazione(1l));
		prenotazione.savePrenotazione(prenotazione2);
		
		Prenotazione prenotazione3 = prenotazione.creaPrenotazione(LocalDate.of(2023, 05, 24), utente.findUtente("averageboy5") , postazione.findPostazione(2l));
		prenotazione.savePrenotazione(prenotazione3);
		
		Prenotazione prenotazione4 = prenotazione.creaPrenotazione(LocalDate.of(2023, 06, 23), utente.findUtente("youngboy6") , postazione.findPostazione(2l));
		prenotazione.savePrenotazione(prenotazione4);
		
		Prenotazione prenotazione5 = prenotazione.creaPrenotazione(LocalDate.of(2023, 10, 18), utente.findUtente("oldboy7") , postazione.findPostazione(3l));
		prenotazione.savePrenotazione(prenotazione5);
		
	}

	
}
