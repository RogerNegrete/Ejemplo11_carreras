package controller;

import view.lienzo;

public class proceso_carrrera extends Thread{
	private lienzo lienzo;
	private int cont=0;
	public proceso_carrrera(String car, lienzo lienzo) {
		super(car);
		this.lienzo = lienzo; //Carga los datos de la clase lienzo
	}
	private int valor() {
		cont += (int)(Math.random()*30);
		return cont;
	}

	public void run() {
		for (int i = 0; i <44; i++) {
			switch (getName()) {
			case "mario"-> lienzo.setX1(valor());
			case "monkey"->lienzo.setX2(valor());
			case "luigi"->lienzo.setX3(valor());
			}
			lienzo.repaint();
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
