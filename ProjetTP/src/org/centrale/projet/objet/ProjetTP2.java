/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

/**
 *
 * @author Vincent
 */
public class ProjetTP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        public class Point2D {
    private int x;
    private int y;
//Constructeur à partir de coordonnées
    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
//Constructeur sans paramètre    
      public Point2D() {
        this.x = 0;
        this.y = 0;
    }
      
      public Point2D(Point2D p) {
          this.x = p.x;
          this.y = p.y;
      }
      
      public void affichage() {
          System.out.println("[" + this.x +  " ; " +  this.y + "]");
      }
      
      public void translater(int a, int b) {
          this.x += a;
          this.y += b;
      }
      
      public void setPosition(int nouveau_x, int nouveau_y) {
          this.x = nouveau_x;
          this.y = nouveau_y;
      }
/**
 * Getters pour x
 * @return x
 */
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
/**
 * Setters pour x
 * @param x
 */
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
}

    }
    
}
