package Ex3;

public class Voiture {
    private float Vitesse;
    private String Couleur;
    private String Nom;
    private int Annee;

    public Voiture(float vitesse, String couleur, String nom, int annee) {
        this.Vitesse = vitesse;
        this.Couleur = couleur;
        this.Nom = nom;
        this.Annee = annee;
    }

    public String Vitesse() {
        return "La voiture roule à " + Vitesse;
    }

    public String Caracteristiques() {
        return "La voiture roule à " + Vitesse + " Km/h de couleur " + Couleur + " est une " + Nom + " de " + Annee;
    }
}
