package com.epicode.models;

import javax.persistence.Entity;

@Entity
public class Libro extends Catalogo_Bibliotecario {
	
	private String autore;
	private String genere;
	
	
	public Libro() {
		super();
	}


	public Libro(String codice_ISBN, String titolo, Integer annoPubblicazione, Integer numeroPagine, String autore, String genere) {
		super(codice_ISBN, titolo, annoPubblicazione, numeroPagine);
		this.autore = autore;
		this.genere = genere;
	}


	public String getAutore() {
		return autore;
	}


	public void setAutore(String autore) {
		this.autore = autore;
	}


	public String getGenere() {
		return genere;
	}


	public void setGenere(String genere) {
		this.genere = genere;
	}


	@Override
	public String toString() {
		return "Libro [autore=" + autore + ", genere=" + genere + "]";
	}
	
	
	

}
