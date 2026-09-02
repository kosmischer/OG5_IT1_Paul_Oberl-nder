package aufgabe_1_2_4_primzahljava;

import java.util.Scanner;

public class Primzahl {

	public static void main(String[] args) {
		while(true) {
		Scanner scanner = new Scanner(System.in);
		double eingabe = scanner.nextDouble();
		boolean pruefung = false;
		if(eingabe==1) {
			System.out.println("1 ist NATÜRLICH keine Primzahl :)");
		}
		for(int i = 2; i<eingabe;i++) {
			if(eingabe % i == 0) {
				System.out.println(eingabe + " ist keine Primzahl, sie ist mindestens durch " + i + " teilbar");
				pruefung = true;
				break;
			}
			
		}
		if(pruefung == false && eingabe!= 1) {
			System.out.println(eingabe + " ist eine Primzahl!");
		}

	}
	}
}
