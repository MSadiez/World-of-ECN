/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

/**
 *Super classe comprenant tous les objets récupérable dans le jeu WOE
 * @author Vincent
 */

public class Objet {
    
    /**
     * Position de l'instance d'Objet sur la carte
     */
    private Point2D position;
    
    /**
     * Equivalent des points de vie pour les Créatures : frapper un objet peut le détruire
     */
    private int durabilite;

    public Point2D getPosition() {
        return position;
    }

    public int getDurabilite() {
        return durabilite;
    }

    public void setPosition(Point2D position) {
        this.position = position;
    }

    public void setDurabilite(int durabilite) {
        this.durabilite = durabilite;
    }
    
    /**
     * Constructeur par défaut sans paramètres, qui initialise les attributs de l'Objet à des valeurs prédéfinies
     */
    public Objet(){
        position = new Point2D(5,5);
        durabilite = 10;
    };
    
    /**
     * Constructeur de recopie
     * @param o Autre instance de la classe Objet
     */
    public Objet(Objet o){
        this.position = new Point2D(o.position.getAbscisse(), o.position.getOrdonnee());
        this.durabilite = o.durabilite; 
    };
    
    /**
     * Crée une instance d'Objet avec en attributs les valeurs entrées en paramètres
     * @param pos La position à laquelle on veut placer l'instance d'Objet
     * @param dur La durabilité qu'on veut donner à l'instance d'Objet
     */
    public Objet(Point2D pos, int dur){
        this.position = new Point2D(pos.getAbscisse(), pos.getOrdonnee());
        this.durabilite = dur;
    };
        

}
