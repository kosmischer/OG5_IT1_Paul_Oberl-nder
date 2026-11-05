package primzahlPruefer;

import java.util.Scanner;
//import java.util.Timer;

public class PrimzahlPruefer {

	public static void main(String[] args) {
		while(true) {
		
		
		primzahlPruefung();
		
	
		
		
		}
	
	}


	public static void primzahlPruefung() {
		
		boolean istPrimzahl = true;
		Scanner s1 = new Scanner(System.in);
		long zahl = s1.nextLong();
		long start = System.currentTimeMillis();
		
		if(zahl == 0 || zahl == 1) {
			istPrimzahl = false;
			long end = System.currentTimeMillis();
			long laufzeit = end-start;
			System.out.println("Laufzeit: " + laufzeit + "");
			
		}
		else {
			for(long i = 2; i< zahl; i++) {
				// Alternative: if((double)zahl/i == (double)Math.floor(zahl/i)) {
					if(zahl % i == 0) {
					istPrimzahl = false;
					break;
				}	
			}
		}
		long end = System.currentTimeMillis();
		
		
		
		if(istPrimzahl) {System.out.println("Die zahl " + zahl + " ist eine Primzahl");}
		if (!istPrimzahl) {System.out.println("Die zahl " + zahl + " ist keine Primzahl");}
		if(zahl != 0 && zahl != 1) {
		long laufzeit = end-start;
		System.out.println("Laufzeit: " + laufzeit + "");
		}
		return;
	}
}
	
