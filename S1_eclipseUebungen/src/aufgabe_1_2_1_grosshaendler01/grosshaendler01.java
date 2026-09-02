package aufgabe_1_2_1_grosshaendler01;

import java.util.Scanner;

public class grosshaendler01 {
	public static void main(String[] args) {
		System.out.println("Anzahl der Mäuse: ");
		Scanner scanner = new Scanner(System.in);
		double anzahl = scanner.nextDouble();
		
		System.out.println("Preis der Mäuse: ");
		Scanner scanner2 = new Scanner(System.in);
		double preis = scanner2.nextDouble();
		
		double extrapreis = anzahl*preis + 10.00;
		
		if(anzahl > 9) {
			System.out.println("Der preis beträgt " + anzahl*preis + " Euro");
			
		}
		else {
			System.out.println("Der preis beträgt " + extrapreis + " Euro");
		}
	
	}
}
