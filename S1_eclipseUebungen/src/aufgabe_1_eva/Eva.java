package aufgabe_1_eva;

import java.util.Scanner;

public class Eva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bitte geben Sie einenSatz ein: ");
		Scanner scanner = new Scanner(System.in);
		String eingabe = scanner.nextLine();
		
		System.out.println("Ihre Eingabe hat " + eingabe.length() + " Zeichen.");
		System.out.println("Ohne Leerzeichen hat ihre Eingabe " + eingabe.replace(" ", "").length() + " Zeichen.");
		
	}

}
