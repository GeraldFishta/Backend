package com.websitetry.yo;

public class Rettangolo {
	
	double altezza; 
	double base;

	public static void main(String[] args) {
		

	}
	
	public Rettangolo(double altezza, double base ) {
		
		this.altezza = altezza;
		this.base = base; 
		
	}
	
	public double calcolaArea() {
		return altezza*base;
	}
	
	public double calcolaPerimetro() {
		return (altezza + base) *2;
	}
	
	public void stampaRettangolo() {
		double area = calcolaArea();
		double perimetro = calcolaPerimetro();
		System.out.println("Area: " + area);
		System.out.println("Perimetro: " + perimetro);
	}
	
	public void stampaDueRettangoli(Rettangolo rettangolo1){
		double area = calcolaArea();
		double perimetro = calcolaPerimetro();
		double area1 = rettangolo1.calcolaArea();
		double perimetro1 = rettangolo1.calcolaPerimetro();
		System.out.println("Area: " + area);
		System.out.println("Perimetro: " + perimetro);
		System.out.println("Area1: " + area1);
		System.out.println("Perimetro1: " + perimetro1);
		System.out.println("Somma delle aree: " + (area + area1));
		System.out.println("Somma dei perimetri: " + (perimetro + perimetro1));
		
	}
	
}
