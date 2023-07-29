package com.epicode.Gestione_Prenotazioni.classes;


import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.epicode.Gestione_Prenotazioni.enums.TipoPostazione;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Builder
public class Postazione {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descrizione;
	@Enumerated(EnumType.STRING)
	private TipoPostazione tipo;
	private Integer numeroMassimoOccupanti;
	@ManyToOne
	private Edificio edificio;
	
	
	public Postazione ( String descrizione, TipoPostazione tipo, Integer numeroMassimoOccupanti, Edificio edificio) {
		super();
		
		this.descrizione = descrizione;
		this.tipo = tipo;
		this.numeroMassimoOccupanti = numeroMassimoOccupanti;
		this.edificio = edificio;
	}
	

}
