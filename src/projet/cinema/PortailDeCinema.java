package projet.cinema;

/*
Projet Portail de Cinema
BORDIER Julien et ANSALDI Enzo
*/

import java.util.Scanner;


public class PortailDeCinema {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Film (1) ou Salle de Cinema (2)?");
        int Recherche = sc.nextInt();
        
        if (Recherche == 1){
            System.out.println("Quel film recherchez-vous?");
            sc = new Scanner(System.in);
            String RechercheFlm = sc.nextLine();
            System.out.println("Votre recherche : " + RechercheFlm);
        }
        
        else {
            System.out.println("Quelle salle de cinéma cherchez-vous?");
            sc = new Scanner(System.in);
            String RechercheSalle = sc.nextLine();
            System.out.println("Votre recherche : " + RechercheSalle);
        }
        
        System.out.println("Résultats de la recherche : ");
    }
    
}
