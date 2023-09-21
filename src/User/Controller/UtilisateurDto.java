package User.Controller;

import java.io.Serializable;

public class UtilisateurDto implements Serializable {
    private final int id;
    private final String nom;
    private final String prenom;
    private final String email;

    public UtilisateurDto(int id, String nom, String prenom, String email) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getEmail() {
        return email;
    }

    public String tostring() {
        return "[Prenom : " + prenom + ", Nom : " + nom
                + ", Email : " + email + "]";
    }
}
