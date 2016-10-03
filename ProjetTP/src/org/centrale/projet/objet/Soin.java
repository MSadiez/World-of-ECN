/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

/**
 *Potion de soin qui rend des points de vie aux Créatures qui marchent dessus.
 * @author Vincent
 */
public class Soin extends Potion {
    
    /**
     * Nombre de points de vie rendus à la Créature qui marche dessus
     */
    private int puissance;

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    /**
     * Crée une instance par défaut de Potion de Soin, rendant 20 points de vie à la Créature qui marche dessus
     */
    public Soin() {
        super();
        this.puissance = 25;
    }
    
    /**
     * Constructeur de recopie qui crée une nouvelle instance de Potion de Soin à partir de celle mise en paramètre
     * @param s Potion de Soin à recopier
     */
    public Soin(Soin s){
        super(s);
        
    }
    
    /**
     * Crée une Potion de Soin avec en attribut les paramètres mis en entrée
     * @param pos Position à laquelle on veut que la Potion de Soin apparaisse
     * @param dur Durabilité u'on veut donner à la Potion de Soin
     * @param puissance Nombre de points de vie rendus par la Potion de Soin
     */
    public Soin(Point2D pos, int dur, int puissance){
        super(pos, dur);
        this.puissance = puissance;
    }
        
    /**
     * Affiche la fiche de caractéristiques de la potion
     */
        public void affiche(){
         super.affiche();
         System.out.println("Rend : "+ this.getPuissance() + " points de vie" + "\n");

        }
        
}
