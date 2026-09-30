package Kickers;

public class Spieler extends Mitglied {
	private String trikotNummer;
	private String position;


	public Spieler() {
		super();
		this.trikotNummer = "";
		this.position = "";
	}
	
	public void setTrikotNummer(String trikotNummer) {
		this.trikotNummer = trikotNummer;
	}
	
	public String getTrikotNummer() {
		return trikotNummer;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public String getPosition() {
		return position;
	}

}
