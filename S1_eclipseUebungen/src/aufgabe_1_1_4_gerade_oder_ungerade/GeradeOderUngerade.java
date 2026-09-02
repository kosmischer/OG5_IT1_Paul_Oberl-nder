package aufgabe_1_1_4_gerade_oder_ungerade;

import java.util.Scanner;

public class GeradeOderUngerade {

	public static void main(String[] args) {
		System.out.println("Zu prüfende Zahl: ");
		Scanner scanner = new Scanner(System.in);
		double eingabe = scanner.nextDouble();
		System.out.println(gerade_oder_ungerade(eingabe));

	}

	public static String gerade_oder_ungerade(double number) {
		String gerade = "Gerade";
		String ungerade = "Ungerade";
		if (number % 2 == 0) {
			return gerade;
		} else {
			return ungerade;
		}

	}
}
