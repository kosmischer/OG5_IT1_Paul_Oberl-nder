package aufgabe_1_2_5_quotsubjava;

import java.util.Scanner;

public class quotsub {
//unfinished!!!!
	public static void main(String[] args) {
		System.out.println("geben sie bitte den Zähler ein");
		Scanner scanner = new Scanner(System.in);
		int zaehler = scanner.nextInt();
		System.out.println("geben sie bitte den Nenner ein");
		Scanner scanner2 = new Scanner(System.in);
		int nenner = scanner2.nextInt();
		
		int quotient= 0;
		int zeahler2 = zaehler;
		
		for(int i=zaehler;i<=0;i-=nenner) {
			zeahler2-=nenner;
			quotient+=1;
		}
		System.out.println("quotient: " + quotient);
		System.out.println("rest: " + zeahler2);

	}

}
