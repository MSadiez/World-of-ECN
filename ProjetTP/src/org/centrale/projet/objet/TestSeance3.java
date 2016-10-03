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
public class TestSeance3{
    public static void main(String[] args) {
        
        //Test de la création aléatoire d'instances de Creature
        World mondeTest = new World();
        mondeTest.creeMondeAlea(1000600);
        
        int compteur = 0;
        for (int i = 0; i <Constantes.TAILLE_MONDE; i++){
            for(int j = 0 ; j < Constantes.TAILLE_MONDE ; j++){
                if (mondeTest.getCartePositionsOccupees()[i][j] == true);
                    compteur++;
            }
        }
        System.out.println("Il y a : " + compteur + "protagonistes " + "\n");
        
        
       
        //Boucle de parcours de conteneur basé sur le nombre d'éléments
        compteur = 0;
        
        for(Creature c : mondeTest.getCreatures()){
            compteur++ ;
            c.affiche();
            System.out.println("On a fait "+compteur+" tours de boucle"+"\n");
        }
       
    
    
    //Comparaison des différents conteneurs Java
    //Cas de la LinkedList
    //Avec boucle basée sur la taille du conteneur
        int nombreProtag = 100;
        mondeTest.creeMondeAlea(nombreProtag);
        int barycentreX = 0;
        int barycentreY = 0;
        long debutN = System.nanoTime();
        
        for(int i = 0 ; i < mondeTest.getCreatures().size() ; i++){
            barycentreX = barycentreX + mondeTest.getCreatures().get(i).getPos().getAbscisse();
            barycentreY = barycentreY + mondeTest.getCreatures().get(i).getPos().getOrdonnee();
        }
        barycentreX = barycentreX/nombreProtag;
        barycentreY = barycentreY/nombreProtag;
        long finN = System.nanoTime();
        System.out.println("Le barycentre de l'ensemble des protagonistes est situé en : " + barycentreX +";"+ barycentreY);
        System.out.println("Temps écoulé en ns : "+ (finN-debutN) + "\n");
        
        
     //Avec boucle basée sur les itérateurs
        barycentreX = 0;
        barycentreY = 0;
        long debutNN = System.nanoTime();
        for(Creature c : mondeTest.getCreatures()){
            barycentreX = barycentreX + c.getPos().getAbscisse();
            barycentreY = barycentreY + c.getPos().getOrdonnee();
        }
        barycentreX = barycentreX/nombreProtag;
        barycentreY = barycentreY/nombreProtag;
        long finNN = System.nanoTime();
        System.out.println("Le barycentre de l'ensemble des protagonistes est situé en : " + barycentreX +";"+ barycentreY);
        System.out.println("Temps écoulé en ns : "+ (finNN-debutNN)+ "\n");
    }
}
