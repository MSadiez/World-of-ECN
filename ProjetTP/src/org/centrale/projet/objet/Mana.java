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
public class Mana extends Potion {

    /**
     * Nombre de points de Mana rendus au Personnage qui marche dessus
     */
    private int puissance;

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    /**
     * Crée une instance par défaut de Potion de Mana, rendant 20 points de mana au Personnage qui marche dessus
     */
    public Mana() {
        super();
        this.puissance = 25;
    }
    
    /**
     * Constructeur de recopie qui crée une nouvelle instance de Potion de Mana à partir de celle mise en paramètre
     * @param m Potion de Mana à recopier
     */
    public Mana(Mana m){
        super(m);
        
    }
    
    /**
     * Crée une Potion de Mana avec en attribut les paramètres mis en entrée
     * @param pos Position à laquelle on veut que la Potion de Mana apparaisse
     * @param dur Durabilité u'on veut donner à la Potion de Mana
     * @param puissance Nombre de points de mana rendus par la Potion de Mana
     */
    public Mana(Point2D pos, int dur, int puissance){
        super(pos, dur);
        this.puissance = puissance;
    }
    
    /**
     * Affiche la fice de caractéristique de la Potion.
     */
    public void affiche(){
        super.affiche();
        System.out.println("Rend : " + this.puissance + " points de mana" + "\n");
    }
    
    
    
}

