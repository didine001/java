package User.Services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class deleteUser {
    private Connection connexion;

    public deleteUser() {
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

    public void deleteUser(int id) throws SQLException {
        String deleteQuery = "DELETE FROM Utilisateur WHERE ID = ?";
        try (PreparedStatement preparedStatement = connexion.prepareStatement(deleteQuery)) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        }
    }
}
