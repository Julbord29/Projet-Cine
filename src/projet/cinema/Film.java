package projet.cinema;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Film {
    private int duree;
    private String identifiant;
    private String titre;
    private String genre;
    private LocalDate datesortie;
    private ArrayList<String> casting;
    private String résumé;
    private float notepresse;
    private Etablissement salle;

    public Film(int duree, String identifiant, String titre, String genre, LocalDate datesortie, ArrayList<String> casting, String résumé, float notepresse, Etablissement salle) {
        this.duree = duree;
        this.identifiant = identifiant;
        this.titre = titre;
        this.genre = genre;
        this.datesortie = datesortie;
        this.casting = casting;
        this.résumé = résumé;
        this.notepresse = notepresse;
        this.salle = salle;
    }
        
    public String getTitre() {
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
    
    
    
}
