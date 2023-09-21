package User.Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteUser {
    private Connection connexion;

    public DeleteUser() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  // on se connecte à la db

            String url = "jdbc:mysql://db4free.net:3306/javaamandineguen";
            String utilisateur = "didine712";
            String motDePasse = "Admin123";

            connexion = DriverManager.getConnection(url, utilisateur, motDePasse);// connexion avec la config
        } catch (ClassNotFoundException | SQLException e) { //gestion des erreurs en cas d'exception
            e.getStackTrace();
        }
    }

    public void deleteUser(int id) throws SQLException {
        String deleteQuery = "DELETE FROM Utilisateur WHERE ID = ?"; //requête sql pour supprimer l'utilisateur
        try (PreparedStatement preparedStatement = connexion.prepareStatement(deleteQuery)) {// remplissage des paramètres de la requête avec les donnes de l'utilisateur
            preparedStatement.setInt(1, id); // id à la valeur de l'index 1 dans la requête

            preparedStatement.executeUpdate(); //execute la requête
        }
    }
}
