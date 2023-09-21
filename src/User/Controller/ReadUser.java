package User.Controller;

import User.Models.Utilisateur;

import java.sql.*;

public class ReadUser {
    private Connection connexion;

    public ReadUser() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // on se connecte à la db

            String url = "jdbc:mysql://db4free.net:3306/javaamandineguen";//configuration de la connexion
            String utilisateur = "didine712";
            String motDePasse = "Admin123";

            connexion = DriverManager.getConnection(url, utilisateur, motDePasse);// connexion avec la config
        } catch (ClassNotFoundException | SQLException e) { //gestion des erreurs en cas d'exception
            e.getStackTrace();
        }
    }

    public Utilisateur readUser(int id) throws SQLException {
        String selectQuery = "SELECT * FROM Utilisateur WHERE ID = ?";// requête sql pour lire l'utilisateur
        try (PreparedStatement preparedStatement = connexion.prepareStatement(selectQuery)) {// remplissage des paramètres de la requête avec les donnes de l'utilisateur
            preparedStatement.setInt(1, id); // id à la valeur de l'index 1 dans la requête
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) { // si l'utilisateur correspondant à l'ID spécifié existe dans la base de données)
                    Utilisateur utilisateur = new Utilisateur(2, "Gate", "bill", "billggate@gmail.com"); //on update avec ces infos
                    return utilisateur; // on renvoie les infos de l'utilisateur
                }
            }
        }
        return null;
    }
}
