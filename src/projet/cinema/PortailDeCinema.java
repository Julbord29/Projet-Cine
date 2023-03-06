package projet.cinema;

/*
Projet Portail de Cinema
BORDIER Julien et ANSALDI Enzo
*/
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.util.Scanner;


public class PortailDeCinema {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenue ! Que voulez-vous faire? ");
        System.out.println("Rechercher un Film (1) ");
        System.out.println("Rechercher une Salle de cinéma(2) ");
        System.out.println("Ajouter un film (réservé à l'admin) (3)");
        int Recherche = sc.nextInt();
        
        if (Recherche == 1){
            System.out.println("Quel film recherchez-vous?");
            sc = new Scanner(System.in);
            String RechercheFlm = sc.nextLine();
            System.out.println("Votre recherche : " + RechercheFlm);
            System.out.println("Résultats de la recherche : ");
        }
       
        else if (Recherche == 2) {
            System.out.println("Quelle salle de cinéma recherchez-vous?");
            sc = new Scanner(System.in);
            String RechercheSalle = sc.nextLine();
            System.out.println("Votre recherche : " + RechercheSalle);
            System.out.println("Résultats de la recherche : ");
        }
        
        else {
            // Création de la liste de films
            String[] rep = Utilisateur.connexion();
            String login = rep[0];
            String motDePasse = rep[1];
            
            if (login.equals(Administrateur.idAdmin)&& motDePasse.equals("12345")){
            
                
                String cheminFichier = "films.txt";
                List<Film> films = null;
                if (films == null){
                    films =  new ArrayList<>();
                    Film.ajouterFilm(films);
                }
                else{
                    Film.ajouterFilm(films);
                    Film.sauvegarderFilms(cheminFichier, films);
                }


                // Écriture de la liste de films dans un fichier texte
                File file = new File("films.txt");
                try {
                    PrintWriter fich = new PrintWriter(file);
                    for (Film film : films) {
                        fich.println(film.getIdentifiant() + "," + film.getTitre() + "," + film.getRealisateur() + "," + film.getDateSortie() + "," + film.getGenre() + "," + film.Getsalle() + "," + film.getResume() + "," + film.getNotePresse() + "," + film.getCasting() + "," + film.getDuree());
                    }
                    fich.close();
                    System.out.println("La liste de films a été enregistrée dans le fichier " + file.getName());
                } 
                catch (Exception e) {
                    System.out.println("Erreur : " + e.getMessage());
                }   
            }
            
            else {
               System.out.println("Identifiant admin incorrect ! ");
               System.out.println("Recommencer (1)");
               System.out.println("Retourner au Menu Principal (2)");
            }
        }
            
    }
}


