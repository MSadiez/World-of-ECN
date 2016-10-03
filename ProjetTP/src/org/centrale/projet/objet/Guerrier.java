/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

/**
 * Classe utilisée pour représenter un Guerrier. Le Guerrier est un personnage résistant qui attaque au corps-à-corps.
 * @author Mathéo
 */
public class Guerrier extends Personnage{
    
    
    /**
     * Constructeur par défaut sans argument. 
     * Crée un Guerrier appelé Bob dont les caractéristiques sont initialisées avec une valeur par défaut
     */
    public Guerrier(){
        super("Bob le Bourrin", 200, 100, 20, 50, 60, 60, 15, 5, 15, 1, new Point2D());
    }
    
    /**
     * Crée une instance de Guerrier avec les caractéristiques initialisées aux valeurs fournies en argument.
     * @param nom Le nom du guerrier à créer
     * @param ptVie Le nombre de points de vie du guerrier à créer
     * @param ptMana Le nombre de points de mana du guerrier à créer
     * @param pourcentageAtt Le pourcentage d'attaque du guerrier à créer
     * @param pourcentageMag Le pourcentage de magie du guerrier à créer 
     * @param pourcentagePar Le pourcentage de chances de parade du guerrier à créer
     * @param pourcentageResistMag Le pourcentage de résistance magique du guerrier à créer
     * @param degAtt Les dégâts d'attaque du guerrier à créer.
     * @param degMag Les dégâts magiques du guerrier à créer.
     * @param ptPar Les points de parade du guerrier à créer.
     * @param distAttMax La portée d'attaque du guerrier à créer
     * @param pos  La position du guerrier à créer.
     */
    public Guerrier(String nom, int ptVie, int ptMana, int pourcentageAtt, 
            int pourcentageMag, int pourcentagePar, int pourcentageResistMag,
            int degAtt, int degMag, int ptPar, int distAttMax, Point2D pos){
        super( nom, ptVie, ptMana, pourcentageAtt, 
            pourcentageMag, pourcentagePar, pourcentageResistMag,
            degAtt, degMag, ptPar, distAttMax, pos);
    }
    
    /**
     * Constructeur de recopie de la classe Guerrier 
     * @param a L'instance de Guerrier à recopier.
     */
    public Guerrier(Guerrier a){
        super(a);
    }
    
    /**
     * Affiche l'ensemble des caractéristiques du guerrier à l'écran
     */
    @Override
    public void affiche(){
        
        System.out.println("Fiche de caractéristiques de " + this.getNom()+ " :" + "\n"
        + "Classe : Guerrier \n"        
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
    
    public void combattre(Creature c){
        if (this.getPos().distance(c.getPos()) == 1){
            System.out.println("Le guerrier engage le combat !");
            this.combattreAuCorpsACorps(c);
        }
        else {
            System.out.println("Le guerrier est trop loin pour attaquer cette créature;");
        }        
    }
    
}
