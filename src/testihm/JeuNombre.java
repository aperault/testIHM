package testihm;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Random;

/**
 *
 * @author Poweriser
 */
public class JeuNombre {
    
    private int nombresecret;
    private int tentative;
    private static int nbMin=0;
    private static int nbMax=10;
    
    public JeuNombre(int nbSecret, int nbMin, int nbMax){
        this.nombresecret=nbSecret;
        JeuNombre.nbMin=nbMin;
        this.nbMax=nbMax;
    }
    
     public boolean Jouer(int nbSecret,int tentative){
        
        if(tentative == nbSecret)
            return true;
        else return false;
        
    }

    public int getNombresecret() {
        return nombresecret;
    }

    public int getTentative() {
        return tentative;
    }

    public static int getNbMin() {
        return nbMin;
    }

    public static int getNbMax() {
        return nbMax;
    }

    public void setTentative(int tentative) {
        this.tentative = tentative;
    }

    public static void setNbMin(int nbMin) {
        JeuNombre.nbMin = nbMin;
    }

    public static void setNbMax(int nbMax) {
        JeuNombre.nbMax = nbMax;
    }
    
     
     public void Setnombresecret(){
         Random r = new Random();
         this.nombresecret=r.nextInt(this.nbMax);
     }
}
