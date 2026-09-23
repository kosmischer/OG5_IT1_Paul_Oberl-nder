package de.oszimt.starsim2099;

/**
 * Write a description of class Ladung here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ladung {

	private String typ;
	private int masse;
	private double posX;
	private double posY;

	 public Ladung() {
	    }


	    
	    public String getTyp() {
	        return typ;
	    }
	    public void setTyp(String typ) {
	        this.typ = typ;
	    }

	   
	    public int getMasse() {
	        return masse;
	    }
	    public void setMasse(int masse) {
	        this.masse = masse;
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
		char[][] ladungShape = { { '/', 'X', '\\' }, { '|', 'X', '|' }, { '\\', 'X', '/' } };
		return ladungShape;
	}
}