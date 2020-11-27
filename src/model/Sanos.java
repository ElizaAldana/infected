package model;

import processing.core.PApplet;

public class Sanos extends Bolita{

	public Sanos(PApplet app, int posX, int posY) {
		super(app, posX, posY);
		this.r = 0;
		this.g = 255;
		this.b = 0;
		this.siInf = false;
	}

	
	public void draw() {
		app.fill(r,g,b);
		app.ellipse(posX, posY,tam,tam);
	}


	
}
