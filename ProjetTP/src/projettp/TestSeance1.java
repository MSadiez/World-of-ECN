/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projettp;

import org.centrale.projet.objet.Personnage;
import org.centrale.projet.objet.Point2D;

/**
 *
 * @author Mathéo
 */
public class TestSeance1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Personnage p1 = new Personnage();
        Personnage p2 = new Personnage("Charles", 400, 20, 50, 60, 70, 80, 20, 0, 1, new Point2D(1,2));
        Personnage p3 = new Personnage(p2);
        
        p1.affiche();
        p2.affiche();
        p3.affiche();
        
    }
    
}
