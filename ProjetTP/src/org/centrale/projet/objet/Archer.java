/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

import java.util.Random;

/**
 * Classe utilisée pour représenter un Archer. L'Archer est un combattant, moins résistant mais plus rapide que le Guerrier.
 * @author Mathéo
 */
public class Archer extends Personnage {
    
    /**
     * Nombre de flèches possédées par l'instance d'Archer considérée
     */
    private int nbFleches;

    public int getNbFleches() {
        return nbFleches;
    }

    public void setNbFleches(int nbFleches) {
        this.nbFleches = nbFleches;
    }
    
    /**
     * Constructeur par défaut sans argument. 
     * Crée un Archer appelé Bob dont les caractéristiques sont initialisées avec une valeur par défaut
     */
    public Archer(){
        super("Bob l'Archer", 100, 100, 50, 50, 50, 50, 10, 10, 10, 5, new Point2D());
        this.nbFleches = 5;
    }
    
    /**
     * Crée une instance d'Archer avec les caractéristiques initialisées aux valeurs fournies en argument.
     * @param nom Le nom de l'archer à créer
     * @param ptVie Le nombre de points de vie de l'archer à créer
     * @param ptMana Le nombre de points de mana de l'archer à créer
     * @param pourcentageAtt Le pourcentage d'attaque de l'archer à créer
     * @param pourcentageMag Le pourcentage de magie de l'archer à créer 
     * @param pourcentagePar Le pourcentage de chances de parade de l'archer à créer
     * @param pourcentageResistMag Le pourcentage de résistance magique de l'archer à créer
     * @param degAtt Les dégâts d'attaque de l'archer à créer.
     * @param degMag Les dégâts magiques de l'archer à créer.
     * @param ptPar Les points de parade du paysan à créer.
     * @param distAttMax La portée d'attaque de l'archer à créer
     * @param pos  La position de l'archer à créer.
     * @param nbFleches Le nombre de flèches de l'archer à créer.
     */
    public Archer(String nom, int ptVie, int ptMana, int pourcentageAtt, 
            int pourcentageMag, int pourcentagePar, int pourcentageResistMag,
            int degAtt, int degMag, int ptPar, int distAttMax, Point2D pos, int nbFleches){
        super( nom, ptVie, ptMana, pourcentageAtt, 
            pourcentageMag, pourcentagePar, pourcentageResistMag,
            degAtt, degMag, ptPar, distAttMax, pos);
        this.nbFleches = nbFleches;        
    }
    
    /**
     * Constructeur de recopie de la classe Archer 
     * @param a L'instance d'Archer à recopier.
     */
    public Archer(Archer a){
        super(a);
        this.nbFleches = a.getNbFleches();
    }
    
    /**
     * Affiche l'ensemble des caractéristiques de l'archer à l'écran
     */
    @Override
    public void affiche(){
        
        System.out.println("Fiche de caractéristiques de " + this.getNom()+ " :" + "\n"
        + "Classe : Archer \n"        
        + "Points de Vie : " + this.getPtVie() + "\n"
        + "Points de Mana : " + this.getPtMana() + "\n"
        + "Taux de précision physique : " + this.getPourcentageAtt() + "\n"
        + "Taux de précision magique : " + this.getPourcentageMag() + "\n"
        + "Taux de parade : " + this.getPourcentagePar() + "\n"
        + "Taux de résistance magique : " + this.getPourcentageResistMag() + "\n"
        + "Dégâts d'attaque : " + this.getDegAtt() + "\n"
        + "Dégâts Magiques : " + this.getDegMag() + "\n"
        + "Portée d'attaque : " + this.getDistAttMax() + "\n"
        + "Position Actuelle : " + this.getPos().toString() + "\n"
        + "Nombre de flèches actuel : " + this.nbFleches + "\n");
    }
    
    /**
     * 
     */
    public void combattre(Creature c){
        if (this.getPos().distance(c.getPos()) == 1){
            System.out.println("L'archer engage le combat au corps à corps");
            this.combattreAuCorpsACorps(c);
        }
        if ((this.getPos().distance(c.getPos()) > 1) && (this.getPos().distance(c.getPos()) <= this.getDistAttMax()) && (this.getNbFleches()>0)){
            System.out.println("L'archer décoche une flèche");
            this.combattreADistance(c);            
        }
        if (this.getPos().distance(c.getPos()) > this.getDistAttMax()){
            System.out.println("L'archer est trop loin pour attaquer son adversaire.");
        }
    }
    
    public void combattreADistance(Creature c){
        Random generateur = new Random();
        
        int jetAttaquant = generateur.nextInt();
        if(jetAttaquant <= this.getPourcentageAtt()){
           c.setPtVie(c.getPtVie() - this.getDegAtt());
        }
    }
}
