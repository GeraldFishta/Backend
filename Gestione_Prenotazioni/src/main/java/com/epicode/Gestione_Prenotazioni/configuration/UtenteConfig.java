package com.epicode.Gestione_Prenotazioni.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.Gestione_Prenotazioni.classes.Utente;


@Configuration
public class UtenteConfig {

	@Bean("utente")
	@Scope("prototype")
	public Utente nuovoUtente() {
		return new Utente();
	};
	
}
