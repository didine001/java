package Ex2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Exercice2 {

    ////////////////// Compter nombre de mots dans une phrase  ///////////////
    public int countWords() {
        System.out.println("Taper une phrase ");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        int words = sentence.trim().split("\\s+").length;
        return words;
    }
    /////////////////////////////////////////////////////////////////////


    ////////////////// Sauvegarder une phrase dans un fichier ///////////////

    public void sentence() {
        System.out.println("Taper une phrase pour la mettre dans un fichier : ");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        try {
            Path path = Paths.get("C:\\dev\\textg.txt");
            if (!Files.exists(path.getParent())) {
                Files.createDirectories(path.getParent());
            }
            if (!Files.exists(path)) {
                Files.createFile(path);
            }
            PrintWriter writer = new PrintWriter(path.toFile());
            writer.println(sentence);
            writer.close();

            System.out.println("La phrase a été enregistrée.");
        } catch (IOException exception) {
            System.out.println("Erreur : " + exception);
        }
    }
    /////////////////////////////////////////////////////////////////////


    ///////////////// Lire du texte dans un fichier ///////////
    public void readText() {
        System.out.println("Taper un chemin ");
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();
        Path p = Paths.get(filename);
        try {
            if (!Files.exists(p)) {
                System.out.println("Le fichier n'existe pas dans le chemin.");
                return;
            }
            String fileContent = Files.readString(p);
            int wordCount = fileContent.trim().split("\\s+").length;
            System.out.println("Le nombre de mots dans le fichier est : " + wordCount);
        } catch (IOException exception) {
            System.out.println("Erreur : " + exception);
        }
    }
}
