package Robot;
import Enums.*;
import Surroundings.*;

public class RobotAChenille extends Robot
{
	public RobotAChenille(Case caseDepart)
	{
		this.setPosition(caseDepart);
		this.setVolume(2000);
	}
	
	
	public double getVitesse(NatureTerrain nature) 
	{
		double vit=this.getVitesse();
		switch(nature)
		{
		case FORET:
			vit/=2; 
			break;
		case EAU : 
			vit=0;
			break;
		case ROCHE :
			vit=0;
		default : 
			break;	
		}
		return vit;
	}
	
	
	public void remplirReservoir() // 30 min pour le remplir entierement -- 333.33 L / min
	{
		
	}
	
	
	public void deverserEau(int volume) 
	{
		
	}
}
