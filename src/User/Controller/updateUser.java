package User.Controller;

import User.Models.Utilisateur;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class updateUser {
    private Connection connexion;

    public updateUser() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://db4free.net:3306/javaamandineguen";
            String utilisateur = "didine712";
            String motDePasse = "Admin123";

            connexion = DriverManager.getConnection(url, utilisateur, motDePasse);
        } catch (ClassNotFoundException | SQLException e) {
            e.getMessage();
        }
    }

    public void updateUser(Utilisateur utilisateur) throws SQLException {
        String updateQuery = "UPDATE Utilisateur SET nom = ?, prenom = ?, email = ? WHERE ID = ?";
        try (PreparedStatement preparedStatement = connexion.prepareStatement(updateQuery)) {
            preparedStatement.setString(1, utilisateur.getNom());
            preparedStatement.setString(2, utilisateur.getPrenom());
            preparedStatement.setString(3, utilisateur.getAdresseEmail());
            preparedStatement.setInt(4, utilisateur.getId());
            preparedStatement.executeUpdate();
        }
    }
}
