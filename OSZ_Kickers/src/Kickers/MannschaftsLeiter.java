package Kickers;

public class MannschaftsLeiter extends Spieler {
	private String nameMannschaft;
	private int rabatt;
	
	public MannschaftsLeiter(){
		super();
		this.nameMannschaft = "";
		this.rabatt = 0;
	}
	
	public void setNameMannschaft(String nameMannschaft) {
		this.nameMannschaft = nameMannschaft;
	} 
	
	public String getNameMannschaft() {
		return nameMannschaft;
	}

	public int getRabatt() {
		return rabatt;
	}

	public void setRabatt(int rabatt) {
		this.rabatt = rabatt;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
}
