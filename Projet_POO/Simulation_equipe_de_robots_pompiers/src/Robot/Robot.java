package Robot;
import Surroundings.*;

public class Robot {
	Case caseActuelle;
	int vol;
	Case getPosition() {
		return this.caseActuelle;
	}
	void setPosition(Case x) {
		this.caseActuelle = x; 
	}
	double getVitesse(NatureTerrain nature) {
		switch(this.robotType) {
		case Drone : 
			break;
		case BotARoue :
			break;
		case BotAChen : 
			break ;
		case BotAPat : 
			break;
		}
	}
	void remplirReservoir() {
		
	}
	void deverserEau(int vol) {
		
	}
}
