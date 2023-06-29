package com.epicode.es;

import java.util.Scanner;

public class esercizio2 {
	
	public static void convertitoreNumeri() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Inserisci un numero compreso tra 0 e 3: ");
		int numero = scanner.nextInt();	
		
		String numeroInLettere = stampaNumeri(numero);
			if (numeroInLettere != null) {
				System.out.println(numeroInLettere);
			} else {
				System.out.println("Valore non valido, errore!");
			}
			
		}
		
	
	public static String stampaNumeri(int numero) {
		
		switch (numero) {
		case 0: return "zero";
		case 1: return "uno";
		case 2: return "due";
		case 3: return "tre";
		default: return null;
		
		
		}
		
	}
	

}
