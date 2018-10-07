package Robot;
import Enums.*;
import Surroundings.Case;

public class Drone extends Robot 
{
	public Drone(Case caseDepart)
	{
		this.setPosition(caseDepart);
		this.setVolume(10000);
	}
	
	public double getVitesse(NatureTerrain nature) 
	{
		return this.getVitesse();
	}
	
	
	public void remplirReservoir() // 30 min pour le remplir entierement -- 333.33 L / min
	{
		
	}
	
	
	public void deverserEau(int volume) 
	{
		
	}
}
