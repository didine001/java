package User.Controller;

import User.Models.Utilisateur;

import java.sql.*;

public class CreateUser {
    private Connection connexion;

    public CreateUser() { // on connecte à la db jdbc
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://db4free.net:3306/javaamandineguen"; //configuration de la connexion
            String utilisateur = "didine712";
            String motDePasse = "Admin123";

            connexion = DriverManager.getConnection(url, utilisateur, motDePasse); // connexion avec la config
        } catch (ClassNotFoundException | SQLException e) { //gestion des erreurs en cas d'exception
            e.printStackTrace();
        }
    }

    public void createUser(Utilisateur utilisateur) {
        String insertQuery = "INSERT INTO Utilisateur (nom, prenom, email) VALUES (?, ?, ?)"; // requête sql pour inserer le nouvel user
        try (PreparedStatement preparedStatement = connexion.prepareStatement(insertQuery)) { // remplissage des paramètres de la requête avec les donnes de l'utilisateur
            preparedStatement.setString(1, utilisateur.getNom());
            preparedStatement.setString(2, utilisateur.getPrenom());
            preparedStatement.setString(3, utilisateur.getAdresseEmail());
            preparedStatement.executeUpdate(); // Exécution de la requête
        } catch (SQLException e) { //gestion des erreurs en cas d'exception
            e.getStackTrace();
        }
    }
}

