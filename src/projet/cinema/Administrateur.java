package projet.cinema;

import java.time.LocalDate;


public class Administrateur extends Utilisateur {
    private String idAdmin;

    public Administrateur(String login, String motDePasse, LocalDate dateNaissance, String identifiant, String idAdmin) {
        super(login, motDePasse, dateNaissance, identifiant);
        this.idAdmin = idAdmin;
    }
}
