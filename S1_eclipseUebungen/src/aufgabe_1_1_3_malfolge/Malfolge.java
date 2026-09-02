package aufgabe_1_1_3_malfolge;

import java.util.Scanner;

public class Malfolge {

	public static void main(String[] args) {
		System.out.println("Malfolge: ");
		Scanner scanner = new Scanner(System.in);
		int eingabe = scanner.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(i + " * " + eingabe + " = " + i*eingabe);
		}

	}

}
