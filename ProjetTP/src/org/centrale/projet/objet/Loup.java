/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

/**
 * Classe utilisée pour représenter un Loup. Animal sauvage modérément dangereux.
 * @author Mathéo
 */
public class Loup extends Monstre{
    
    /**
     * Constructeur par défaut de la classe loup.
     */
    public Loup() {
        super(1,5,5, 5, 1, new Point2D());
    };
    
    /**
     * Constructeur de recopie de la classe Loup
     * @param l Le loup à recopier.
     */
    public Loup(Loup l) {
        super(l);
    }
    
    /**
     * Crée un loup dont les caractéristiques correspondent aux valeurs entrées en argument.
     * @param pV Les points de vie du loup à créer.
     * @param pA Le pourcentage de précédents du loup à créer.
     * @param pP Le pourcentage de parade du loup à créer.
     * @param dA Les dégâts d'attaque du loup à créer.
     * @param ptPar Les points de parade du loup à créer.
     * @param p La position du loup à créer.
     */
    public Loup( int pV, int pA, int pP, int dA, int ptPar, Point2D p) {
        super(pV, pA, pP, dA, ptPar, p);
    }
    
    /**
     * Affiche la fiche de caractéristiques du monstre, en présisant son espèce : le Loup.
     */
    @Override
    public void affiche() {
        super.affiche();
        System.out.println("Ce monstre est un Loup" + "\n");
    }
    
}
