/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

/**
 * Classe utilisée pour représenter un paysan. Sert à instancier des Personnages Non Joueur dans le monde de WoE.
 * @author Mathéo
 */
public class Paysan extends Personnage { 
    /**
     * Crée une instance de paysan aux valeurs définies par défaut
     */
    public Paysan(){
        super("Bob le Paysan", 20, 0, 50, 50, 50, 50, 10, 10, 10, 2, new Point2D());
    }
    
    /**
     * Crée une instance de Paysan avec les caractéristiques initialisées aux valeurs fournies en argument.
     * @param nom Le nom du paysan à créer
     * @param ptVie Le nombre de points de vie du paysan à créer
     * @param ptMana Le nombre de points de mana du paysan à créer
     * @param pourcentageAtt Le pourcentage d'attaque du paysan à créer
     * @param pourcentageMag Le pourcentage de magie du paysan à créer 
     * @param pourcentagePar Le pourcentage de chances de parade du paysan à créer
     * @param pourcentageResistMag Le pourcentage de résistance magique du paysan à créer
     * @param degAtt Les dégâts d'attaque du paysan à créer.
     * @param degMag Les dégâts magiques du paysan à créer.
     * @param ptPar Les points de parade du paysan à créer.
     * @param distAttMax La portée d'attaque du paysan à créer
     * @param pos  La position du paysan à créer.
     */
    public Paysan(String nom, int ptVie, int ptMana, int pourcentageAtt, 
            int pourcentageMag, int pourcentagePar, int pourcentageResistMag,
            int degAtt, int degMag, int ptPar, int distAttMax, Point2D pos){
        super( nom, ptVie, ptMana, pourcentageAtt, 
            pourcentageMag, pourcentagePar, pourcentageResistMag,
            degAtt, degMag, ptPar, distAttMax, pos);        
    }
    
    /**
     * Constructeur de recopie de la classe Paysan 
     * @param p L'instance de Paysan à recopier.
     */
    public Paysan(Paysan p){
        super(p);
    }
    
    /**
     * Affiche l'ensemble des caractéristiques du paysan à l'écran
     */
    @Override
    public void affiche(){
        
        System.out.println("Fiche de caractéristiques de " + this.getNom()+ " :" + "\n"
        + "Classe : Paysan \n"        
        + "Points de Vie : " + this.getPtVie() + "\n"
        + "Points de Mana : " + this.getPtMana() + "\n"
        + "Taux de précision physique : " + this.getPourcentageAtt() + "\n"
        + "Taux de précision magique : " + this.getPourcentageMag() + "\n"
        + "Taux de parade : " + this.getPourcentagePar() + "\n"
        + "Taux de résistance magique : " + this.getPourcentageResistMag() + "\n"
        + "Dégâts d'attaque : " + this.getDegAtt() + "\n"
        + "Dégâts Magiques : " + this.getDegMag() + "\n"
        + "Portée d'attaque : " + this.getDistAttMax() + "\n"
        + "Position Actuelle : " + this.getPos().toString() + "\n");
    }
    


}
