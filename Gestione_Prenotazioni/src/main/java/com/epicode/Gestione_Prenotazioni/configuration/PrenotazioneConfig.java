package com.epicode.Gestione_Prenotazioni.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.Gestione_Prenotazioni.classes.Edificio;
import com.epicode.Gestione_Prenotazioni.classes.Prenotazione;

@Configuration
public class PrenotazioneConfig {

	@Bean("prenotazione")
	@Scope("prototype")
	public Prenotazione nuovaPrenotazione() {
		return new Prenotazione();
	}
	
}
