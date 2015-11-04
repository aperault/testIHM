/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testihm;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Poweriser
 */
public class JoueurTest {
    
   Connection connexion;
   

    @Before
    public void doBefore() throws SQLException {
     
        connexion = Database.getConnection();
        Statement query = connexion.createStatement();
        String sql = "INSERT INTO joueur (login,pwd) VALUES ('jean','mdp')";
        String sql2 = "INSERT INTO joueur (login,pwd) VALUES ('gilles','mdp')";
        query.executeUpdate(sql);
        query.executeUpdate(sql2);
        query.close();
    }
    
    @After
    public void doAfter() throws SQLException{
        connexion.close();
    }
    
    @Test
    public void testGetById() throws SQLException {
       
        Joueur joueur1 = new Joueur(1,"anthony","test");
      System.out.println(joueur1.getById(1).getPwd());
        assertEquals(joueur1,joueur1.getById(1) );
    }

 /*   @Test
    public void testUpdate() {
        
    }

    @Test
    public void testDelete() {
    }
    */
}
