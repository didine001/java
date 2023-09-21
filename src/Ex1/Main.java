package Ex1;

public class Main {
    public static void main(String[] args) {
        Exercice1 exercice1 = new Exercice1();
        String s = "didine"; //enidid
        String reversed = exercice1.reverseString(s);
        System.out.println(reversed);
        String pyramid = Exercice1.pyramid("*", 11);
        System.out.println(pyramid);
        int sum = exercice1.sum();
        System.out.println(sum);
        boolean pair = exercice1.verifyPairImpair();
        System.out.println(pair);
        exercice1.rightNumber();
    }
}
