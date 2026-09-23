package de.oszimt.starsim2099;

/**
 * Write a description of class Pilot here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pilot {

	private String name;
	private String grad;
	private Raumschiff schiff;
	private double posX;
	private double posY;
	
	public Pilot (String name, String grad, Raumschiff schiff,
			double posX, double posY) {
		this.name = name;
		this.grad = grad;
		this.schiff = schiff;
		this.posX = posX;
		this.posY = posY;
	}
	
	public Pilot () {};
	
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	
	public void setGrad(String name) {
		this.grad = grad;
	}
	public String getGrad() {
		return grad;
	}
	
	
	public void setSchiff(Raumschiff schiff) {
		this.schiff = schiff;
	}
	public Raumschiff getSchiff() {
		return schiff;
	}
	
	
	public void setPosX(double posX) {
		this.posX = posX;
	}
	public double getPosX() {
		return posX;
	}
	
	
	public void setPosY(double posY) {
		this.posY = posY;
	}
	public double getPosY() {
		return posY;
	}
	
	
	

}
