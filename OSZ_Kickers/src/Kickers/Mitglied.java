package Kickers;

public class Mitglied {
	private String name;
	private String telNummer;
	private boolean hatBeitragBezahlt;
	
	public Mitglied() {
		this.name = "";
		this.telNummer = "";
		this.hatBeitragBezahlt = false;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setTelNummer(String telNummer) {
		this.telNummer = telNummer;
	}
	public String getTelNummer() {
		return telNummer;
	}
	
	public void setHatBeitragBezahlt(Boolean hatBeitragBezahlt) {
		this.hatBeitragBezahlt = hatBeitragBezahlt;
	}
	public boolean getHatBeitragBezahlt() {
		return hatBeitragBezahlt;
	}
	
	
	
	
	
	
}
