/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

import java.util.Random;

import java.util.ArrayList;

/**
 *
 * @author Mathéo
 */
public class World {
    
    /**
     * Liste des creatures présentes dans l'instance de World.
     */
    private ArrayList<Creature> creatures;
       
    /**
     * Liste des objets présents dans l'instance de World.
     */
    private ArrayList<Objet> objets;
       
    /**
     * Matrice de booléens représentant par true les cases occupées et false les cases disponibles.
     */
    private boolean cartePositionsOccupees[][];
       
//=================================== Getters et Setters ===============================================================
    public ArrayList<Creature> getCreatures() {
        return creatures;
    }

    public void setCreatures(ArrayList<Creature> Creatures) {
        this.creatures = Creatures;
    }

    public ArrayList<Objet> getObjets() {
        return objets;
    }

    public void setObjets(ArrayList<Objet> Objets) {
        this.objets = Objets;
    }

    public boolean[][] getCartePositionsOccupees() {
        return cartePositionsOccupees;
    }

    public void setCartePositionsOccupees(boolean[][] cartePositionsOccupees) {
        this.cartePositionsOccupees = cartePositionsOccupees;
    }
//==============================================================================================    
    
    
    /**
     * Méthode qui crée le monde et place ses habitants
     */
    public World(){
        this.creatures = new ArrayList<>();
        this.objets = new ArrayList<>();
        this.initialiserCartePositions();
    };
    
    /**
     * Méthode permettant de remettre toutes les positions du monde à l'état disponible.
     */
    private void initialiserCartePositions(){
        cartePositionsOccupees = new boolean[Constantes.TAILLE_MONDE][Constantes.TAILLE_MONDE];
        for (boolean[] ligne : cartePositionsOccupees){
            for (boolean casePlateau : ligne){
                casePlateau = false;
            }
        }
    }
    
