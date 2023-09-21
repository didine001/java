package Ex3;

import java.time.LocalDateTime;

public class Utilisateur {
    private String Nom;
    private int AnneeNaissance;
    private String Pays;

    public Utilisateur(String nom, int annee, String pays) {
        this.Nom = nom;
        this.AnneeNaissance = annee;
        this.Pays = pays;
    }

    public String giveName() {
        return "Salut mon nom est " + Nom;
    }

    public String giveCountry() {
        return "Je viens de " + Pays;
    }

    public String giveAge() {
        LocalDateTime dateTime = LocalDateTime.now();
        int anneeActuelle = dateTime.getYear();
        int age = anneeActuelle - AnneeNaissance;
        return "Mon age est " + age;
    }
}
