package Kickers;

public class Test_Kickers {

	public static void main(String[] args) {
		MannschaftsLeiter man1 = new MannschaftsLeiter();
		MannschaftsLeiter man2 = new MannschaftsLeiter();
		
		Schiedsrichter schi1 = new Schiedsrichter();
		Schiedsrichter schi2 = new Schiedsrichter();
		
		Spieler schp1 = new Spieler();
		Spieler schp2 = new Spieler();
		Spieler schp3 = new Spieler();
		
		Trainer tra1 = new Trainer();
		Trainer tra2 = new Trainer();
		
		
		man1.setName("Thomas");
		man1.setTelNummer("123");
		man1.setHatBeitragBezahlt(true);
		man1.setNameMannschaft("1. OSZ_Kickers");
		man1.setRabatt(34);
		
		man2.setName("Peter");
		man2.setTelNummer("456");
		man2.setHatBeitragBezahlt(true);
		man2.setNameMannschaft("2. OSZ_Kickers");
		man2.setRabatt(44);
		
		schi1.setName("Paul");
		schi1.setTelNummer("789");
		schi1.setHatBeitragBezahlt(true);
		schi1.setAnzSpiele(145);

		schi2.setName("Johan");
		schi2.setTelNummer("134");
		schi2.setHatBeitragBezahlt(true);
		schi2.setAnzSpiele(4);
		
		schp1.setName("Johan");
		schp1.setTelNummer("134");
		schp1.setHatBeitragBezahlt(true);
		

	}

}
