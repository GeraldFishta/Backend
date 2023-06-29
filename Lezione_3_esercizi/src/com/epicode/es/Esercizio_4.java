package com.epicode.es;

import java.util.Scanner;

public class Esercizio_4 {
	
	public void contoAllaRovescia() {
		
		Scanner input = new Scanner (System.in);
		System.out.print("Inserisci un numero intero per favore: ");
		int numero = input.nextInt(); 
		
		System.out.println("Conto alla rovescia: ");
		
		while (numero >= 0) {
			System.out.println(numero);
			numero--;
			
		}
		
		input.close();
	}
	
}