package model;

import processing.core.PApplet;

public abstract class Bolita implements Runnable {

	//Se me olvidaba que necesitan colores xD ahh y el tamaño ups y la direccion jeje
	protected int posX, posY, r, g, b, tam, dirX, dirY, vel;
	protected PApplet app; 
	
	public Bolita(PApplet app, int posX, int posY) {
		this.app= app;
		this.posX = posX;
		this.posY = posY;
		this.tam = 7; //7 pixeles
		this.dirX = (int) app.random(-1,2); //para que las direcciones queden random
		this.dirY = (int) app.random(-1,2); 
		this.vel = 10;
	}
	
	public void mover() {
		//es para que no se queden quietos al llegar a 0
		if(this.dirX == 0) {dirX = 1;}
		if(this.dirY == 0) {dirY = 1;}
		
		//quiero que no se salgan del lienzo
		if( this.posX >= 600 || this.posX <=0 ){
			this.dirX = this.dirX*-1; //la dirección se multiplica para irse al lado contrario
		}
		
		if( this.posY >= 500 || this.posY <= 0 ){
			this.dirY = this.dirY*-1; //la dirección se multiplica para irse al lado contrario
		}
		
		this.posX = posX+(dirX*vel); //esto YA es pa que se mueva
		this.posY = posY+(dirY*vel);
	}
	
	public void run() {
		mover();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public abstract void draw(); 
		
	
	
}
