package model;

import processing.core.PApplet;

public abstract class Bolita implements Runnable {

	protected int posX, posY;
	protected PApplet app; 
	
	public Bolita(PApplet app) {
		this.app= app;
	}
}
