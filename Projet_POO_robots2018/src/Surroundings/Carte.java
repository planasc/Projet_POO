package Surroundings;

import Enums.*;

public class Carte {
	private int tailleCases;
	private Case[][] caseCarte;
	private int nbLignes, nbColonnes;
	
	public void Carte(int nbLignes, int nbColonnes) {
		caseCarte = new Case[nbLignes][nbColonnes];
	}
	
	public int getNbLignes() 
	{
		return this.nbLignes;
	}
	
	public int getNbColonnes() 
	{
		return this.nbColonnes;
	}
	
	public int getTailleCases() 
	{
		return this.tailleCases;
	}
	
	public Case getCase(int lig, int col) 
	{
		return this.caseCarte[lig][col];
	}
	
	public boolean voisinExiste(Case src, Direction dir) 
	{
		int xLig=src.getLigne();
		int xCol=src.getColonne();
		boolean canMove=false;
		switch(dir) 
		{
			case NORD : 
				if(xLig>0) canMove=true;
				break;
			case SUD : 
				if(xLig<this.getNbLignes()) canMove=true;
				break;
			case OUEST : 
				if(xCol>0) canMove=true;
				break;
			case EST :
				if(xCol<this.getNbColonnes()) canMove=true;
				break;
			default :
				break;
		}
		return canMove;
	}
	
	public Case getVoisin(Case src, Direction dir) 
	{
		int xLig=src.getLigne();
		int xCol=src.getColonne();
		switch(dir) {
		case NORD : 
			xLig--;
			break;
		case SUD :
			xLig++;
			break;
		case OUEST : 
			xCol--;
			break;
		case EST :
			xCol++;
			break;
		default :
			break;
		}
		return caseCarte[xLig][xCol];
	}
}
