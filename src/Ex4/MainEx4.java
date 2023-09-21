package Ex4;

public class MainEx4 {
    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println("Adresse mémoire du premier singleton : " + singleton1);
        System.out.println("Adresse mémoire du deuxième singleton : " + singleton2);
        if (singleton1 == singleton2) {
            System.out.println("Les deux instances ont la même adresse mémoire.");
        } else {
            System.out.println("Les deux instances ont des adresses mémoire différentes.");
        }
    }
}