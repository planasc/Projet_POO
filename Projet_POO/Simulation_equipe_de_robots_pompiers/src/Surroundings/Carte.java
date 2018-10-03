package Surroundings;
import Enums.*;
public class Carte {
	int tailleCases;
	private Case[][] caseCarte;
	private int nbLignes, nbColonnes;
	private void Carte(int nbLignes, int nbColonnes) {
		caseCarte = new Case[nbLignes][nbColonnes];
	}
	int getNbLignes() {
		return this.nbLignes;
	}
	int getNbColonnes() {
		return this.nbColonnes;
	}
	int getTailleCases() {
		return this.tailleCases;
	}
	
	Case getCase(int lig, int col) {
		return this.caseCarte[lig][col];
	}
	boolean voisinExiste(Case src, Direction dir) {
		int xLig=src.getLigne();
		int xCol=src.getColonne();
		switch(dir) {
		case Nord : 
			if(xLig>0) return true;
			break;
		case Sud : 
			if(xLig<this.getNbLignes()) return true;
			break;
		case Ouest : 
			if(xCol>0) return true;
			break;
		case Est :
			if(xCol<this.getNbColonnes()) return true;
			break;
		default :
			return false;
			break;
		}
	}
	Case getVoisin(Case src, Direction dir) {
		int xLig=src.getLigne();
		int xCol=src.getColonne();
		switch(dir) {
		case Nord : 
			xLig--;
			break;
		case Sud :
			xLig++;
			break;
		case Ouest : 
			xCol--;
			break;
		case Est :
			xCol++;
			break;
		default :
			break;
		}
		return caseCarte[xLig][xCol];
	}
}
