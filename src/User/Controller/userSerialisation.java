package User.Controller;

import java.io.FileWriter;
import java.io.IOException;

public class userSerialisation {
    public static void main(String[] args) {
        utilisateurDto userDTO = new utilisateurDto(1, "Papa", "Cosy", "papaCosy@gmail.com");
        String fichier = "C:\\Users\\aguen\\Documents\\java\\src\\Database\\Data\\utilisateurDTO.json";

        try (FileWriter fileWriter = new FileWriter(fichier)) {
            String jsonString = "{\"id\":" + userDTO.getId() +
                    ",\"nom\":\"" + userDTO.getNom() +
                    "\",\"prenom\":\"" + userDTO.getPrenom() +
                    "\",\"email\":\"" + userDTO.getEmail() + "\"}";
            fileWriter.write(jsonString);

            System.out.println("utilisateurDto a été sérialisé dans " + fichier);
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
