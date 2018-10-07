package Robot;

import Enums.*;
import Surroundings.Case;

public class RobotAPatte extends Robot 
{
	
	public RobotAPatte(Case caseDepart)
	{
		this.setPosition(caseDepart);
		this.setVolume(Integer.MAX_VALUE); //infini 
	}
	
	public double getVitesse(NatureTerrain nature) 
	{
		double vit=this.getVitesse();
		switch(nature)
		{
		case EAU : 
			vit=0;
			break;
		case ROCHE :
			vit=10;
		default : 
			break;	
		}
		return vit;
	}
	
	
	public void remplirReservoir() // ne se rempli jamais
	{		
	}
	
	
	public void deverserEau(int volume) 
	{
		
	}
}
