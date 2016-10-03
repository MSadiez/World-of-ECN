/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

/**
 *Classe contenant tous les types de potions disponibles dans le monde de WOE
 * @author Vincent
 */
public class Potion extends Objet {
     
    /**
     * Crée une instance par défaut de la classe Potion avec des attributs initialisés par défaut.
     */
    public Potion(){
        super();
    };
    
    /**
     * Crée une Potion identique à celle que la méthode prend en paramètre
     * @param popo objet de classe Potion à copier
     */
    public Potion (Potion popo){
        super(popo);
    };
    /**
     * Crée une instance de l'objet Potion avec les valeurs présentes en paramètres 
     * @param pos Position où on veut situer la Potion
     * @param dur Durabilité qu'on veut donner à la Potion
     */
    public Potion(Point2D pos, int dur) {
        super(pos, dur);
    };
    
    /**
     * Affiche les caractéristiques de la Potion
     */
    public void affiche(){
         System.out.println("Caractéristiques de la Potion" + "\n"
         + "Position : "+ this.getPosition().toString() + "\n"
         + "Durabilité : "+ this.getDurabilite() + "\n"
         );   
    }
        
}
