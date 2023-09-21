package User.Controller;

import User.Models.Utilisateur;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateUser {
    private Connection connexion;

    public UpdateUser() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");// connexion a la db

            String url = "jdbc:mysql://db4free.net:3306/javaamandineguen";//configuration de la connexion
            String utilisateur = "didine712";
            String motDePasse = "Admin123";

            connexion = DriverManager.getConnection(url, utilisateur, motDePasse);// connexion avec la config
        } catch (ClassNotFoundException | SQLException e) {//gestion des erreurs en cas d'exception
            e.getStackTrace();
        }
    }

    public void updateUser(Utilisateur utilisateur) throws SQLException {
        String updateQuery = "UPDATE Utilisateur SET nom = ?, prenom = ?, email = ? WHERE ID = ?";//requête sql pour update l'utilisateur
        try (PreparedStatement preparedStatement = connexion.prepareStatement(updateQuery)) { // remplissage des paramètres de la requête avec les donnes de l'utilisateur
            preparedStatement.setString(1, utilisateur.getNom());
            preparedStatement.setString(2, utilisateur.getPrenom());
            preparedStatement.setString(3, utilisateur.getAdresseEmail());
            preparedStatement.setInt(4, utilisateur.getId());
            preparedStatement.executeUpdate();
        }
    }
}
