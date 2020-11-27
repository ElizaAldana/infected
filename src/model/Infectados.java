package model;

import processing.core.PApplet;

public class Infectados extends Bolita{

	public Infectados(PApplet app, int posX, int posY) {
		super(app, posX, posY);
		this.r = 255;
		this.g = 0;
		this.b = 0;
		this.siInf = true;
	}

	
	public void draw() {
		app.fill(r,g,b);
		app.ellipse(posX, posY,tam,tam);
	}
	
	

	
}
