package Banque;

public class Programme {
    public static void main(String[] args) {
    CompteBancaire compteBancaire = new CompteBancaire(1,new Client(3,"di"), 123.3,"A");
        System.out.println(compteBancaire.retirer(122));
        System.out.println(compteBancaire.deposer(150));
        System.out.println(compteBancaire.afficher());
}}
