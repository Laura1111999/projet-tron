package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class InputListener implements KeyListener, IInputListener {
	
	
	/**
	 * Initiate all of the KeyEvent for the press key.
	 * 
	 * @param e
	 */

	@Override
	public void keyPressed(KeyEvent e) {
        //int keyCode = e.getKeyCode();
        if(e.getKeyCode() == KeyEvent.VK_RIGHT)  { 
			if(J1.direction > 0 && J1.direction < 4) {
					J1.direction = J1.direction + 1;
			
			}else if(J1.direction == 4) {
				J1.direction = 1;
			}
			
        }else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
        	if(J1.direction > 1 && J1.direction < 5) {
        		J1.direction = J1.direction - 1;
		
        	}else if(J1.direction == 1) {
        		J1.direction = 4;
        	}
        	
		}else if(e.getKeyCode() == KeyEvent.VK_Q) {
        	if(J2.direction > 1 && J2.direction < 5) {
        		J2.direction = J2.direction - 1;
		
        	}else if(J2.direction == 1) {
        		J2.direction = 4;
        	}
        	
		}else if(e.getKeyCode() == KeyEvent.VK_D) {
        	if(J2.direction > 1 && J2.direction < 5) {
        		J2.direction = J2.direction - 1;
		
        	}else if(J2.direction == 1) {
        		J2.direction = 4;
        	}
		}
	}
	
	
    /**
     * Initiate all of the KeyEvent for the release key.
     * 
     * @param e
     */

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	/**
     * Initiate all of the KeyEvent for the typed key.
     * 
     * @param e
     */

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
