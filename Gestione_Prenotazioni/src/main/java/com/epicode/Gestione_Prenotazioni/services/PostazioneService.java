package com.epicode.Gestione_Prenotazioni.services;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.epicode.Gestione_Prenotazioni.classes.Edificio;
import com.epicode.Gestione_Prenotazioni.classes.Postazione;
import com.epicode.Gestione_Prenotazioni.classes.Utente;
import com.epicode.Gestione_Prenotazioni.enums.TipoPostazione;
import com.epicode.Gestione_Prenotazioni.repository.EdificioRepository;
import com.epicode.Gestione_Prenotazioni.repository.PostazioneRepository;

@Service
public class PostazioneService {

	@Autowired @Qualifier("postazione") private ObjectProvider<Postazione> postazioneProvider;
	@Autowired PostazioneRepository postazioneRepo;
	@Autowired EdificioRepository edificioRepo;
	
	public Postazione creaPostazione(String descrizione,TipoPostazione tipo, Integer numeroMassimoOccupanti, Edificio edificio) {
		return postazioneProvider.getObject().builder()
				.descrizione(descrizione)
				.tipo(tipo)
				.numeroMassimoOccupanti(numeroMassimoOccupanti)
				.edificio(edificio)
				.build();
		
	}
	
@Autowired @Qualifier("edificio") private ObjectProvider<Edificio> edificioProvider;
	
	public Edificio creaEdificio( String nome, String indirizzo, String citta) {
		return edificioProvider.getObject().builder()
				.nome(nome)
				.indirizzo(indirizzo)
				.citta(citta)
				.build();
		
	}
	
	public void savePostazione(Postazione postazione) {
		
		postazioneRepo.save(postazione);
		System.out.println(postazione);
		
	}
	
	public void saveEdificio(Edificio edificio) {
		
		edificioRepo.save(edificio);
		System.out.println(edificio);
		
	}
	
	public Postazione findPostazione(Long id) {
		
		return postazioneRepo.findById(id).get();
		
	}
	
	public Edificio findEdificio(Long id) {
			
			return edificioRepo.findById(id).get();
			
		}
	
}
