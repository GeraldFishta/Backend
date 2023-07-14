package com.epicode.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public abstract class Catalogo_Bibliotecario {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	public String codice_ISBN;
	public String titolo;
	public Integer annoPubblicazione;
	public Integer numeroPagine;
	
	
	
	public Catalogo_Bibliotecario() {
		super();
	}



	public Catalogo_Bibliotecario(String codice_ISBN, String titolo, Integer annoPubblicazione, Integer numeroPagine) {
		super();
		this.codice_ISBN = codice_ISBN;
		this.titolo = titolo;
		this.annoPubblicazione = annoPubblicazione;
		this.numeroPagine = numeroPagine;
	}



	public String getCodice_ISBN() {
		return codice_ISBN;
	}



	public void setCodice_ISBN(String codice_ISBN) {
		this.codice_ISBN = codice_ISBN;
	}



	public String getTitolo() {
		return titolo;
	}



	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}



	public Integer getAnnoPubblicazione() {
		return annoPubblicazione;
	}



	public void setAnnoPubblicazione(Integer annoPubblicazione) {
		this.annoPubblicazione = annoPubblicazione;
	}



	public Integer getNumeroPagine() {
		return numeroPagine;
	}



	public void setNumeroPagine(Integer numeroPagine) {
		this.numeroPagine = numeroPagine;
	}
	
	
	
	

}
