package com.epicode.Spring.main.services;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import com.epicode.Spring.main.models.Utente;
import com.epicode.Spring.main.repositories.UtentiPageableRepository;
import com.epicode.Spring.main.repositories.UtentiRepository;

import jakarta.persistence.EntityExistsException;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UtentiService {
	
	@Autowired UtentiRepository utenteRepo;
	@Autowired UtentiPageableRepository pageableUtenteRepo;
	
	@Autowired @Qualifier("getFakeUser") ObjectProvider<Utente> fakeUtenteProvider;
	
	public Utente createFakeUser() {
		return fakeUtenteProvider.getObject();
	}
	
	public void salvaUtente(Utente u) {
		
		if (utenteRepo.existsById(u.getUsername())) {
			String msg = "Errore... l'utente " + u.getName() + " " + u.getSurname() + " è già esistente nel DB!";
			throw new EntityExistsException(msg);
		}
		utenteRepo.save(u);
		log.info("Utente salvato: {}", u);
	}
	
	public void aggiornaUtente(Utente u) {	
		utenteRepo.save(u);
		log.info("Dati aggiornati: {}", u);	
	}
	
	public void eliminaUtente( String username ) {
		utenteRepo.deleteById(username);
		log.info("Utente eliminato: {}", username);
	}
	
	public Page<Utente> getAllUsers(Pageable pageable) {
		return pageableUtenteRepo.findAll(pageable);
	}

	public Utente getSingleUser(String username) {
		return utenteRepo.findById(username).get();
	}

}
