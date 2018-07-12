package model;

import java.awt.Color;

public class Lightcycle extends Element implements ILightcycle{
	private int direction;
	private boolean etat = true;
	
	public Lightcycle(int direction, int positionX, int positionY) {
		this.direction = 1;
		this.positionX = 20;
		this.positionY = 20;
		Color couleur = new Color(0,1,0);
	}
	
	public void seDeplacer(Lightcycle joueur) {
		if(joueur.direction == 1) {
			Mur mur = new Mur(joueur.couleur, getPositionX(), getPositionY());
			joueur.positionX = joueur.positionX + 1;
			
		}else if(joueur.direction == 2) {
			Mur mur = new Mur(joueur.couleur, getPositionX(), getPositionY());
			joueur.positionY = joueur.positionY - 1;
			
		}else if(joueur.direction == 3) {
			Mur mur = new Mur(joueur.couleur, getPositionX(), getPositionY());
			joueur.positionX = joueur.positionX - 1;
			
		}else if(joueur.direction == 4) {
			Mur mur = new Mur(joueur.couleur, getPositionX(), getPositionY());
			joueur.positionY = joueur.positionY + 1;
			
		}
	}
	
	public void setDirection(int direction) {
		this.direction = direction;
	}
	
	public int getDirection() {
		return this.direction;
	}
}
