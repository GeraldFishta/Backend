package com.epicode.Gestione_Prenotazioni.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.Gestione_Prenotazioni.classes.Edificio;
import com.epicode.Gestione_Prenotazioni.classes.Postazione;

@Configuration
public class PostazioneConfig {
	
	@Bean("postazione")
	@Scope("prototype")
	public Postazione nuovaPostazione() {
		return new Postazione();
	};
	
	@Bean("edificio")
	@Scope("prototype")
	public Edificio nuovoEdificio() {
		return new Edificio();
	}
	
	
    }