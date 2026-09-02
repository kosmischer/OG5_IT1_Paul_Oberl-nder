package aufgabe_1_2_2_sum;

import java.util.Scanner;
//UNFINISHED!!!!!
public class Sum {

	public static void main(String[] args) {
		System.out.println("Eingabe: ");
		Scanner scanner = new Scanner(System.in);
		int eingabe = scanner.nextInt();
		int doppelt = eingabe*2;
		int zahl = 0;
		for (int i = 2; i <= doppelt; i+=2) {
			zahl += 2 * i;
		}
		System.out.println(zahl);
	}

}
