package com.epicode.Gestione_Prenotazioni.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.epicode.Gestione_Prenotazioni.classes.Postazione;
import com.epicode.Gestione_Prenotazioni.enums.TipoPostazione;
import com.epicode.Gestione_Prenotazioni.services.PostazioneService;
import com.epicode.Gestione_Prenotazioni.services.PrenotazioneService;
import com.epicode.Gestione_Prenotazioni.services.UtenteService;

@Component
@Order(2)
public class PostazioneRunner implements CommandLineRunner {

	
	@Autowired PrenotazioneService prenotazione;
	@Autowired UtenteService utente;
	@Autowired PostazioneService postazione;
	
	@Override
	public void run(String... args) throws Exception {
	
	Postazione postazione1 = postazione.creaPostazione("Stanza", TipoPostazione.PRIVATO , 4 , postazione.findEdificio(1l) );
	postazione.savePostazione(postazione1);
	
	Postazione postazione2 = postazione.creaPostazione("Hall", TipoPostazione.OPENSPACE , 40 , postazione.findEdificio(2l) );
	postazione.savePostazione(postazione2);
	
	Postazione postazione3 = postazione.creaPostazione("Villa", TipoPostazione.SALA_RIUNIONI , 105 , postazione.findEdificio(3l) );
	postazione.savePostazione(postazione3);
	
	}
}
