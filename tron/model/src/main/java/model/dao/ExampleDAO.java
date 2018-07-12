package model.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Example;

/**
 * <h1>The Class ExampleDAO.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class ExampleDAO extends AbstractDAO {

    private static String donnees = "{call insererDonnees( ?, ?)}";

    /**
     * Gets the example by id.
     *
     * @param id
     *            the id
     * @return the example by id
     * @throws SQLException
     *             the SQL exception
     */
    
    public static void envoiDonnees(String nom, int temps) throws SQLException {
    	final CallableStatement callStatement = prepareCall(donnees);
    	callStatement.setString(1, nom);
    	callStatement.setInt(2, temps);
    	callStatement.execute();
    }
}
