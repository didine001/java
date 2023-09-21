package Ex3;

public class Rectangle {
    private int Longueur;
    private int Largeur;

    public Rectangle(int longueur, int largeur) {
        this.Longueur = longueur;
        this.Largeur = largeur;
    }

    public String getSurface() {
        return "Ma surface est de " + Largeur * Longueur + " cm";
    }

    public String getCaracteristique() {
        return "Ma longueur est de " + Longueur + " cm";
    }
}
