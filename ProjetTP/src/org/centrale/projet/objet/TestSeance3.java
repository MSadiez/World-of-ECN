/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

/**
 *
 * @author Vincent
 */
public class TestSeance3{
    public static void main(String[] args) {
        
        World mondeTest = new World();
        
        mondeTest.soin.affiche();
        mondeTest.mana.affiche();
        
        mondeTest.tourDeJeu();
        
        mondeTest.soin.affiche();
        mondeTest.mana.affiche();

    };
    
    
    
}
