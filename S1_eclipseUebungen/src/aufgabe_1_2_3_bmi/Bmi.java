package aufgabe_1_2_3_bmi;

import java.util.Scanner;

public class Bmi {

	public static void main(String[] args) {
		System.out.println("Körpergröße (in cm): ");
		Scanner scanner = new Scanner(System.in);
		double groesse = scanner.nextDouble();
		double mgroesse = groesse / 100;

		System.out.println("Körpergewicht (in kg): ");
		Scanner scanner2 = new Scanner(System.in);
		double gewicht = scanner2.nextDouble();

		System.out.println("Geschlecht: ");
		Scanner scanner3 = new Scanner(System.in);
		String geschlecht = scanner3.nextLine();

		double number = gewicht / (mgroesse * mgroesse);

		System.out.println("Ihr BMI beträgt: " + (int) number);

		if (geschlecht.equals("männlich")) {

			if (number < 20.00) {
				System.out.println("Sie haben Untergewicht");
			}
			if (number >= 20.00 && number <= 25.00) {
				System.out.println("Sie haben Normalgewicht");
			}
			if (number > 25.00) {
				System.out.println("Sie haben Übergewicht");
			}

		}
		if (geschlecht.equals("weiblich")) {
			if (number < 19.00) {
				System.out.println("Sie haben Untergewicht");
			}
			if (number >= 19.00 && number <= 24.00) {
				System.out.println("Sie haben Normalgewicht");
			}
			if (number > 24.00) {
				System.out.println("Sie haben Übergewicht");
			}
		}

	}

}
