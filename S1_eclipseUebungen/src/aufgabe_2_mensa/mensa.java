package aufgabe_2_mensa;

import java.util.Scanner;

public class mensa {

	public static void main(String[] args) {

		double pommesPreis = 1.50;
		double durstloescherPreis = 1.29;
		double geld = 5.00;

		System.out.println("Bitte geben Sie die Anzahl der Pommes an: ");
		Scanner scanner1 = new Scanner(System.in);
		int anzahlPommes = scanner1.nextInt();

		System.out.println("Bitte geben Sie die Anzahl der Durstlöscher an: ");
		Scanner scanner2 = new Scanner(System.in);
		int anzahlDurstloescher = scanner2.nextInt();

		double preis = anzahlPommes * pommesPreis + anzahlDurstloescher * durstloescherPreis;

		System.out.println("Der einkauf kostet: " + (anzahlPommes * 1.50 + anzahlDurstloescher * 1.29) + " Euro.");

		if (preis > geld) {
			System.out.println("Das Geld reicht leider nicht!");
		} else {
			System.out.println("Hier sind " + (geld - preis) + " zurück! Danke für ihren Einkauf!");
		}

	}

}
