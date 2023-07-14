package com.epicode.models;

import java.time.LocalDate;

public class Utenti {
	
	private String nome;
	private String cognome;
	private LocalDate dataDiNascita;
	private Integer numeroDiTessera;
	
	
	public Utenti() {
		super();
	}


	public Utenti(String nome, String cognome, LocalDate dataDiNascita, Integer numeroDiTessera) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.dataDiNascita = dataDiNascita;
		this.numeroDiTessera = numeroDiTessera;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	public LocalDate getDataDiNascita() {
		return dataDiNascita;
	}


	public void setDataDiNascita(LocalDate dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}


	public Integer getNumeroDiTessera() {
		return numeroDiTessera;
	}


	public void setNumeroDiTessera(Integer numeroDiTessera) {
		this.numeroDiTessera = numeroDiTessera;
	}
	
	

}
