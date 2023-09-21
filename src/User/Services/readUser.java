package User.Services;

import User.Models.Utilisateur;

import java.sql.*;

public class readUser {
    private Connection connexion;

    public readUser() {
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

    public Utilisateur readUser(int id) throws SQLException {
        String selectQuery = "SELECT * FROM Utilisateur WHERE ID = ?";
        try (PreparedStatement preparedStatement = connexion.prepareStatement(selectQuery)) {
            preparedStatement.setInt(1, id);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    Utilisateur utilisateur = new Utilisateur(2, "Gate", "bill", "billggate@gmail.com");
                    utilisateur.getNom();
                    utilisateur.getPrenom();
                    utilisateur.getAdresseEmail();
                    return utilisateur;
                }
            }
        }
        return null;
    }
}
