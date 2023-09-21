package Ex4;

public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        int adresseMemoire1 = System.identityHashCode(singleton1);
        int adresseMemoire2 = System.identityHashCode(singleton2);

        System.out.println("Adresse mémoire du premier singleton : " + adresseMemoire1);
        System.out.println("Adresse mémoire du deuxième singleton : " + adresseMemoire2);

        if (adresseMemoire1 == adresseMemoire2) {
            System.out.println("Les deux instances ont la même adresse mémoire.");
        } else {
            System.out.println("Les deux instances ont des adresses mémoire différentes.");
        }
    }
}

