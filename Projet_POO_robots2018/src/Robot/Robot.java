package Robot;

import Surroundings.*;
import Enums.*;

public abstract class Robot {
	private Case position;
	private int volumeTotal;
	private double vitesse;
	
	public Case getPosition() 
	{
		return this.position;
	}
	
	public void setPosition(Case x) 
	{
		this.position = x; 
	}
	
	public void setVitesse(double vit)
	{
		this.vitesse = vit;
	}
	
	public double getVitesse()
	{
		return this.vitesse;
	}
	
	
	
	public void setVolume(int vol)
	{
		this.volumeTotal=vol;
	}
	
	public int getVolume()
	{
		return this.volumeTotal;
	}
	
	public abstract double getVitesse(NatureTerrain nature);
	
	public abstract void remplirReservoir();
	
	public abstract void deverserEau(int volume);
}
