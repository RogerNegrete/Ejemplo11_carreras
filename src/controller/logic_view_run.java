package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import view.lienzo;
import view.view_run;

public class logic_view_run implements ActionListener, configurable,KeyListener{
	private view_run vr;
	private lienzo lienzo;
	private int cont;
	private  Thread car1,car2,car3;
	

	public logic_view_run(view_run vr) {
		super();
		this.vr = vr;
		this.vr.btn_pause.addActionListener(this);
		this.vr.btn_resume.addActionListener(this);
		this.vr.btn_start.addActionListener(this);
		this.vr.pn_lienzo.addKeyListener(this);
		this.lienzo = vr.pn_lienzo; // Cargando los recursos de lienzo
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==vr.btn_start) {
//			msg(vr, "Start");
//			cont+=10;
//			lienzo.setX1(cont);
//			lienzo.repaint();
			car1= new proceso_carrrera("mario", lienzo);
			car2= new proceso_carrrera("monkey", lienzo);
			car3= new proceso_carrrera("luigi", lienzo);
			car1.start();
			car2.start();
			car3.start();
			
		}else if (e.getSource()==vr.btn_pause) {
//			msg(vr, "Pause");
			car1.suspend();
			car2.suspend();
			car3.suspend();
		}else if (e.getSource()==vr.btn_resume) {
//			msg(vr, "Resume");
			car1.resume();
			car2.resume();
			car3.resume();

		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
			System.out.println("Hola");
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
