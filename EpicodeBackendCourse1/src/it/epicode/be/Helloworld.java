package it.epicode.be;

import java.util.Scanner;

public class Helloworld {

public static void main (String[] args)
		{
		// Stampa a console  la frase
		System.out.println("This is my first Epicode Java Project!");
		System.out.println(moltiplicazioni(7, 3)); 
		System.out.println(conc("stringa", 23));
		System.out.println(InserisciInArray());
		System.out.println(perimetroRettangolo(2,4));
		System.out.println(pariDispari(7));
		System.out.println(perimetroTriangolo(1, 3, 5.4));
		}
// Esercizio #2

public static int moltiplicazioni (int x, int y) {
	
	int result = x * y;
	return result;
	
}


public static String conc(String x, int y) {
	
	String result = x + " " + y;
	return result;
	
}




//Esercizio #3

public static String InserisciInArray(){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Inserisci qua la prima stringa ");
	String firstString = sc.nextLine();
	System.out.print("Inserisci qua la tua seconda stringa ");
	String secondString = sc.nextLine();
	System.out.println("Inserisci qua la terza Stringa ");
	String thirdString = sc.nextLine();
	return  firstString + secondString + thirdString;
	
}

//Esercizio #4 

public static double perimetroRettangolo(double x, double y ){
	
	double result = ( x * y );
	return result;
	
}


public static int pariDispari (int x) {
	
	if (x % 2 == 0) {
		return 0;
	} else {
		return 1; 
	}

}


public static double perimetroTriangolo (double a, double b, double c) {
	
	
	double semiperimetro = (a + b + c) / 2.0;
    double area = Math.sqrt(semiperimetro * (semiperimetro - a) * (semiperimetro - b) * (semiperimetro - c));
    return area;
	
}



}





