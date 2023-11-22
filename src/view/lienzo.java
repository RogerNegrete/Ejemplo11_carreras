package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class lienzo extends JPanel{
	private int x1=0,x2=0,x3=0;
	
	public void setX1(int x1) {
		this.x1 = x1;
	}
	public void setX2(int x2) {
		this.x2 = x2;
	}
	public void setX3(int x3) {
		this.x3 = x3;
	}
	public lienzo() {
		setBounds(0,0,709,408);
		this.setBackground(Color.white);
		repaint();
	}
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.white);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		g.setColor(Color.blue);
		g.setFont(new Font("Comic",Font.BOLD,20));
		g.drawString("Competencia",200 , 20 );
		int[]posY_pista= {20,90,160,230};
		int[]posXpista= {60,620,630,689};
		g.setColor(Color.black);
		for (int lineas = 0; lineas <4; lineas++) {
			g.fillRect(10, posY_pista[lineas], 689, 5);
			g.fillRect(posXpista[lineas], 20, 10, 210);
		}
		g.setColor(Color.yellow);
		g.fillRect(10, 30, 50, 50);
		ImageIcon img1= new ImageIcon("src/multimedia/mario_kart_sf.png");
		g.drawImage(img1.getImage(), 10+x1, 30, 50,50, null);
		g.setColor(Color.blue);
//		g.fillOval(10, 100, 50, 50);
		g.fillRect(10, 100, 50, 50);
		ImageIcon img2= new ImageIcon("src/multimedia/monkey_kart_sf.png");
		g.drawImage(img2.getImage(), 10+x2, 100, 50,50, null);

//		//Coordenas de mi triangulo
//		int []xPoints= {10,35,60};
//		int []yPoints= {220,170,220};
//		int npoints =3;
//		g.setColor(Color.red);
//		g.fillPolygon(xPoints,yPoints,npoints);
		//Cuadrado
		int []xPoints= {10,10,60,60};
		int []yPoints= {220,170,170,220};
		int npoints =4;
		g.setColor(Color.red);
		g.fillPolygon(xPoints,yPoints,npoints);
		ImageIcon img3= new ImageIcon("src/multimedia/luigi_kart.png");
		g.drawImage(img3.getImage(), 10+x3, 170, 50,50, null);

		//		//Lineas
//		g.setColor(Color.black);
//		g.fillRect(699, 25, 7, 408);
	}
	
}
