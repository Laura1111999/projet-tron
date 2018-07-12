package model;

import java.sql.SQLException;
import java.util.List;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import model.dao.ExampleDAO;

/**
 * <h1>The Class ModelFacade provides a facade of the Model component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public final class ModelFacade implements IModel {
	private int temps = 0;
	Element tableauMap[][] = new Element[400][600];

    /**
     * Instantiates a new model facade.
     */
    public ModelFacade() {
        super();
    }

    
    Lightcycle J1 = new Lightcycle(1, 200, 100);
    J1.couleur = Color(1,0,0);
    Lightcycle J2 = new Lightcycle(3, 200, 500);
    J2.couleur = Color(0,0,1);
}