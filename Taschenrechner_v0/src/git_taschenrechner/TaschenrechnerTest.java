package git_taschenrechner;

import java.util.Scanner;

public class TaschenrechnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myScanner = new Scanner(System.in);
		
		Taschenrechner ts = new Taschenrechner();

		
		int swValue;

		// Display menu graphics
		System.out.println("============================");
		System.out.println("|   MENU SELECTION DEMO    |");
		System.out.println("============================");
		System.out.println("| Options:                 |");
		System.out.println("|        1. Addieren       |");
		System.out.println("|        2. Subtrahieren   |");
		System.out.println("|        3. Dividieren     |");
		System.out.println("|        4. Dividieren     |");
		System.out.println("|        5. Exit           |");
		System.out.println("============================");
		System.out.print(" Select option: ");
		swValue = myScanner.next().charAt(0);
		
		System.out.println("Please enter the two Numbers (make sure to seperate them with enter)");
		
		double n1 = myScanner.nextDouble();
		double n2 = myScanner.nextDouble();
		
	
		switch (swValue) {
		case '1':
			System.out.println( n1 + " + " + n2 + " = " + ts.add(n1, n2));
		case '2':
			System.out.println( n1 + " - " + n2 + " = " + ts.sub(n1, n2));
		case '3':
			System.out.println( n1 + " x " + n2 + " = " + ts.mul(n1, n2));
			break;
		case '4':
			System.out.println( n1 + " : " + n2 + " = " + ts.div(n1, n2));
			break;
		case '5':
			System.out.println("Bye!");
			break;
		default:
			System.out.println("Invalid selection");
			break; // This break is not really necessary
		}

	}

}