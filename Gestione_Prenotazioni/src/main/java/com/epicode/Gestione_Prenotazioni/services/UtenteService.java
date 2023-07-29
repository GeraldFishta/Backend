package com.epicode.Gestione_Prenotazioni.services;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.epicode.Gestione_Prenotazioni.classes.Prenotazione;
import com.epicode.Gestione_Prenotazioni.classes.Utente;
import com.epicode.Gestione_Prenotazioni.repository.UtenteRepository;


@Service
public class UtenteService {
	
	@Autowired UtenteRepository utenteRepo;
	@Autowired @Qualifier("utente") private ObjectProvider<Utente> utenteProvider;
	
	public Utente creaUtente(String username, String nomeCompleto, String email) {
		return utenteProvider.getObject().builder()
				.username(username)
				.nomeCompleto(nomeCompleto)
				.email(email)
				.build();
		
	}

	public void saveUtente(Utente utente) {
		
		utenteRepo.save(utente);
		System.out.println(utente);
		
	}
	
	public Utente findUtente(String id) {
		
		return utenteRepo.findById(id).get();
		
	}
	
}
