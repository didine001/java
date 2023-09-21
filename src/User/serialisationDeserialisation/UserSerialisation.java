package User.serialisationDeserialisation;

import User.Controller.UtilisateurDto;

import java.io.FileWriter;
import java.io.IOException;

public class UserSerialisation {
    public static void main(String[] args) {
        UtilisateurDto userDTO = new UtilisateurDto(1, "Papa", "Cosy", "papaCosy@gmail.com"); // on crée un utilisateurDTO
        String fichier = "C:\\Users\\aguen\\Documents\\java\\src\\Database\\Data\\utilisateurDTO.json";  // on définit le chemin du fichier où le JSON sera enregistré

        try (FileWriter fileWriter = new FileWriter(fichier)) { // on construit une chaîne JSON manuellement en utilisant les données de l'objet UtilisateurDto
            String jsonString = "{\"id\":" + userDTO.getId() +
                    ",\"nom\":\"" + userDTO.getNom() +
                    "\",\"prenom\":\"" + userDTO.getPrenom() +
                    "\",\"email\":\"" + userDTO.getEmail() + "\"}";
            fileWriter.write(jsonString);// on écrit la chaîne JSON dans le fichier

            System.out.println("utilisateurDto a été sérialisé dans " + fichier); //sérialisation faite avec succès
        } catch (IOException e) { //gestion d'exception
            e.getStackTrace();
        }
    }
}
