package User.Models;


public class Main {
    public static void main(String[] args) {
        Utilisateur utilisateur = new Utilisateur(1, "didine", "pro", "aguenassia@gmail.com");
        String prenom = utilisateur.getPrenom();
        System.out.println(prenom);
        String nom = utilisateur.getNom();
        System.out.println(nom);
        String email = utilisateur.getAdresseEmail();
        System.out.println(email);
    }
}
