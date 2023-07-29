package com.epicode.Gestione_Prenotazioni.classes;

import java.time.LocalDate;

import com.epicode.Gestione_Prenotazioni.enums.TipoPostazione;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Builder
public class Prenotazione {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate data;
	
	@ManyToOne
	private Utente utente;
	
	@ManyToOne
	private Postazione postazione;

	public Prenotazione(LocalDate data, Utente utente, Postazione postazione) {
		super();
		this.data = data;
		this.utente = utente;
		this.postazione = postazione;
	}

}
