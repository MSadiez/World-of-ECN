/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

/**
 *
 * @author Mathéo
 */
public class TestPoint2D {
    
    public static void main(String[] args){
        
        System.out.println("Test du constructeur par défaut : ");
        Point2D point1 = new Point2D();
        point1.afficher();
        
        System.out.println("Test du constructeur prenant les coordonnées (2,3) en argument : ");
        Point2D point2 = new Point2D(2,3);
        point2.afficher();
        
        System.out.println("Test du constructeur de recopie avec le point précédent en argument :  ");
        Point2D point3 = new Point2D(point2);
        point3.afficher();
        
        System.out.println("On affecte à (5,5) la position du point précédent. Nouvelles coordonnées : ");
        point3.setPosition(5,5);
        point3.afficher();
        
        System.out.println("On translate de (-2,4) le point précédent. Nouvelles coordonnées : ");
        point3.translater(-2, 4);
        point3.afficher();
        
    }
    
}
