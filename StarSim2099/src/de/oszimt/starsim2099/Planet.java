package de.oszimt.starsim2099;

/**
 * Write a description of class Planet here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Planet {

	private int anzahlHafen;
	private String name;
	private double posX;
	private double posY;
	
	 public Planet() {
	    }

	    
	    public int getAnzahlHafen() {
	        return anzahlHafen;
	    }
	    public void setAnzahlHafen(int anzahlHafen) {
	        this.anzahlHafen = anzahlHafen;
	    }

	   
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }

	    
	    public double getPosX() {
	        return posX;
	    }
	    public void setPosX(double posX) {
	        this.posX = posX;
	    }

	    
	    public double getPosY() {
	        return posY;
	    }
	    public void setPosY(double posY) {
	        this.posY = posY;
	    }

	// Darstellung
	public static char[][] getDarstellung() {
		char[][] planetShape = { { '\0', '/', '*', '*', '\\', '\0' }, { '|', '*', '*', '*', '*', '|' },
				{ '\0', '\\', '*', '*', '/', '\0' } };
		return planetShape;

	}
}
