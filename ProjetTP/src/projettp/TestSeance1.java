/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projettp;

import org.centrale.projet.objet.Personnage;
import org.centrale.projet.objet.Point2D;
import org.centrale.projet.objet.Archer;
import org.centrale.projet.objet.World;

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
        
        System.out.println("Déplacement aléatoire du personnage Charles 3 fois d'affilée : ");
        p3.deplace();
        p3.affiche();
        
        p3.deplace();
        p3.affiche();
        
        p3.deplace();
        p3.affiche();
        
        Archer a1 = new Archer();
        Archer a2 = new Archer("Robin", 300, 20, 50, 60, 70, 80, 20, 0, 1, new Point2D(1,2),4);
        Archer a3 = new Archer(a2);
        
        a1.affiche();
        a2.affiche();
        a3.affiche();
        
        
        System.out.println("Test de génération d'un monde : \n");
        World mondeTest = new World();
        
        mondeTest.robin.affiche();
        mondeTest.peon.affiche();
        mondeTest.bugs.affiche();
                
                
        
    }
    
}
