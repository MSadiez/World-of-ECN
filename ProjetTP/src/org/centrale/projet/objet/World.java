/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

import java.util.Random;

/**
 *
 * @author Mathéo
 */
public class World {
    /**
     * Instance d'Archer présente par défaut sur le monde
     */
    public Archer robin;
    
    /**
     * Instance de Paysan présente par défaut sur le monde
     */
    public Paysan peon;
    
   /**
    * Instance de Lapin présente par défaut sur le monde
    */
    public Lapin bugs;
    
    /**
     * Deuxième instance de Archer présente sur le monde
     */
    public Archer guillaumeT;
    
    /**
    * Instance de Mage présente par défaut sur le monde
    */
    public Mage gandalf;
    
    /**
    * Instance de Guerrier présente par défaut sur le monde
    */
    public Guerrier boromir;
    
    /**
    * Instance de Loup présente par défaut sur le monde
    */
    public Loup gmork;
    
    /**
     * Instance de potion de Soin
     */
    public Soin soin;
    
    /**
     * Instance de potion de Mana
     */
    public Mana mana;
    /**
     * Méthode qui crée le monde et place ses habitants
     */
    public World(){
        this.creeMondeAlea();
    };
    
    /**
     * Méthode qui va initialiser le monde et placer ses habitants au hasard.
     * On décide que l'instance d'Archer apparaît au centre de la carte (0,0), et que les autres instances apparaîssent dans un carré de côté 10 autour du centre
     */
    public void creeMondeAlea(){
        
        Random generateurAleatoire = new Random();
        
        robin = new Archer();
        //guillaumeT = new Archer();
        peon = new Paysan();
        bugs = new Lapin();
        gandalf = new Mage();
        boromir = new Guerrier();
        gmork = new Loup();
        soin = new Soin();
        mana = new Mana();
        
        int abscisseAleatoire = 0;
        int ordonneeAleatoire = 0;
        
        // On décide arbitrairement de placer l'archer au centre de la carte.
        Point2D positionArcher = new Point2D(0,0);
        
        // On place le paysan dans un rayon de 10 cases autour du centre de la carte.
        while (! CaseDispo(new Point2D(abscisseAleatoire, ordonneeAleatoire))){
            abscisseAleatoire = generateurAleatoire.nextInt(21) - 10;
            ordonneeAleatoire = generateurAleatoire.nextInt(21) - 10;
        }
        peon.setPos(new Point2D(abscisseAleatoire,ordonneeAleatoire));
        
        //On place le lapin dans un rayon de 10 cases autour du centre de la carte
        while (! CaseDispo(new Point2D(abscisseAleatoire, ordonneeAleatoire))){
            abscisseAleatoire = generateurAleatoire.nextInt(21) - 10;
            ordonneeAleatoire = generateurAleatoire.nextInt(21) - 10;
        }
        bugs.setPos(new Point2D(abscisseAleatoire, ordonneeAleatoire));
    
        //On place le Mage dans un rayon de 10 cases autour du centre de la carte
        while (! CaseDispo(new Point2D(abscisseAleatoire, ordonneeAleatoire))){
            abscisseAleatoire = generateurAleatoire.nextInt(21) - 10;
            ordonneeAleatoire = generateurAleatoire.nextInt(21) - 10;
        }
        gandalf.setPos(new Point2D(abscisseAleatoire, ordonneeAleatoire));
        
        //On place le Guerrier dans un rayon de 10 cases autour du centre de la carte
        while (! CaseDispo(new Point2D(abscisseAleatoire, ordonneeAleatoire))){
            abscisseAleatoire = generateurAleatoire.nextInt(21) - 10;
            ordonneeAleatoire = generateurAleatoire.nextInt(21) - 10;
        }
        boromir.setPos(new Point2D(abscisseAleatoire, ordonneeAleatoire));
        
        //On place le Loup dans un rayon de 10 cases autour du centre de la carte
        while (! CaseDispo(new Point2D(abscisseAleatoire, ordonneeAleatoire))){
            abscisseAleatoire = generateurAleatoire.nextInt(21) - 10;
            ordonneeAleatoire = generateurAleatoire.nextInt(21) - 10;
        }
        gmork.setPos(new Point2D(abscisseAleatoire, ordonneeAleatoire));
        
        // On place la potion de soin dans un rayon de 10 cases autour du centre de la carte.
        while (! CaseDispo(new Point2D(abscisseAleatoire, ordonneeAleatoire))){
            abscisseAleatoire = generateurAleatoire.nextInt(21) - 10;
            ordonneeAleatoire = generateurAleatoire.nextInt(21) - 10;
        }
        soin.setPosition(new Point2D(abscisseAleatoire,ordonneeAleatoire));
      
        // On place la potion de mana dans un rayon de 10 cases autour du centre de la carte.
        while (! CaseDispo(new Point2D(abscisseAleatoire, ordonneeAleatoire))){
            abscisseAleatoire = generateurAleatoire.nextInt(21) - 10;
            ordonneeAleatoire = generateurAleatoire.nextInt(21) - 10;
        }
        mana.setPosition(new Point2D(abscisseAleatoire,ordonneeAleatoire));
    };
    
    public boolean CaseDispo(Point2D position){
        boolean estDisponible = true;
        if(bugs.getPos().equals(position)){
            estDisponible = false;
        }
        if(robin.getPos().equals(position)){
            estDisponible = false;
        }
//        if(guillaumeT.getPos().equals(position)){
//            estDisponible = false;
//        }
        if(peon.getPos().equals(position)){
            estDisponible = false;
        }
        if(gandalf.getPos().equals(position)){
            estDisponible = false;
        }
        if(boromir.getPos().equals(position)){
            estDisponible = false;
        }
        if(gmork.getPos().equals(position)){
            estDisponible = false;
        }

        return estDisponible;
    }
    
    /**
     * Affiche les positions de chaque instance présente dans le monde, qu'elle soit Créature ou Objet
     */
    public void afficheWorld(){
    
        robin.affiche();
        bugs.affiche();
        peon.affiche();
        gandalf.affiche();
        boromir.affiche();
        gmork.affiche();
        soin.affiche();
        mana.affiche();
    }

    /**
     * Fait avancer le monde d'un tour en déplaçant tous les personnages présents.
     */
    public void tourDeJeu() {
            
        robin.deplace();
        bugs.deplace();
        peon.deplace();
        gandalf.deplace();
        boromir.deplace();
        gmork.deplace();
        
        System.out.println("Le jeu a avancé d''un tour !"+ "\n");

    }    
}
