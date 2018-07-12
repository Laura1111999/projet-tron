package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import javax.swing.JComponent;

import javax.lang.model.element.Element;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ViewFacade extends JPanel implements IView,  {
	
	
    /**
     * Instantiates a new view facade.
     */
    public ViewFacade() {
        super();
    }

    /*
     * (non-Javadoc)
     * @see view.IView#displayMessage(java.lang.String)
     */
    @Override
    public final void displayMessage(final String message) {
        JOptionPane.showMessageDialog(null, message);
    }
    
    public void paintComponent(Graphics g) {
    	super.paintComponent(g);
    	Graphics2D g2d = (Graphics2D) g;
    	
    	g2d.setColor(J1.couleur);
    	g2d.fill(new Rectangle2D.Double(J1.getPositionX(), J1.getPositionY(), 1, 1));
    	
    	g2d.setColor(Color.RED);
    	g2d.fill(new Rectangle2D.Double(J2.getPositionX(), J2.getPositionY(), 1, 1));
    }    
    
    public void createWindow() {
    	this.fenetre = new Fenetre(g);
    }
}
