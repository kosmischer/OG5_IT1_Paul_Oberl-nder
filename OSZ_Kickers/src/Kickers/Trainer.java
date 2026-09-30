package Kickers;

public class Trainer {
	private char lizenzKlasse;
	private int aufwandentschädigung;
	
	public Trainer() {
		super();
		this.lizenzKlasse = '0';
		this.aufwandentschädigung = 0;
	}

	public char getLizenzKlasse() {
		return lizenzKlasse;
	}

	public void setLizenzKlasse(char lizenzKlasse) {
		this.lizenzKlasse = lizenzKlasse;
	}

	public int getAufwandentschädigung() {
		return aufwandentschädigung;
	}

	public void setAufwandentschädigung(int aufwandentschädigung) {
		this.aufwandentschädigung = aufwandentschädigung;
	}

	
}
