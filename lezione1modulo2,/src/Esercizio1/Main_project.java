package Esercizio1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main_project {

	public static void main(String[] args) {
		
		int[] array = new int[5];
		Random random = new Random();
		
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(10) + 1;
		}
		
		printArray(array);
		
		Scanner scanner = new Scanner(System.in);
		int index ,value; 
		
		while(true) {
			try {
				System.out.println("Inserisci un numero ( inserisci 0 per levarte): ");
				value = scanner.nextInt();		
				
				if (value == 0 ) {
					break;
				}
				
				System.out.print("Inserisci l'indice dell'elemento: ");
                index = scanner.nextInt();
				
				if(index < 0 || index >= array.length) {
					throw new IndexOutOfBoundsException("Indice fuori dai limiti indicati nell'array");
				}
				
				array[index] = value;
				printArray(array);
			}
			catch (IndexOutOfBoundsException err) {
				System.out.println("Errore: " + err.getMessage());
			} catch (Exception err) {
				System.out.println("Input di tipo non valido");
				scanner.nextLine();
			}
		  }
		}
		public static void printArray(int[] array) {
			System.out.println("Stato attuale dell'array:");
			System.out.println(Arrays.toString(array));
	}

	
}
