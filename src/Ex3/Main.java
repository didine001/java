package Ex3;

public class Main {
    public static void main(String[] args) {
        Utilisateur utilisateur = new Utilisateur("Didine", 2004, "France");
        System.out.println(utilisateur.giveName());
        System.out.println(utilisateur.giveAge());
        Voiture voiture = new Voiture(45, "rouge", "porshe", 1993);
        System.out.println(voiture.Vitesse());
        System.out.println(voiture.Caracteristiques());
        Rectangle rectangle = new Rectangle(2, 2);
        System.out.println(rectangle.getCaracteristique());
        System.out.println(rectangle.getSurface());
        Square s = new Square(10,10);
        System.out.println(s.getSurface());
    }
}