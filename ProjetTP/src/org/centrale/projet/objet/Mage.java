/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

import java.util.Random;

/**
 * Classe utilisée pour représenter un Mage. Le Mage est un personnage dont les dégâts reposent principalement sur les sorts
 * @author Mathéo
 */
public class Mage extends Personnage{
    
    /**
     * Crée un Mage appelé Bob dont les caractéristiques sont initialisées avec une valeur par défaut
     */
    public Mage(){
        super("Bob le Magicien", 100, 200, 60, 60, 50, 50, 5, 15, 5, 1, new Point2D());
    }
    
    /**
     * Constructeur de recopie de la classe Mage 
     * @param m L'instance de Mage à recopier.
     */
    
    public Mage(Mage m){
        super(m.getNom(), m.getPtVie(), m.getPtMana(), m.getPourcentageAtt(),
                m.getPourcentageMag(), m.getPourcentagePar(),
                m.getPourcentageResistMag(), m.getDegAtt(), m.getDegMag(), m.getPtPar(), m.getDistAttMax(), m.getPos());
    }
    
    /**
     * Crée une instance de Mage avec les caractéristiques initialisées aux valeurs fournies en argument.
     * @param nom Le nom du mage à créer
     * @param ptVie Le nombre de points de vie du mage à créer
     * @param ptMana Le nombre de points de mana du mage à créer
     * @param pourcentageAtt Le pourcentage d'attaque du mage à créer
     * @param pourcentageMag Le pourcentage de magie du mage à créer 
     * @param pourcentagePar Le pourcentage de chances de parade du mage à créer
     * @param pourcentageResistMag Le pourcentage de résistance magique du mage à créer
     * @param degAtt Les dégâts d'attaque du mage à créer.
     * @param degMag Les dégâts magiques du mage à créer.
     * @param ptPar Les points de parade du mage à créer.
     * @param distAttMax La portée d'attaque du mage à créer
     * @param pos  La position du mage à créer.
     */
    public Mage(String nom, int ptVie, int ptMana, int pourcentageAtt, 
            int pourcentageMag, int pourcentagePar, int pourcentageResistMag,
            int degAtt, int degMag, int ptPar, int distAttMax, Point2D pos){
                super( nom, ptVie, ptMana, pourcentageAtt, 
                    pourcentageMag, pourcentagePar, pourcentageResistMag,
                    degAtt, degMag, ptPar, distAttMax, pos);    
    }
            
    /**
     * Affiche l'ensemble des caractéristiques du mage à l'écran
     */
    @Override
    public void affiche(){
        
        System.out.println("Fiche de caractéristiques de " + this.getNom()+ " :" + "\n"
        + "Classe : Mage \n"        
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
    
    public void combattre (Creature c){
        
        if (this.getPtMana() > 0){
            if (this.getPos().distance(c.getPos()) <= this.getDistAttMax()){
                System.out.println("Le magicien lance un sort !");
                this.combattreMagiquement(c);
            }
        }
        else{
            if (this.getPos().distance(c.getPos()) == 10){
                System.out.println("Le magicien engage le combat au corps à corps.");
                this.combattre(c);
            }
        }
        
    }
    
    public void combattreMagiquement(Creature c){
        Random generateur = new Random();
        
        int jetAttaquant = generateur.nextInt();
        if(jetAttaquant <= this.getPourcentageMag()){
           c.setPtVie(c.getPtVie() - this.getDegMag());
        }
        
        
    }
    
}
