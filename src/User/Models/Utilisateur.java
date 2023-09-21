package User.Models;

import java.io.Serializable;

public class Utilisateur implements Serializable {
    private final int id;
    private final String nom;
    private final String prenom;
    private final String email;

    public Utilisateur(int id, String nom, String prenom, String email) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;

    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdresseEmail() {
        return email;
    }
}
