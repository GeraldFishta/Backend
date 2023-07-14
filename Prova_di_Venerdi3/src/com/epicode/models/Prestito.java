package com.epicode.models;

import java.time.LocalDate;

public class Prestito {

	private Utenti utente;
	private Catalogo_Bibliotecario elementoPrestato;
	private LocalDate inizioPrestito;
	private LocalDate dataRestituzionePrevista;
	private LocalDate dataRestituzioneEffetiva;
	
	public Prestito() {
		super();
	}

	public Prestito(Utenti utente, Catalogo_Bibliotecario elementoPrestato, LocalDate inizioPrestito,
			LocalDate dataRestituzionePrevista, LocalDate dataRestituzioneEffetiva) {
		super();
		this.utente = utente;
		this.elementoPrestato = elementoPrestato;
		this.inizioPrestito = inizioPrestito;
		this.dataRestituzionePrevista = dataRestituzionePrevista;
		this.dataRestituzioneEffetiva = dataRestituzioneEffetiva;
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
		return dataRestituzioneEffetiva;
	}

	public void setDataRestituzioneEffetiva(LocalDate dataRestituzioneEffetiva) {
		this.dataRestituzioneEffetiva = dataRestituzioneEffetiva;
	}
	
	
	
	
}
