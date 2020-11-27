package controller;

import model.Logica;
import processing.core.PApplet;

public class Controller {
	PApplet app;
	private Logica logic;
	

	public Controller(PApplet app) {
		this.app = app;
		this.logic = new Logica(app);
	}

	public void drawPersonas() {
		this.logic.drawBolita(); //para llamar el draw de lógica
	}
}