package view;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

public class Fenetre {
	
	public Fenetre(Graphics g) {
		JPanel p = new JPanel();
		JFrame frame = new JFrame("tron");
		//InputListener listener = new InputListener();
		//g.setInputListener(listener);
		frame.setSize(600, 400);
		p.setBackground(Color.BLACK);
		//frame.add(p);
		frame.setContentPane(p);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.addKeyListener(listener);
		((Graphics2D) g).fill(new Rectangle2D.Double(p.getX(), p.getY(), 1, 1));
	}
}
