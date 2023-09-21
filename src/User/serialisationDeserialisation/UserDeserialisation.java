package User.serialisationDeserialisation;

import User.Controller.UtilisateurDto;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UserDeserialisation {
    public static void main(String[] args) {
        String fichier = "C:\\Users\\aguen\\Documents\\java\\src\\Database\\Data\\utilisateurDTO.json"; // on définit le chemin du fichier pour désérialiser le JSON

        try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) { // on lit le fichier et on construit une chaîne JSON
            StringBuilder jsonString = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                jsonString.append(line);
            }
            JSONObject jsonObject = new JSONObject(jsonString.toString()); // on crée un objet JSON à partir de la chaîne
            int id = jsonObject.getInt("id");  // on extrait les données JSON pour créer un objet UtilisateurDto
            String nom = jsonObject.getString("nom");
            String prenom = jsonObject.getString("prenom");
            String email = jsonObject.getString("email");

            UtilisateurDto utilisateurDto = new UtilisateurDto(id, nom, prenom, email); // on crée un objet UtilisateurDto à partir des données JSON

            System.out.println("Objet utilisateurDto désérialisé : " + utilisateurDto.tostring()); // on affiche la désérialisation a été effectuée avec succès
        } catch (IOException e) { //gestion d'exception
            e.printStackTrace();
        }
    }
}
