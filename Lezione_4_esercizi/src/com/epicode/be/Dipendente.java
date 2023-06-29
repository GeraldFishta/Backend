package com.epicode.be;

public class Dipendente {

	 	private static double stipendioBase = 1000;
	    private String matricola;
	    private double stipendio;
	    private double importoOrarioStraordinario;
	    private Livello livello;
	    private Dipartimento dipartimento;
	    
	    
		public double getImportoOrarioStraordinario() {
			return this.importoOrarioStraordinario;
		}
		public Dipartimento getDipartimento() {
			return this.dipartimento;
		}
		public static double getStipendioBase() {
			return stipendioBase;
		}
		public String getMatricola() {
			return this.matricola;
		}
		public double getStipendio() {
			return this.stipendio;
		}
		public Livello getLivello() {
			return this.livello;
		}
		public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
			this.importoOrarioStraordinario = importoOrarioStraordinario;
		}
		public void setDipartimento(Dipartimento dipartimento) {
			this.dipartimento = dipartimento;
		}
	    
	    public Dipendente(String matricola, Dipartimento dipartimento ) {
	    	
	    	this.matricola = matricola;
	    	this.dipartimento = dipartimento;
	    	this.stipendio = stipendioBase;
	    	this.importoOrarioStraordinario = 30;
	    	this.livello = Livello.OPERAIO; 
	    }
	    
	    public Dipendente(String matricola, double stipendio, double importoOrarioStraordinario, Livello livello, Dipartimento dipartimento) {
	    	this.matricola = matricola; 
	    	this.stipendio = stipendio; 
	    	this.importoOrarioStraordinario = importoOrarioStraordinario; 
	    	this.livello = livello; 
	    	this.dipartimento = dipartimento; 
	    }
	    
	    public void stampaDatiDipendenti() {
	    	System.out.println("Matricola: " + matricola);
	    	System.out.println("Stipendio: " + stipendio);
	    	System.out.println("Importo dell'orario straordinario: " + importoOrarioStraordinario );
	    	System.out.println("Livello: " + livello);
	    	System.out.println("Dipartimento: " + dipartimento);
	    }
	    
	    public Livello promuovi() {
	    	
	    	switch(livello) {
	    	case OPERAIO:
	    		this.livello = Livello.IMPIEGATO;
	    		this.stipendio = stipendioBase * 1.2;
	    		break;
	    	case IMPIEGATO:
	    		this.livello = Livello.QUADRO;
	    		this.stipendio = stipendioBase * 1.5;
	    		break; 
	    	case QUADRO:
	    		this.livello = Livello.DIRIGENTE;
	    		this.stipendio = stipendioBase *2;
	    		break;
	    	case DIRIGENTE: 
	    		System.out.println("Il dipendente e gia un dirigente.");
	    		break;
	    	}
	    	return this.livello;
	    }
	    
	    public static double calcolaPaga(Dipendente dipendente) {
	    	return dipendente.stipendio;
	    }
	    
	    public static double calcolaPaga (Dipendente dipendente, int oreStraordinario) {
	    	double stipendioStraordinario = dipendente.importoOrarioStraordinario*oreStraordinario;
	    	return dipendente.stipendio + stipendioStraordinario;
	    }
	    	
	    }
	    
	    

