package Duplicazioni;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main_Project {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Inserisci il numero di parole da inserire all'interno del set: ");
	        int numeroParole = scanner.nextInt();

	        Set<String> setParole = new HashSet<String>();
	        Set<String> setDuplicati = new HashSet<String>();

	        System.out.println("Inserisci le parole da mettere: ");
	        
	        for (int i = 0; i < numeroParole; i++) {
	        	String parola = scanner.next();
	        	
	        	if(!setParole.contains(parola)) {
	        		setParole.add(parola);
	        	} else {
	        		setDuplicati.add(parola);
	        	}
	        }
	        
	        System.out.println("Stampa parole duplicate: ");
	        System.out.println(setDuplicati.toString());
	        
	        System.out.println("Numero di parole distante: " + setParole.size());
	        
	        System.out.println("Stampa parole distinte tra di loro: ");
	        System.out.println(setParole.toString());
		        
	        
	}

}
