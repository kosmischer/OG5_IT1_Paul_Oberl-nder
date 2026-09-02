package aufgabe_1_1_5_dna;

import java.util.Scanner;

public class Dna {

	public static void main(String[] args) {
		while (true) {
		Scanner scanner = new Scanner(System.in);
		String eingabe = scanner.nextLine();
		char[] string = new char[eingabe.length()];
		
		for(int i = 0; i<eingabe.length();i++) {
			if(eingabe.charAt(i) == 'A') {
				string[i] = 'T';
			}
			if(eingabe.charAt(i) == 'T') {
				string[i] = 'A';
			}
			if(eingabe.charAt(i) == 'C') {
					string[i] = 'G';
			}
			if(eingabe.charAt(i) == 'G') {
						string[i] = 'C';
			}
			
		}
		
		System.out.println(string);
		
	}
		}

}
