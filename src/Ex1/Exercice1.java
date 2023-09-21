package Ex1;

import java.util.Random;
import java.util.Scanner;

public class Exercice1 {

    ////////////////// Renverser chaîne de caractères ///////////////////
    public String reverseString(String s) {
        String reverse = "";
        int n = s.length();
        for (int i = n - 1; i >= 0; i--) {
            reverse += s.substring(i, i + 1);
        }
        return reverse;
    }
    /////////////////////////////////////////////////////////////////////


    ////////////////// Afficher une pyramide ////////////////////////////
    public static String pyramid(String s, int length) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= length; i++) {
            for (int j = length - i; j >= 1; j--) {
                result.append(" ");
            }
            for (int k = 1; k <= i; k++) {
                result.append(s + " ");
            }
            result.append("\n");
        }
        return result.toString();
    }
    /////////////////////////////////////////////////////////////////////


    ////////////////// Calculer la somme des nombres de 1 à 10000 ///////
    public int sum() {
        int result = 10000 * 10001 / 2;
        return result;
    }
    /////////////////////////////////////////////////////////////////////


    ////////////////// Vérifier nombre pair et impair  //////////////////
    public boolean verifyPairImpair() {
        System.out.println("What is your number?");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int number2 = Integer.parseInt(number);
        return number2 % 2 == 0 ? true : false;
    }
    /////////////////////////////////////////////////////////////////////


    ////////////////// Trouver le bon nombre  ///////////////////////////
    public void rightNumber() {
        int tries = 0;
        Random rand = new Random();
        int rand2 = rand.nextInt(10);
        System.out.println("Guess the number");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String number = scanner.nextLine();
            int number2 = Integer.parseInt(number);
            if (number2 == rand2) {
                System.out.println("Bravo tu as trouvé le bon nombre en " + tries + " essais !");
                break;
            }
            System.out.println(number2 < rand2 ? "Plus grand" : "Plus petit");
            tries++;
        }
    }
}
