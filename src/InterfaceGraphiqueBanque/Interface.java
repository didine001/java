package InterfaceGraphiqueBanque;

import Banque.Client;
import Banque.CompteBancaire;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interface extends JFrame {
    private CompteBancaire compteBancaire;

    private JTextField montantField;
    private JTextArea resultatArea;

    public Interface() {
        compteBancaire = new CompteBancaire(12345, new Client(1, "Doe"), 1000.0, "Compte Courant"); // on crée un objet CompteBancaire

        // Initialisation des composants de l'interface utilisateur
        montantField = new JTextField(10); //Zone de texte pour saisir le montant
        resultatArea = new JTextArea(5, 40); // Zone de texte pour afficher les résultats
        JButton deposerButton = new JButton("Déposer"); // Bouton pour déposer de l'argent
        JButton retirerButton = new JButton("Retirer"); // Bouton pour retirer de l'argent

        // Configuration de la fenêtre principale
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Configuration des couleurs des boutons
        retirerButton.setForeground(Color.WHITE);
        retirerButton.setBackground(Color.decode("#2D215A"));
        deposerButton.setForeground(Color.WHITE);
        deposerButton.setBackground(Color.decode("#2D215A"));


        add(new JLabel("Montant:")); // Étiquette pour le champ de saisie
        add(montantField); // Champ de saisie du montant
        add(deposerButton); // Bouton Déposer
        add(retirerButton); // Bouton Retirer
        add(resultatArea); // Zone de texte pour afficher les résultats

        // Configuration des actions des boutons
        deposerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double montant = Double.parseDouble(montantField.getText()); // Récupération du montant saisi
                String message = compteBancaire.deposer(montant); // Appel à la méthode deposer du CompteBancaire
                resultatArea.append(message + "\n"); // Affichage du message résultant dans la zone de texte
            }
        });

        retirerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double montant = Double.parseDouble(montantField.getText()); // Récupération du montant saisi
                String message = compteBancaire.retirer(montant); // Appel à la méthode retirer du CompteBancaire
                resultatArea.append(message + "\n"); // Affichage du message résultant dans la zone de texte
            }
        });

        resultatArea.setFont(new Font("arial", Font.PLAIN, 16)); // Configuration de la police de la zone de texte

        pack(); // Ajuste la taille de la fenêtre en fonction de son contenu
        setVisible(true); // Rend la fenêtre principale visible
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Interface(); // Crée une instance de l'interface utilisateur
            }
        });
    }
}
