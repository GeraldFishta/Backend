package Esercizio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main_project {

	public static void main(String[] args) {
		
		
		
		randomizer();
		
		
		
	}
	
	private static void randomizer() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci un numero: ");
		int numero = Integer.parseInt(scanner.nextLine());
		
		inverseList(arrayList(numero));
		pariODispari(arrayList(numero), true);
		
	}

	private static List<String> arrayList(int numero) {
		
		Random random = new Random();
		List<String> Lista = new ArrayList<String>();
		
		for (int i = 0; i < numero ; i++ ) {
			int numeroRandom = random.nextInt(101);
			
			Lista.add(Integer.toString(numeroRandom));
		}
		return Lista;
		
	}
	
	private static void inverseList(List<String> Lista) {
		
		 Collections.reverse(Lista);
		 System.out.print("Elementi in reverse: ");
	        printElements(Lista);
	}
	
	  public static void printElements(List<String> lista){
	        for (int i = 0; i < lista.size(); i++) {
	            System.out.print(lista.get(i) + " ");
	        }
	        
	     }
	  
	  
	  private static void pariODispari( List<String> Lista, boolean condizione) {
		  
		 
			  
		  String posizione;
		  
		    if (condizione == true) {
		        posizione = "pari";
		    } else {
		        posizione = "dispari";
		    }
		    System.out.println("Valori in posizione " + posizione + ":");

		    int indice;
		    
		    if (condizione) {
		        indice = 0;
		    } else {
		        indice = 1;
		    }
		    
		    for (int i = indice; i < Lista.size(); i += 2) {
		        System.out.println(Lista.get(i));
		    }	  
			  
		  
  }
}


