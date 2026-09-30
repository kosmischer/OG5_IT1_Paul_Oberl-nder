package Kickers;

public class Schiedsrichter extends Mitglied {
	private int anzSpiele;
	
	public Schiedsrichter() {
		super();
		this.anzSpiele = 0;
	}

	public int getAnzSpiele() {
		return anzSpiele;
	}

	public void setAnzSpiele(int anzSpiele) {
		this.anzSpiele = anzSpiele;
	}
	
	
}
