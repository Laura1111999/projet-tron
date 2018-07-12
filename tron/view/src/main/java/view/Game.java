package view;

import javax.swing.JPanel;

public class Game {
	int n = 0;
	JPanel p;
	boolean fini = false;
	
	public void update() {
		n = n + 1;
		if(n > 1000) {
			fini = true;
		}
	}
	
	public void render() {
		p.repaint();
	}
}
