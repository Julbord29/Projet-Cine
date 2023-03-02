package projet.cinema;

/*
Projet Portail de Cinema
BORDIER Julien et ANSALDI Enzo
*/
/*
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
*/

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class PortailDeCinema{
    public static void main(String[] args) {
            // Création de la liste de films
             List<Film> films = new ArrayList<>();
            List<String> casting1 = new ArrayList<>();
            casting1.add("Casting 1");
            casting1.add("Casting 2");
            films.add(new Film("001", "The Shawshank Redemption", "Frank Darabont", "19/02/2022", "Drama", "Nice", "Le film parle de rien", 4.5, casting1, 135));
            List<String> casting2 = new ArrayList<>();
            casting2.add("Casting 3");
            casting2.add("Casting 4");
            films.add(new Film("002", "The Godfather", "Francis Ford Coppola", "12/03/1972", "Crime","Marseille", "Le film parle de tout", 3.6, casting2, 132));
            List<String> casting3 = new ArrayList<>();
            casting3.add("Casting 5");
            casting3.add("Casting 6");
            films.add(new Film("003", "The Dark Knight", "Christopher Nolan", "05/02/2008", "Action","Paris", "Le film parle de rien du tout", 4.5, casting3, 90));

            // Écriture de la liste de films dans un fichier texte
            File file = new File("films.txt");
            try {
                PrintWriter fich = new PrintWriter(file);
                for (Film film : films) {
                    fich.println(film.getIdentifiant() + "," + film.getTitre() + "," + film.getRealisateur() + "," + film.getDateSortie() + "," + film.getGenre() + 
                            "," + film.Getsalle() + "," + film.getResume() + "," + film.getNotePresse() + "," + film.getCasting() + "," + film.getDuree());
                }
                fich.close();
                System.out.println("La liste de films a été enregistrée dans le fichier " + file.getName());
            } catch (Exception e) {
                System.out.println("Erreur : " + e.getMessage());
            }
        }
    }


