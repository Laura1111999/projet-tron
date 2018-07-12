package controller;

import java.awt.event.KeyEvent;

public interface IInputListener {
	void keyTyped(KeyEvent arg0);
	void keyReleased(KeyEvent arg0);
	void keyPressed(KeyEvent e);
}
