package com.epicode.es;

public class Main_Class {

	public static void main(String[] args) {
		

        String input = "esempio";
        
        boolean isPari = Esercizio1.stringaPariDispari(input);
        System.out.println("La stringa ha una lunghezza pari? " + isPari);

        int anno = 2024;
        
        boolean isBisestile = Esercizio1.annoBisestile(anno);
        System.out.println("L'anno " + anno + " è bisestile? " + isBisestile);

        esercizio2.convertitoreNumeri();
		
        esercizio3 esercizio3 = new esercizio3();
        esercizio3.suddividiStringa();

	}

}
