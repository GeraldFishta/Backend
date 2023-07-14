package com.epicode.models;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.epicode.enumerated.Periodicita;

@Entity
public class Rivista extends Catalogo_Bibliotecario {

	@Enumerated(EnumType.STRING)
	Periodicita periodicita;
	
	

	public Rivista() {
		super();
	}



	public Rivista(String codice_ISBN, String titolo, Integer annoPubblicazione, Integer numeroPagine, Periodicita periodicita) {
		super(codice_ISBN, titolo, annoPubblicazione, numeroPagine);
		this.periodicita = periodicita;
	}



	public Periodicita getPeriodicita() {
		return periodicita;
	}



	public void setPeriodicita(Periodicita periodicita) {
		this.periodicita = periodicita;
	}



	@Override
	public String toString() {
		return "Rivista [periodicita=" + periodicita + "]";
	}
	
	
	
}
