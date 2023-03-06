package projet.cinema;

import java.time.LocalDate;
import java.util.Scanner;


public class Administrateur extends Utilisateur {
    public String idAdmin;

    public Administrateur(String login, String motDePasse, LocalDate dateNaissance, String identifiant, String idAdmin, String motDePasseAdmin) {
        super(login, motDePasse, dateNaissance, identifiant);
        this.idAdmin = idAdmin;
        this.motDePasseAdmin = motDePasseAdmin;
        
        idAdmin = "Admin94";
        String motDePasseAdmin = "12345!";
        
    }
    
}
    

