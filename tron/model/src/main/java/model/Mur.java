package model;

import java.awt.Color;

public class Mur extends Element {
	public Mur(Color couleur, int positionX, int positionY) {
		//Color couleur = new Color(0, 1, 0);
		this.couleur = couleur;
		this.positionX = positionX;
		this.positionY = positionY;
	}

}
