package projet.cinema;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.String.valueOf;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Film {
    
    private String identifiant;
    private String titre;
    private String realisateur;
    private LocalDate datesortie;
    private String genre;
    private String salle;
    private String resume;
    private double notepresse;
    private List<String> casting;
    private int duree;
    
    

    public Film(String identifiant, String titre, String realisateur, LocalDate datesortie, String genre, String salle, String resume, double notepresse, List<String> casting, int duree) {
        this.identifiant = identifiant;
        this.titre = titre;
        this.realisateur = realisateur;
        this.datesortie = datesortie;
        this.genre = genre;
        this.salle = salle;
        this.resume = resume;
        this.notepresse = notepresse;
        this.casting = casting;
        this.duree = duree;
    }

    //Ce constructeur a été créé pour résoudre une erreur de types dans la méthode RechercheFilmParnom
    private Film(String titre, String realisateur, int annee, String genre) {
        throw new UnsupportedOperationException("Not supported yet."); 
     }
    
   //on définit toutes les méthodes get qui nous serviront lors des recherche
    public String getIdentifiant() {
        return identifiant;
    }

    public String getTitre() {
        return titre;
    }

    public String getRealisateur(){
        return realisateur;
    }
    
    public LocalDate getDateSortie(){
        return datesortie;
    }
    
    public String getGenre() {
        return genre;
    }
    
    public String Getsalle(){
        return salle;
    }

    public String getResume(){
        return resume;
    }

    public double getNotePresse(){
        return notepresse;
    }
    
    public List<String> getCasting(){
        return casting;
    }
    
    public int getDuree(){
        return duree;
    }
    

    //Cette méthode permet d'ajouter un film dans une liste, que l'on transfère dans un fichier texte
    public static void ajouterFilm(List<Film> films) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Identifiant : ");
        String identifiant = sc.nextLine();

        System.out.print("Titre : ");
        String titre = sc.nextLine();

        System.out.print("Réalisateur : ");
        String realisateur = sc.nextLine();

        System.out.print("Date de sortie (yyyy-mm-dd) : ");
        LocalDate dateSortie = LocalDate.parse(sc.nextLine());

        System.out.print("Genre : ");
        String genre = sc.nextLine();

        System.out.print("Salle : ");
        String salle = sc.nextLine();

        System.out.print("Résumé : ");
        String resume = sc.nextLine();

        System.out.print("Note de presse : ");
        float notePresse = Float.parseFloat(sc.nextLine());

        System.out.print("Durée : ");
        int duree = Integer.parseInt(sc.nextLine());

        List<String> casting = new ArrayList<>();
        System.out.println("Saisissez le casting (terminer avec une ligne vide) : ");
        String acteur = sc.nextLine();
        while (!acteur.isEmpty()) {
            casting.add(acteur);
            acteur = sc.nextLine();
        }
        films.add(new Film(identifiant, titre, realisateur, dateSortie, genre, salle, resume, notePresse, casting, duree));
    }

    //Cette méthode permet de chercher un film grâce à son nom, en utilisant contains, l'utilisateur n'est pas obligé d'écrire le nom en entier
    public static List<Film> chercherFilmParNom(List<Film> films, String nom) {
    List<Film> filmsTrouves = new ArrayList<>();
    for (int i = 0; i < films.size(); i++) {
        if (films.get(i).getTitre().contains(nom)) {
            filmsTrouves.add(films.get(i));
        }
    }
    return filmsTrouves;
}
    //Cette permet d'enregistrer le film afin qu'il ne soit pas écrasé lorsque l'on ajoute un nouveau film
    public static void sauvegarderFilms(String cheminFichier, List<Film> films) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter(cheminFichier, true));
        for (Film film : films) {
            StringBuilder sb = new StringBuilder();
            sb.append(film.getTitre()).append(",");
            sb.append(film.getRealisateur()).append(",");
            sb.append(film.getDateSortie()).append(",");
            sb.append(film.getGenre());
            pw.println(sb.toString());
        }
    pw.close();
    }
}