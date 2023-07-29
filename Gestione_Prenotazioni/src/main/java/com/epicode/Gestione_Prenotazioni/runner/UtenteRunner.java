package com.epicode.Gestione_Prenotazioni.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.epicode.Gestione_Prenotazioni.classes.Utente;
import com.epicode.Gestione_Prenotazioni.services.UtenteService;

@Component
@Order(3)
public class UtenteRunner implements CommandLineRunner {

	@Autowired UtenteService utente;

	@Override
	public void run(String... args) throws Exception {
	
		Utente utente1 = utente.creaUtente("oldboy7", "Gennaro Piccoli", "genna@gmail.com");
		utente.saveUtente(utente1);
		
		
	}
	

	
}
