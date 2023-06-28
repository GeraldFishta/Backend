package com.epicode.es;

public class Esercizio1 {

	public static boolean stringaPariDispari(String input) {
		
		int lunghezza = input.length();
		
		if (lunghezza % 2 == 0 ) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public static boolean annoBisestile(int anno) {
		
		if (anno % 4 == 0 || anno % 100 == 0 && anno % 400 == 0){
			return true;
		}else {
			return false;
		}
		}
		
	}
	
