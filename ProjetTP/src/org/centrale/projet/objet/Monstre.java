/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

import java.util.Random;

/**
 * Classe générale utilisée pour représenter un monstre.
 * @author Vincent
 */
public class Monstre extends Creature {
    
    
    /**
     * Constructeur par défaut de la classe Monstre.
     */
    public Monstre() {
        super(75, 50, 50, 12, 12, new Point2D(0, 0));
    }
    
    /**
     * Constructeur de recopie de la classe Monstre.
     * @param m Le monstre à recopier.
     */
    public Monstre (Monstre m) {
        super(m.getPtVie(), m.getPourcentageAtt(), m.getPourcentagePar(), m.getDegAtt(), m.getPtPar(), m.getPos());
    }
    
    /**
     * Constructeur exhaustif de la classe Monstre.
     * @param pV Les points de vie du monstre à créer.
     * @param pA Les points d'attaque du monstre à créer.
     * @param pP Les chances de parade du monstre à créer.
     * @param dA Les dégâts d'attaque du monstre à créer.
     * @param ptPar Les points de parade du monstre à créer
     * @param pos La position du monstre à créer.
     */
    public Monstre (int pV, int pA, int pP, int dA, int ptPar, Point2D pos) {
        super(pV, pA, pP, dA, ptPar, pos);
    }
    
    /**
     * Affiche la fiche de caractéristiques du monstre.
     */
    public void affiche() {
        System.out.println("Fiche de caractéristiques du monstre : \n"
        + "Points de vie : " + this.getPtVie() + "\n"
        + "Taux de précision physique : " + this.getPourcentageAtt() + "\n"
        + "Taux de parade" + this.getPourcentagePar() + "\n"
        + "Dégâts d'attaque : " + this.getDegAtt() + "\n"
        + "Position : " + this.getPos().toString());
    }
    
    /**
     * Déplace le monstre de 1 unité dans une direction aléatoire.
     */
    public void deplace(){
        Random generateur = new Random();
        
        //On tire au sort un nombre entier compris entre -1 et 1 symbolisant le déplacement selon l'axe des abscisses.
        int directionAleatoire = generateur.nextInt(3) - 1;
        this.getPos().translater(directionAleatoire, 0);
        
        //On répète ensuite le tirage pour déterminer un déplacement vertical.
        directionAleatoire = generateur.nextInt(3) - 1;
        this.getPos().translater(0, directionAleatoire);
        
        //Si l'on tombe deux fois sur 0, le monstre reste immobile.
        
    }
}
