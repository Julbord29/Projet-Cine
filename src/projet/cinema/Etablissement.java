package projet.cinema;

import java.util.ArrayList;

/**
 *
 * @author julie
 */
public class Etablissement {
    private String nom;
    private String identifiant;
    private ArrayList<String> filmsProjetes;
    private ArrayList<String> seances;
    private String ville;
    private int nbplaces;
    private float tarifs;
    private float note;

    public Etablissement(String nom, String identifiant, ArrayList<String> filmsProjetes, ArrayList<String> seances, String ville, int nbplaces, float tarifs, float note) {
        this.nom = nom;
        this.identifiant = identifiant;
        this.filmsProjetes = filmsProjetes;
        this.seances = seances;
    }
    
}
 
