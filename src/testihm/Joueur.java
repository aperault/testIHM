package testihm;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Poweriser
 */
public class Joueur {
    private int id;
    private String login;
    private String pwd;

    
   
    public Joueur(){
        
    }
    
    public Joueur(int id, String login, String pwd) {
        this.id=id;
        this.login=login;
        this.pwd=pwd;
        
        
    }
    
    public Joueur getById(int id) throws SQLException{
        Connection connexion;
        connexion = Database.getConnection();
         Statement query = connexion.createStatement();
         String sql = "SELECT * FROM joueur WHERE id="+id;
        ResultSet rs = query.executeQuery(sql);
        Joueur nouveau = new Joueur();
        rs.next();
        nouveau.setId(rs.getInt(1));
        nouveau.setLogin(rs.getString(2));
        nouveau.setPwd(rs.getString(3));
        
        
        return nouveau;
    }

    public int getId() {
        return id;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Joueur other = (Joueur) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        if (!Objects.equals(this.pwd, other.pwd)) {
            return false;
        }
        return true;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    
    public void update(){
        
    }
    
    public void delete() {
        
        
    }

    
}
