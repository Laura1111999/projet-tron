package model;

import java.awt.Color;

public class Element {
	protected int positionX;
	protected int positionY;
	protected Color couleur;
	
	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}
	
	public int getPositionX() {
		return this.positionX;
	}
	
	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}
	
	public int getPositionY() {
		return this.positionY;
	}
}
