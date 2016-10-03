/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;
        
/**
 * Classe utilisée pour représenter un lapin. 
 * @author Vincent
 */
public class Lapin extends Monstre {
    
    /**
     * Constructeur par défaut de la classe lapin. Crée un lapin inoffensif.
     */
    public Lapin() {
        super(1,5,5, 1, 1, new Point2D());
    };
    
    /**
     * Constructeur de recopie de la classe Lapin
     * @param l Le lapin à recopier.
     */
    public Lapin(Lapin l) {
        super(l);
    }
    
    /**
     * Crée un lapin dont les caractéristiques correspondent aux valeurs entrées en argument.
     * @param pV Les points de vie du lapin à créer.
     * @param pA Le pourcentage de précédents du lapin à créer.
     * @param pP Le pourcentage de parade du lapin à créer.
     * @param dA Les dégâts d'attaque du lapin à créer.
     * @param ptPar Les points de parade du lapin à créer.
     * @param p La position du lapin à créer.
     */
    public Lapin( int pV, int pA, int pP, int dA, int ptPar, Point2D p) {
        super(pV, pA, pP, dA, ptPar, p);
    }
}
