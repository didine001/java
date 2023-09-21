package Banque;

public class CompteBancaire {
    private int numeroCompte;
    private Client proprietaire;
    private double Solde;
    private String TypeCompte;

    public CompteBancaire(int numeroCompte, Client proprietaire, double solde, String typeCompte) {
        this.numeroCompte = numeroCompte;
        this.proprietaire = proprietaire;
        this.Solde = solde;
        this.TypeCompte = typeCompte;
    }

    public String deposer(double montant) {
        Solde += montant;
        return "Vous avez déposé " + Solde + "$ sur votre compte";
    }

    public String retirer(double montant) {
        if (montant > Solde) {
            return "Vous ne pouvez pas retirer, vous n'avez pas assez d'argent";
        } else {
            Solde -= montant;
            return "Retrait de " + montant + "$ effectué. Il reste " + Solde + "$ sur votre compte";
        }
    }

    public String afficher() {
        return "Il reste " + Solde + "$ sur votre compte";
    }
}