    /**
     * Méthode qui va initialiser le monde et placer ses habitants au hasard.
     * @param nombreProtagoniste Le nombre de Protagonistes souhaité;
     */
    public void creeMondeAlea(int nombreProtagoniste){
        
        Random generateurAleatoire = new Random();
        
        this.initialiserCartePositions();
        
        int nombreArchersAleatoire = generateurAleatoire.nextInt(nombreProtagoniste/5);
        int nombreGuerriersAleatoire = generateurAleatoire.nextInt(nombreProtagoniste/5);
        int nombreLoupsAleatoire = generateurAleatoire.nextInt(nombreProtagoniste/5);
        int nombreLapinsAleatoire = generateurAleatoire.nextInt(nombreProtagoniste/5);
        int nombrePaysansAleatoire = nombreProtagoniste - (nombreArchersAleatoire + nombreGuerriersAleatoire + nombreLapinsAleatoire + nombreLoupsAleatoire);
        
        int abscisseAleatoire = 0;
        int ordonneeAleatoire = 0;
        
        // On place aléatoirement les archers sur la carte.
        for (int i=0;i<nombreArchersAleatoire;i++){
            
            //System.out.println("Entrée dans la boucle de placement des archers");
            
            Archer nouvelArcher = new Archer();
            
            abscisseAleatoire = generateurAleatoire.nextInt(Constantes.TAILLE_MONDE);
            ordonneeAleatoire = generateurAleatoire.nextInt(Constantes.TAILLE_MONDE);
            
            while (! this.caseDispo(new Point2D(abscisseAleatoire, ordonneeAleatoire))){
                abscisseAleatoire = generateurAleatoire.nextInt(Constantes.TAILLE_MONDE);
                ordonneeAleatoire = generateurAleatoire.nextInt(Constantes.TAILLE_MONDE);
            }
            nouvelArcher.setPos(new Point2D(abscisseAleatoire, ordonneeAleatoire));
            creatures.add(nouvelArcher);            
            this.occuperCase(nouvelArcher);
            //System.out.println("Archer placé");
        }
        
        
        
        // On place aléatoirement les guerriers sur la carte.
        for (int i=0;i<nombreGuerriersAleatoire;i++){

            //System.out.println("Entrée dans la boucle de placement des guerriers");
            
            Guerrier nouveauGuerrier = new Guerrier();
            
            abscisseAleatoire = generateurAleatoire.nextInt(Constantes.TAILLE_MONDE);
            ordonneeAleatoire = generateurAleatoire.nextInt(Constantes.TAILLE_MONDE);
            
            while (! this.caseDispo(new Point2D(abscisseAleatoire, ordonneeAleatoire))){
                abscisseAleatoire = generateurAleatoire.nextInt(Constantes.TAILLE_MONDE);
                ordonneeAleatoire = generateurAleatoire.nextInt(Constantes.TAILLE_MONDE);
            }
            nouveauGuerrier.setPos(new Point2D(abscisseAleatoire, ordonneeAleatoire));
            creatures.add(nouveauGuerrier);            
            this.occuperCase(nouveauGuerrier);
        }
        
        
        // On place aléatoirement les paysans sur la carte.
        for (int i=0;i<nombrePaysansAleatoire;i++){
            
            Paysan nouveauPaysan = new Paysan();
            
            abscisseAleatoire = generateurAleatoire.nextInt(Constantes.TAILLE_MONDE);
            ordonneeAleatoire = generateurAleatoire.nextInt(Constantes.TAILLE_MONDE);
            
            while (! this.caseDispo(new Point2D(abscisseAleatoire, ordonneeAleatoire))){
                abscisseAleatoire = generateurAleatoire.nextInt(Constantes.TAILLE_MONDE);
                ordonneeAleatoire = generateurAleatoire.nextInt(Constantes.TAILLE_MONDE);
            }
            nouveauPaysan.setPos(new Point2D(abscisseAleatoire, ordonneeAleatoire));
            creatures.add(nouveauPaysan);            
            this.occuperCase(nouveauPaysan);
        }
        
        
        // On place aléatoirement les lapins sur la carte.
        for (int i=0;i<nombreLapinsAleatoire;i++){
            
            Lapin nouveauLapin = new Lapin();
            
            abscisseAleatoire = generateurAleatoire.nextInt(Constantes.TAILLE_MONDE);
            ordonneeAleatoire = generateurAleatoire.nextInt(Constantes.TAILLE_MONDE);
            
            while (! this.caseDispo(new Point2D(abscisseAleatoire, ordonneeAleatoire))){
                abscisseAleatoire = generateurAleatoire.nextInt(Constantes.TAILLE_MONDE);
                ordonneeAleatoire = generateurAleatoire.nextInt(Constantes.TAILLE_MONDE);
            }
            nouveauLapin.setPos(new Point2D(abscisseAleatoire, ordonneeAleatoire));
            creatures.add(nouveauLapin);            
            this.occuperCase(nouveauLapin);
        }
        
        
        // On place aléatoirement les loups sur la carte.
        for (int i=0;i<nombreLoupsAleatoire;i++){
            
            Loup nouveauLoup = new Loup();
            
            abscisseAleatoire = generateurAleatoire.nextInt(Constantes.TAILLE_MONDE);
            ordonneeAleatoire = generateurAleatoire.nextInt(Constantes.TAILLE_MONDE);
            
            while (! this.caseDispo(new Point2D(abscisseAleatoire, ordonneeAleatoire))){
                abscisseAleatoire = generateurAleatoire.nextInt(Constantes.TAILLE_MONDE);
                ordonneeAleatoire = generateurAleatoire.nextInt(Constantes.TAILLE_MONDE);
            }
            nouveauLoup.setPos(new Point2D(abscisseAleatoire, ordonneeAleatoire));
            creatures.add(nouveauLoup);            
            this.occuperCase(nouveauLoup);
        }
        };
    
    /**
     * Renvoie true si la position en entrée est disponible et false si une autre creature l'occupe déjà.
     * @param position La position dont on souhaite connaître la disponibilité.
     * @return true si la position en entrée est disponible et false si une autre creature l'occupe déjà
     */
    private boolean caseDispo(Point2D position){
        return (! cartePositionsOccupees[position.getAbscisse()][position.getOrdonnee()]);
    }
    
    /**
     * Marque comme occuppée sur la carte la position actuelle de la créature c.
     * @param c La créature dont on veut marquer la position.
     */
    private void occuperCase(Creature c){
        cartePositionsOccupees[c.getPos().getAbscisse()][c.getPos().getOrdonnee()] = true;
    }
    
    /**
     * Affiche les positions de chaque instance présente dans le monde, qu'elle soit Créature ou Objet
     */
    public void afficheWorld(){
    
        
    }

    /**
     * Fait avancer le monde d'un tour en déplaçant tous les personnages présents.
     */
    public void tourDeJeu() {
        
        System.out.println("Le jeu a avancé d''un tour !"+ "\n");

    }    
}
