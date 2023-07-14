package com.epicode.models;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table( name = "prestiti")
public class Prestito implements Serializable {
	
	@Id
	@ManyToOne
	private Utenti utente;
	@ManyToOne
	private Catalogo_Bibliotecario elementoPrestato;
	@Column ( name = "inizio_prestito")
	private LocalDate inizioPrestito;
	@Column ( name = "data_di_restituzione_prevista")
	private LocalDate dataRestituzionePrevista;
	@Column ( name = "data_di_restituzione_effettiva")
	private LocalDate dataRestituzioneEffettiva;
	
	public Prestito() {
		super();
	}

	public Prestito(Utenti utente, Catalogo_Bibliotecario elementoPrestato, LocalDate inizioPrestito,
			LocalDate dataRestituzionePrevista, LocalDate dataRestituzioneEffetiva) {
		super();
		this.utente = utente;
		this.elementoPrestato = elementoPrestato;
		this.inizioPrestito = inizioPrestito;
		this.dataRestituzionePrevista = inizioPrestito.plusDays(30) ;
		this.dataRestituzioneEffettiva = dataRestituzioneEffetiva;
	}

	public Utenti getUtente() {
		return utente;
	}

	public void setUtente(Utenti utente) {
		this.utente = utente;
	}

	public Catalogo_Bibliotecario getElementoPrestato() {
		return elementoPrestato;
	}

	public void setElementoPrestato(Catalogo_Bibliotecario elementoPrestato) {
		this.elementoPrestato = elementoPrestato;
	}

	public LocalDate getInizioPrestito() {
		return inizioPrestito;
	}

	public void setInizioPrestito(LocalDate inizioPrestito) {
		this.inizioPrestito = inizioPrestito;
	}

	public LocalDate getDataRestituzionePrevista() {
		return dataRestituzionePrevista;
	}

	public void setDataRestituzionePrevista(LocalDate dataRestituzionePrevista) {
		this.dataRestituzionePrevista = dataRestituzionePrevista;
	}

	public LocalDate getDataRestituzioneEffetiva() {
		return dataRestituzioneEffettiva;
	}

	public void setDataRestituzioneEffetiva(LocalDate dataRestituzioneEffetiva) {
		this.dataRestituzioneEffettiva = dataRestituzioneEffetiva;
	}
	
	
	
	
}
