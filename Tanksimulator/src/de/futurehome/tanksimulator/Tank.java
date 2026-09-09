package de.futurehome.tanksimulator;
public class Tank {
	
	private double fuellstand;
	private double maxFuellstand;

	public Tank(double fuellstand, double maxFuellstand) {
		this.fuellstand = fuellstand;
		this.maxFuellstand = maxFuellstand;
	}

	public double getFuellstand() {
		return fuellstand;
	}

	public void setFuellstand(double fuellstand) {
		this.fuellstand = fuellstand;
	}
	
	public double getmaxFuellstand() {
		return maxFuellstand;
	}

	public void setmaxFuellstand(double fuellstand) {
		this.maxFuellstand = maxFuellstand;
	}
	

}
