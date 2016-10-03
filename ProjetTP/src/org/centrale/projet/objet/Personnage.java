/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;
import java.util.Random;
/**
 * Classe générale utilisée pour représenter un personnage.
 * @author Mathéo
 */
public class Personnage extends Creature {
    
    /**
     * Le nom du personnage concerné.
     */
    private String nom;
    
    /**
     * Les points de mana du personnage concerné. Indique le nombre de sorts qu'il est capable de lancer.
     */
    private int ptMana;
    
    /**
     * La précision magique du personnage. Indique la probabilité de toucher la cible avec un sort lors d'un combat.
     */
    private int pourcentageMag;
    
    /**
     * La résistance magique du personnage. Indique la probabilité d'esquiver une attaque magique lors d'un combat.
     */
    private int pourcentageResistMag;
    
    /**
     * Les dégâts magiques du personnage.
     */
    private int degMag;
    
    /**
     * La portée d'attaque du personnage.
     */
    private int distAttMax;
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPtMana() {
        return ptMana;
    }

    public void setPtMana(int ptMana) {
        this.ptMana = ptMana;
    }

    public int getPourcentageMag() {
        return pourcentageMag;
    }

    public void setPourcentageMag(int pourcentageMag) {
        this.pourcentageMag = pourcentageMag;
    }

    public int getPourcentageResistMag() {
        return pourcentageResistMag;
    }

    public void setPourcentageResistMag(int pourcentageResistMag) {
        this.pourcentageResistMag = pourcentageResistMag;
    }

    public int getDegMag() {
        return degMag;
    }

    public void setDegMag(int degMag) {
        this.degMag = degMag;
    }

    public int getDistAttMax() {
        return distAttMax;
    }

    public void setDistAttMax(int distAttMax) {
        this.distAttMax = distAttMax;
    }

    /**
    * Crée un personnage nommé Bob dont toutes les caractéristiques sont renseignées avec une valeur par défaut.
    */
    public Personnage(){
        super(100, 50, 50, 10, 10, new Point2D(0, 0));
        this.nom = "Bob";
        this.ptMana = 100;
        this.pourcentageMag = 50;
        this.pourcentageResistMag = 50;
        this.degMag = 10;
        this.distAttMax = 2;
    }
    
    
    /**
     * Constructeur de recopie de la classe personnage.
     * @param p Le personnage à recopier
     */
    public Personnage(Personnage p){
        super(p.getPtVie(), p.getPourcentageAtt(), p.getPourcentagePar(), p.getDegAtt(), p.getPtPar(), new Point2D(p.getPos()));
        this.nom = p.getNom();
        this.ptMana = p.getPtMana();
        this.pourcentageMag = p.getPourcentageMag();
        this.pourcentageResistMag = p.getPourcentageResistMag();
        this.degMag = p.getDegMag();
        this.distAttMax = p.getDistAttMax();
    }
    
    /**
     * Crée une instance de Personnage avec les caractéristiques initialisées aux valeurs fournies en argument.
     * @param nom Le nom du personnage à créer
     * @param ptVie Le nombre de points de vie du personnage à créer
     * @param ptMana Le nombre de points de mana du personnage à créer
     * @param pourcentageAtt Le pourcentage d'attaque du personnage à créer
     * @param pourcentageMag Le pourcentage de magie du personnage à créer 
     * @param pourcentagePar Le pourcentage de chances de parade du personnage à créer
     * @param pourcentageResistMag Le pourcentage de résistance magique du personnage à créer
     * @param degAtt Les dégâts d'attaque du personnage à créer.
     * @param degMag Les dégâts magiques du personnage à créer.
     * @param distAttMax La portée d'attaque du personnage à créer
     * @param pos  La position du personnage à créer.
     */
    public Personnage(String nom, int ptVie, int ptMana, int pourcentageAtt, 
        int pourcentageMag, int pourcentagePar, int pourcentageResistMag,
        int degAtt, int degMag, int ptPar, int distAttMax, Point2D pos){
        super(ptVie, pourcentageAtt, pourcentagePar, degAtt, ptPar, new Point2D(pos));
        this.nom = nom;
        this.ptMana = ptMana;
        this.pourcentageMag = pourcentageMag;
        this.pourcentageResistMag = pourcentageResistMag;
        this.degMag = degMag;
        this.distAttMax = distAttMax;
    }
    
    /**
     * Déplace le personnage de 1 unité dans une direction aléatoire.
     */
    public void deplace(){
        Random generateur = new Random();
        
        //On tire au sort un nombre entier compris entre -1 et 1 symbolisant le déplacement selon l'axe des abscisses.
        int directionAleatoire = generateur.nextInt(3) - 1;
        this.getPos().translater(directionAleatoire, 0);
        
        //On répète ensuite le tirage pour déterminer un déplacement vertical.
        
        directionAleatoire = generateur.nextInt(3) - 1;
        this.getPos().translater(0, directionAleatoire);
        
        
        //Si l'on tombe deux fois sur 0, le personnage reste immobile.
        
    }
    
    
    
    /**
     * Affiche l'ensemble des caractéristiques du personnage à l'écran
     */
    public void affiche(){
        
        System.out.println("Fiche de caractéristiques de " + this.nom+ " :" + "\n"
        + "Points de Vie : " + this.getPtVie() + "\n"
        + "Points de Mana : " + this.ptMana + "\n"
        + "Taux de précision physique : " + this.getPourcentageAtt() + "\n"
        + "Taux de précision magique : " + this.pourcentageMag + "\n"
        + "Taux de parade : " + this.getPourcentagePar() + "\n"
        + "Taux de résistance magique : " + this.pourcentageResistMag + "\n"
        + "Dégâts d'attaque : " + this.getDegAtt() + "\n"
        + "Dégâts Magiques : " + this.degMag + "\n"
        + "Portée d'attaque : " + this.distAttMax + "\n"
        + "Position Actuelle : " + this.getPos().toString() + "\n");
    }
}
