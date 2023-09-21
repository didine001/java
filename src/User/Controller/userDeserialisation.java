package User.Controller;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class userDeserialisation {
    public static void main(String[] args) {
        String fichier = "C:\\Users\\aguen\\Documents\\java\\src\\Database\\Data\\utilisateurDTO.json";

        try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) {
            StringBuilder jsonString = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                jsonString.append(line);
            }
            JSONObject jsonObject = new JSONObject(jsonString.toString());

            int id = jsonObject.getInt("id");
            String nom = jsonObject.getString("nom");
            String prenom = jsonObject.getString("prenom");
            String email = jsonObject.getString("email");

            utilisateurDto utilisateurDto = new utilisateurDto(id, nom, prenom, email);

            System.out.println("Objet utilisateurDto désérialisé : " + utilisateurDto.tostring());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
