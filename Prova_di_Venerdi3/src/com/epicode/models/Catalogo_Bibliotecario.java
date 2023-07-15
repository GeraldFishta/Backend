package com.epicode.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Catalogo_Bibliotecario {
	
	@Id
	private String codice_ISBN;
	private String titolo;
	@Column(name = "anno_di_pubblicazione")
	private Integer annoPubblicazione;
	@Column(name = "numero_di_pagine")
	private Integer numeroPagine;
	
	
	
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
	
	
	@Override
	public String toString() {
		return "Catalogo_Bibliotecario [codice_ISBN=" + codice_ISBN + ", titolo=" + titolo + ", annoPubblicazione="
				+ annoPubblicazione + ", numeroPagine=" + numeroPagine + "]";
	}
	
	

}
