package projet.cinema;

import java.time.LocalDate;


public class Utilisateur {
    private String login;
    private String motDePasse;
    private LocalDate dateNaissance;
    private String identifiant;

    public Utilisateur(String login, String motDePasse, LocalDate dateNaissance, String identifiant) {
        this.login = login;
        this.motDePasse = motDePasse;
        this.dateNaissance = dateNaissance;
        this.identifiant = identifiant;
    }
    
}
