package User.serialisationDeserialisation;

import User.Controller.UtilisateurDto;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UserDeserialisation {
    public static void main(String[] args) {
        String fichier = "C:\\Users\\aguen\\Documents\\java\\src\\Database\\Data\\utilisateurDTO.json"; // on d�finit le chemin du fichier pour d�s�rialiser le JSON

        try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) { // on lit le fichier et on construit une cha�ne JSON
            StringBuilder jsonString = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                jsonString.append(line);
            }
            JSONObject jsonObject = new JSONObject(jsonString.toString()); // on cr�e un objet JSON � partir de la cha�ne
            int id = jsonObject.getInt("id");  // on extrait les donn�es JSON pour cr�er un objet UtilisateurDto
            String nom = jsonObject.getString("nom");
            String prenom = jsonObject.getString("prenom");
            String email = jsonObject.getString("email");

            UtilisateurDto utilisateurDto = new UtilisateurDto(id, nom, prenom, email); // on cr�e un objet UtilisateurDto � partir des donn�es JSON

            System.out.println("Objet utilisateurDto d�s�rialis� : " + utilisateurDto.tostring()); // on affiche la d�s�rialisation a �t� effectu�e avec succ�s
        } catch (IOException e) { //gestion d'exception
            e.printStackTrace();
        }
    }
}
