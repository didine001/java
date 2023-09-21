package User.Controller;

import User.Models.Utilisateur;

import java.sql.*;

public class CreateUser {
    private Connection connexion;

    public CreateUser() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://db4free.net:3306/javaamandineguen";
            String utilisateur = "didine712";
            String motDePasse = "Admin123";

            connexion = DriverManager.getConnection(url, utilisateur, motDePasse);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void createUser(Utilisateur utilisateur) {
        String insertQuery = "INSERT INTO Utilisateur (nom, prenom, email) VALUES (?, ?, ?)";
        try (PreparedStatement preparedStatement = connexion.prepareStatement(insertQuery)) {
            preparedStatement.setString(1, utilisateur.getNom());
            preparedStatement.setString(2, utilisateur.getPrenom());
            preparedStatement.setString(3, utilisateur.getAdresseEmail());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.getStackTrace();
        }
    }
}

