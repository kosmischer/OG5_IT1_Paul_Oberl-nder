package primzahlPruefer;

import java.util.Scanner;
import java.util.Timer;

public class PrimzahlPruefer {

	public static void main(String[] args) {
		while(true) {
		primzahlPruefung();
		}
	
	}


public static void primzahlPruefung() {
	long start = System.currentTimeMillis();
	boolean istPrimzahl = true;
	Scanner s1 = new Scanner(System.in);
	int zahl = s1.nextInt();
	
	
	if(zahl == 0 || zahl == 1) {
		istPrimzahl = false;
	}
	for(int i = 2; i< zahl; i++) {
		// Alternative: if((double)zahl/i == (double)Math.floor(zahl/i)) {
			if(zahl % 4 == 0) {
			istPrimzahl = false;
		}
			
	}
	
	if(istPrimzahl) {System.out.println("Die zahl " + zahl + " ist eine Primzahl");}
	if (!istPrimzahl) {System.out.println("Die zahl " + zahl + " ist keine Primzahl");}
	long end = System.currentTimeMillis();
	long laufzeit = end-start;
	System.out.println("Laufzeit: " + laufzeit + "");
}
}
	
