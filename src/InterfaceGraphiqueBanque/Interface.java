
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
        compteBancaire = new CompteBancaire(12345, new Client(1, "Doe"), 1000.0, "Compte Courant");
        montantField = new JTextField(10);
        resultatArea = new JTextArea(5, 40);
        JButton deposerButton = new JButton("Déposer");
        JButton retirerButton = new JButton("Retirer");

        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        retirerButton.setForeground(Color.WHITE);
        retirerButton.setBackground(Color.decode("#2D215A"));
        deposerButton.setForeground(Color.WHITE);
        deposerButton.setBackground(Color.decode("#2D215A"));

        add(new JLabel("Montant:"));
        add(montantField);
        add(deposerButton);
        add(retirerButton);
        add(resultatArea);

        deposerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double montant = Double.parseDouble(montantField.getText());
                String message = compteBancaire.deposer(montant);
                resultatArea.append(message + "\n");
            }
        });

        retirerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double montant = Double.parseDouble(montantField.getText());
                String message = compteBancaire.retirer(montant);
                resultatArea.append(message + "\n");
            }
        });
        resultatArea.setFont(new Font("arial", Font.PLAIN, 16));

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Interface();
            }
        });
    }
}
