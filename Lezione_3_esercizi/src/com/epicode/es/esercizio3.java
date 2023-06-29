package com.epicode.es;

import java.util.Scanner;

public class esercizio3 {

	public void suddividiStringa() {
		
		Scanner scanner = new Scanner(System.in);
		String input; 
		
		do {
			System.out.print("Inserisci una stringa, o :q oer uscire dal programma: ");
			input = scanner.nextLine();
		
			if (!input.equals(":q")) {
				String[] caratteri = input.split("");
				
				System.out.print("Caratteri separati da virgola: "); 
				for (int i = 0; i < caratteri.length; i++) {
					System.out.print(caratteri[i]);
					
					if(i < caratteri.length - 1) {
						System.out.print(", ");
					}
				}
			System.out.println();
		}
		} while (!input.equals(":q"));
		
	
}
}