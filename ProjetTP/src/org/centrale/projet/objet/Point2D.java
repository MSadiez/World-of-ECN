/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

/**
 * Classe utilisée pour représenté un point du plan cartésien.
 * @author Mathéo
 */
public class Point2D {
    
    /**
     * L'abscisse du point considéré.
     */
    private int abscisse;
    
    /**
     * L'ordonnée du point considéré.
     */
    private int ordonnee;

    public int getAbscisse() {
        return abscisse;
    }

    public void setAbscisse(int abscisse) {
        this.abscisse = abscisse;
    }

    public int getOrdonnee() {
        return ordonnee;
    }

    public void setOrdonnee(int ordonnee) {
        this.ordonnee = ordonnee;
    }
    
    public void afficher(){
        System.out.println("[" + abscisse + " ; " + ordonnee + "]");
    }
    
    /**
     * Permet de définir simultanément les deux coordonnées d'un point cartésien.
     * @param x L'abscisse souhaitée pour le point.
     * @param y L'ordonnée souhaitée pour le point.
     */
    public void setPosition(int x, int y){
        this.abscisse = x;
        this.ordonnee = y;
    }
    
    /**
     * Permet de transformer un point cartésien selon une translation de vecteur (x,y)
     * @param x L'abscisse du vecteur de translation.
     * @param y L'ordonnée du vecteur de translation.
     */
    public void translater(int x, int y){
        this.abscisse += x;
        this.ordonnee += y;
    }
    
    public Point2D(){
        this.abscisse = 0;
        this.ordonnee = 0;
    }
    
    public Point2D(int x, int y){
        this.abscisse = x;
        this.ordonnee = y;
    }
    
    public Point2D(Point2D pointACopier){
        this.abscisse = pointACopier.getAbscisse();
        this.ordonnee = pointACopier.getOrdonnee();
    }
    
    @Override
    public String toString(){
        return("[ " + this.abscisse + ";" + this.ordonnee + " ]");
    }
    
    @Override
    public boolean equals(Object o){
        if ((o instanceof Point2D) && ( this.abscisse == ((Point2D)o).getAbscisse() ) && ( this.ordonnee == ((Point2D)o).getOrdonnee())) {
            return true;
    }
        return false;
    }
    
    /**
     * Calcule le nombre de mouvements nécessaire pour se déplacer de la position actuelle jusqu'au point pointDistant.
     * @param pointDistant Le point duquel on veut connaître la distance.
     * @return La distance entre le point entré en argument et le point appelant la méthode.
     */
    public int distance(Point2D pointDistant){        
        return ((int) Math.floor(Math.hypot((this.abscisse - pointDistant.getAbscisse()), (this.ordonnee - pointDistant.getOrdonnee()))));
    }
}
