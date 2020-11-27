package model;

import processing.core.PApplet;

public abstract class Bolita implements Runnable {

	//Se me olvidaba que necesitan colores xD ahh y el tamaño ups y la direccion jeje
	protected int posX, posY, r, g, b, tam, dirX, dirY, vel;
	protected PApplet app; 
	protected boolean siInf;
	
	public Bolita(PApplet app, int posX, int posY) {
		this.app= app;
		this.posX = posX;
		this.posY = posY;
		this.tam = 7; //7 pixeles
		this.dirX = (int) app.random(-1,2); //para que las direcciones queden random
		this.dirY = (int) app.random(-1,2); 
		this.vel = 5;
		
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

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public boolean isSiInf() {
		return siInf;
	}

	public void setSiInf(boolean siInf) {
		this.siInf = siInf;
	} 
	
	
	
	
}
