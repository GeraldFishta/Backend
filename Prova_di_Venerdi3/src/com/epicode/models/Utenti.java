package com.epicode.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Utenti {
	
	private String nome;
	private String cognome;
	@Column( name = "data_di_nascita")
	private LocalDate dataDiNascita;
	@Id
	@Column( name = "numero_della_tessera")
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


	@Override
	public String toString() {
		return "Utenti [nome=" + nome + ", cognome=" + cognome + ", dataDiNascita=" + dataDiNascita
				+ ", numeroDiTessera=" + numeroDiTessera + "]";
	}
	
	

}
