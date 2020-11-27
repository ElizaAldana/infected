package model;

import processing.core.PApplet;

public class Sanos extends Bolita{

	public Sanos(PApplet app, int posX, int posY) {
		super(app, posX, posY);
		this.r = 0;
		this.g = 0;
		this.b = 255;
	}

	
	public void draw() {
		app.fill(r,g,b);
		app.ellipse(posX, posY,tam,tam);
	}


	
}
