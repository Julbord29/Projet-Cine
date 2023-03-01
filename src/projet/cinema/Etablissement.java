package projet.cinema;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author julie
 */
public class Etablissement {
    private static String nom;
    private String identifiant;
    private ArrayList<String> filmsProjetes;
    private ArrayList<String> seances;
    private String ville;
    private int nbplaces;
    private float tarifs;
    private float note;
    private static Film film;

    public Etablissement(String nom, String identifiant, ArrayList<String> filmsProjetes, ArrayList<String> seances, String ville, int nbplaces, float tarifs, float note) {
        this.nom = nom;
        this.identifiant = identifiant;
        this.filmsProjetes = filmsProjetes;
        this.seances = seances;
    }
    
    
    public static String getNom() {
        return nom;
    }
    
    public static Film getFilm() {
        return film;
    }
    
    public Etablissement chercherEtablissementParNom(List<Etablissement> listeEtablissement, String nom) {
    for (Etablissement etablissement : listeEtablissement) {
        if (Etablissement.getNom().equals(nom)) {
            return etablissement;
        }
    }
    return null;
    }
    
    //
    public static List<Etablissement> ChercherEtablissementParCritères(List<Etablissement> etablissements, String searchTerm) {
        List<Etablissement> resultat = new ArrayList<>();
        for (Etablissement etablissement : etablissements) {
            if (Etablissement.getNom().contains(searchTerm) ||
                Etablissement.getFilm().contains(searchTerm)) {
                resultat.add(etablissement);
            }
        }
        return resultat;
    }
}
 
