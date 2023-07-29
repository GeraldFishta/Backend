package com.epicode.Gestione_Prenotazioni.services;

import java.time.LocalDate;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.epicode.Gestione_Prenotazioni.classes.Edificio;
import com.epicode.Gestione_Prenotazioni.classes.Postazione;
import com.epicode.Gestione_Prenotazioni.classes.Prenotazione;
import com.epicode.Gestione_Prenotazioni.classes.Utente;
import com.epicode.Gestione_Prenotazioni.repository.PrenotazioneRepository;

@Service
public class PrenotazioneService {
	

	@Autowired PrenotazioneRepository prenotazioneRepo;
	@Autowired @Qualifier("prenotazione") private ObjectProvider<Prenotazione> prenotazioneProvider;
	
	public Prenotazione creaPrenotazione(LocalDate data, Utente utente, Postazione postazione) {
		return prenotazioneProvider.getObject().builder()
				.data(data)
				.utente(utente)
				.postazione(postazione)
				.build();
		
	}
	
	public void savePrenotazione(Prenotazione prenotazione) {
			
			if(prenotazioneRepo.findPrenotazioneByDataAndPostazione(prenotazione.getData(), prenotazione.getPostazione()) == null) {
				if(prenotazioneRepo.findPrenotazioneByUtenteAndData(prenotazione.getUtente(), prenotazione.getData()) == null) {
					prenotazioneRepo.save(prenotazione);
					System.out.println(prenotazione);		
				}else {
					System.out.println("L'utente ha gia prenotazioni nella stessa data");
				}
			}else {
				System.out.println("Prenotazione non disponibile");
			}
			
		}
	
	

}
