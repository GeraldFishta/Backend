package com.epicode.models;

import com.epicode.enumerated.Periodicita;

public class Rivista extends Catalogo_Bibliotecario {

	Periodicita periodicita;
	
	

	public Rivista() {
		super();
	}



	public Rivista(String codice_ISBN, String titolo, Integer annoPubblicazione, Integer numeroPagine, Periodicita periodicità) {
		super(codice_ISBN, titolo, annoPubblicazione, numeroPagine);
		this.periodicita = periodicita;
	}



	public Periodicita getPeriodicita() {
		return periodicita;
	}



	public void setPeriodicita(Periodicita periodicita) {
		this.periodicita = periodicita;
	}
	
	
	
}
