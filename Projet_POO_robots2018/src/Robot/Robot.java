package Robot;

import Surroundings.*;

public class Robot {
	private Case caseActuelle;
	
	public Case getPosition() {
		return this.caseActuelle;
	}
	
	public void setPosition(Case x) {
		this.caseActuelle = x; 
	}
	
	public double getVitesse(NatureTerrain nature) {
		return (double)0;
	}
	
	public void remplirReservoir() {
		
	}
	
	public void deverserEau(int volume) {
		
	}
}
