package projet.cinema;

/*
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Film {
    private int duree;
    private String identifiant;
    private static String titre;
    private String genre;
    private LocalDate datesortie;
    private ArrayList<String> casting;
    private String resume;
    private float notepresse;
    private Etablissement salle;
    private final String Nom_Fichier_Utilisateur = "Utilisateurs.txt";
    private final String Nom_Fichier_Film = "Films.txt";
    private final String Nom_Fichier_Etablissement = "Calendriers.txt";

    public Film(int duree, String identifiant, String titre, String genre, LocalDate datesortie, ArrayList<String> casting, String résumé, float notepresse, Etablissement salle) {
        this.duree = duree;
        this.identifiant = identifiant;
        this.titre = titre;
        this.genre = genre;
        this.datesortie = datesortie;
        this.casting = casting;
        this.resume = resume;
        this.notepresse = notepresse;
        this.salle = salle;
    }
    
    
    @Override
    public String toString() {
        return "Identifiant: "+ identifiant +" | titre: "+ titre +" | genre:  "+ genre +" | Durée: " + duree +
           " | Date de Sortie:" + datesortie + " | Casting: "+ casting + " |Résumé: "+ resume + " |Note de Presse: " + notepresse +
           " | Salle :" + salle;
    }

        
    public Portail(String nom){
        portail = nom;
        
        
    }
    
    public static String getTitre() {
        return titre;
    }

    public String getGenre() {
        return genre;
    }

    public List<String> getCasting() {
        return casting;
    }
        
          
    public static List<Film> search(List<Film> films, String searchTerm) {
        List<Film> result = new ArrayList<>();
        for (Film film : films) {
            if (film.getTitre().contains(searchTerm) ||
                film.getGenre().contains(searchTerm) ||
                film.getCasting().contains(searchTerm)) {
                result.add(film);
            }
        }
        return result;
    }
   
   public void versFichierUtilisateur() throws IOException {
        FileWriter fich = new FileWriter(Nom_Fichier_Utilisateur);
        for (int i = 0;(i < ListeUtilisateurs.length)&&(ListeUtilisateurs[i] != null); i++) {
            String chaine = ListeUtilisateurs[i].versFichier();
            fich.write(chaine);
        }
        fich.close();
    }
    
    public Film chercherFilmParNom(List<Film> listeFilms, String Titre) {
    for (Film film : listeFilms) {
        if (Film.getTitre().equals(titre)) {
            return film;
        }
    }
    return null;
    }
}
*/

import java.io.File;
import java.io.PrintWriter;
import static java.lang.String.valueOf;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Film {
    
    private int duree;
    private String identifiant;
    private String titre;
    private String realisateur;
    private String genre;
    private LocalDate datesortie;
    private List<String> casting;
    private String resume;
    private double notepresse;
    private String salle;

 public Film(String identifiant, String titre, String realisateur, LocalDate datesortie, String genre, String salle, String resume, double notepresse, List<String> casting, int duree) {
    this.identifiant = identifiant;
    this.titre = titre;
    this.realisateur = realisateur;
    this.genre = genre;
    this.datesortie = datesortie;
    this.casting = casting;
    this.resume = resume;
    this.notepresse = notepresse;
    this.salle = salle;
    this.duree = duree;
}
    
   
    public String getIdentifiant() {
        return identifiant;
    }
    
    public String getTitre() {
        return titre;
    }

    public String getGenre() {
        return genre;
    }
    
    public String getRealisateur(){
        return realisateur;
    }

    public int getDuree(){
        return duree;
    }
    
    public LocalDate getDateSortie(){
        return datesortie;
    }
    
    public List<String> getCasting(){
        return casting;
    }
    
    public String getResume(){
        return resume;
    }
    
    public double getNotePresse(){
        return notepresse;
    }
    
    public String Getsalle(){
        return salle;
    }
    
    
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

    
    
}
   

    
