package projet.cinema;

import java.time.LocalDate;
import java.util.Scanner;


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
    
    public static String[] connexion(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez votre ID : ");
        String login = sc.nextLine();

        System.out.println("Saisissez votre Mot de Passe :");
        String motDePasse = sc.nextLine();

        return new String[]{login, motDePasse};
}
        
}

