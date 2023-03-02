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

public class Film {
    
    private int duree;
    private String identifiant;
    private String titre;
    private String realisateur;
    private String genre;
    private String datesortie;
    private ArrayList<String> casting;
    private String resume;
    private float notepresse;
    private String salle;

    public  Film(String titre, String realisateur, String genre, String identifiant, int duree, String datesortie, ArrayList<String> casting, String resume, float notepresse, String salle) {
        
        this.duree = duree;
        this.identifiant = identifiant;
        this.titre = titre;
        this.realisateur = realisateur;
        this.genre = genre;
        this.datesortie = datesortie;
        this.casting = casting;
        this.resume = resume;
        this.notepresse = notepresse;
        this.salle = salle;
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
    
    public String getDateSortie(){
        return datesortie;
    }
    
    public ArrayList<String> getCasting(){
        return casting;
    }
    
    public String getResume(){
        return resume;
    }
    
    public float getNotePresse(){
        return notepresse;
    }
    
    public String Getsalle(){
        return salle;
    }
    
    
}
   

    
