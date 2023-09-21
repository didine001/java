package User.Controller;

import User.Models.Utilisateur;

public class MainProgramme {
    public static void main(String[] args) {
        createUser create = new createUser();
        readUser read = new readUser();
        deleteUser delete = new deleteUser();
        updateUser update = new updateUser();

        Utilisateur nouvelUtilisateur = new Utilisateur(-1, "amandine", "guenassia", "aguenassia@gmail.com");
        try {
            create.createUser(nouvelUtilisateur);
            System.out.println("Utilisateur créé avec succès !");
        } catch (Exception e) {
            e.getMessage();
        }
        try {
            Utilisateur utilisateurLu = read.readUser(14);
            if (utilisateurLu != null) {
                System.out.println("Utilisateur lu : " + utilisateurLu.getNom() + " " + utilisateurLu.getPrenom() + " " + utilisateurLu.getAdresseEmail());
            } else {
                System.out.println("Utilisateur non trouvé.");
            }
        } catch (Exception e) {
            e.getMessage();
        }
        Utilisateur utilisateurUpdate = new Utilisateur(15, "NouveauNom", "NouveauPrenom", "nouveauemail@example.com");
        try {
            update.updateUser(utilisateurUpdate);
            System.out.println("Utilisateur mis à jour avec succès !");
        } catch (Exception e) {
            e.getMessage();
        }
        try {
            delete.deleteUser(15);
            System.out.println("Utilisateur supprimé avec succès !");
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
