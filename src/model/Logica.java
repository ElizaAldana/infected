package model;

import java.util.LinkedList;

import processing.core.PApplet;

public class Logica {

	private PApplet app;
	private LinkedList<Bolita> person;
	private String[] info;
	private boolean toque;
	
	public Logica(PApplet app) {
		this.app = app;
		this.person = new LinkedList<Bolita>();
		this.info = app.loadStrings("../txt/info.txt"); //cargando el text
		agregarPerson(); //para llamar todo lo que está dentro del método agregarPerson
		this.toque = false;
	}

	public void agregarPerson() { //para el linkedList
		//i lee el txt
		for (int i = 0; i < info.length; i++) {
			String[] infoSplit = info[i].split(":");	//para partir las líneas
			int numinfoSplit = Integer.parseInt(infoSplit[1]); //para obtener la columna 1
			//en el info Split se lee la columna 0 (estados)
			if(infoSplit[0].equals("sanas")) {
				int cantPersonasSanas = numinfoSplit; //acá obtengo el núm que está en info de sanas (98)
					for (int j = 0; j < cantPersonasSanas; j++) {
						this.person.add(new Sanos(app, (int) app.random(1,600), (int) app.random(1,500))); //para que agregue personas en person y las posiciones random
					}
			}
			
			if(infoSplit[0].equals("infectadas")) {
				int cantPersonasInf = numinfoSplit; //acá obtengo el núm que está en info de infectados (1)
					for (int j = 0; j < cantPersonasInf; j++) {
						this.person.add(new Infectados(app, (int) app.random(1,600), (int) app.random(1,500))); //para que agregue personas en person y las posiciones random
					}
			}
			
			if(infoSplit[0].equals("recuperadas")) {
				int cantPersonasRec = numinfoSplit; //acá obtengo el núm que está en info de recuperados (1)
					for (int j = 0; j < cantPersonasRec; j++) {
						this.person.add(new Recuperados(app, (int) app.random(1,600), (int) app.random(1,500))); //para que agregue personas en person y las posiciones random
					}
			}
		}
	}
	
	public void drawBolita() {
		//para que se pinten las bolitas :)
		for (int i = 0; i < 100; i++) {
			this.person.get(i).draw(); //sin esto no se pinta na'
			new Thread(this.person.get(i)).start(); //sin esto no se mueven
			
		//AÚN NO FUNCIONA BIEN, dice que está vacío
		//condición de choque
//			for (int j = 0; j < 100; j++) {
//				float distanciaB = 
//						PApplet.dist(this.person.get(i).getPosX(), //comparar objetos, función dist(x1,y1,x2,y2);
//						this.person.get(i).getPosY(),
//						this.person.get(j).getPosX(),
//						this.person.get(j).getPosY());
//					if(distanciaB < 5) {
//						this.toque = true;
//						//recordar que en las CONDICIONES SIEMPRE SON ==
//						if(toque == true && this.person.get(i).isSiInf() == true){
//							this.person.remove(j);
//							this.person.add(new Infectados(app,this.person.get(j).getPosX(),this.person.get(j).getPosY()));	
//						}
//					}
//					this.toque = false;
//			}
		}
		
	}
}
