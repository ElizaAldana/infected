package model;

import processing.core.PApplet;

public abstract class Bolita implements Runnable {

	//Se me olvidaba que necesitan colores xD ahh y el tamaño ups
	protected int posX, posY, r, g, b, tam;
	protected PApplet app; 
	
	public Bolita(PApplet app, int posX, int posY) {
		this.app= app;
		this.posX = posX;
		this.posY = posY;
		this.tam = 7; //7 pixeles
		
		
	}
	
	public void mover() {
		
	}
	
	public void run() {
		
	}
	
	public abstract void draw(); 
		
	
	
}
