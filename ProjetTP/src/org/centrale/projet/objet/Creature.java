/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

import java.util.Random;

/**
 * Super-classe de laquelle hérite toute créature de World of ECN.
 * @author Mathéo
 */
public abstract class Creature {
    
        /**
     * Le nombre de points de vie de la créature. Indique sa résistance au combat.
     */
    private int ptVie ;
    
    /**
     * Le taux de précision de la créature. Indique ses chances de toucher la cible lors d'une attaque physique.
     */
    private int pourcentageAtt ;
    
    /**
     * Le taux de parade de la créature. Indique ses chances d'esquiver une attaque lors d'un combat.
     */
    private int pourcentagePar ;
    
    /**
     * Les dégâts d'attaque de la créature.
     */
    private int degAtt ;
    
    /**
     * Les points de parade de la créature.
     */
    private int PtPar;
    
    /**
     * La position de la créature.
     */
    private Point2D pos ;

    public int getPtVie() {
        return ptVie;
    }

    public void setPtVie(int ptVie) {
        this.ptVie = ptVie;
    }

    public int getPourcentageAtt() {
        return pourcentageAtt;
    }

    public void setPourcentageAtt(int pourcentageAtt) {
        this.pourcentageAtt = pourcentageAtt;
    }

    public int getPourcentagePar() {
        return pourcentagePar;
    }

    public void setPourcentagePar(int pourcentagePar) {
        this.pourcentagePar = pourcentagePar;
    }

    public int getDegAtt() {
        return degAtt;
    }

    public void setDegAtt(int degAtt) {
        this.degAtt = degAtt;
    }

    public int getPtPar() {
        return PtPar;
    }

    public void setPtPar(int PtPar) {
        this.PtPar = PtPar;
    }

    public Point2D getPos() {
        return pos;
    }

    public void setPos(Point2D pos) {
        this.pos = pos;
    }

    /**
     * Constructeur exhaustif de la classe Créature.
     * @param pV Les points de vie de la créature à créer.
     * @param pourcAtt Les points d'attaque de la créature à créer.
     * @param pourcPar Les points de parade de la créature à créer.
     * @param dA Les dégâts d'attaque de la créature à créer.
     * @param pos La position de la créature à créer.
     */
    public Creature (int pV, int pourcAtt, int pourcPar, int dA, int ptPar, Point2D pos) {
        this.ptVie = pV;
        this.pourcentageAtt = pourcAtt;
        this.pourcentagePar = pourcPar;
        this.degAtt = dA;
        this.PtPar = ptPar;
        this.pos = new Point2D(pos);
    }
    
    /**
     * Attaque la créature c en argument.
     * @param c La créature subissant l'attaque.
     */
    public void combattreAuCorpsACorps(Creature c){
        Random generateur = new Random();
                
        int jetAttaquant = generateur.nextInt(100)+1;
        if (jetAttaquant <= this.getPourcentageAtt()){
            int jetDefenseur = generateur.nextInt(100)+1;
            if (jetDefenseur <= c.getPourcentagePar()){
                c.setPtVie(c.getPtVie() - Math.max(0, this.getDegAtt() - c.getPtPar()));
            }
            else {
                c.setPtVie(c.getPtVie() - this.getDegAtt());
            }
        }
        
    }
    
    /**
     * Affiche la fiche de caractéristique de la Créature
     */
    public abstract void affiche();
    
    
}
