package appli.accueil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Window;
import model.Utilisateur;
import repository.UtilisateurRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import java.sql.SQLException;

public class InscriptionController {

    @FXML
    private TextField NomField;

    @FXML
    private TextField PrenomField;

    @FXML
    private TextField emailIdField;

    @FXML
    private PasswordField MotdepasseField;

    @FXML
    private Button inscriptionButton;

    @FXML
    public void inscriptionValidate(ActionEvent event) throws SQLException {

        Window owner = inscriptionButton.getScene().getWindow();
        System.out.println(NomField.getText());
        System.out.println(PrenomField.getText());
        System.out.println(emailIdField.getText());
        System.out.println(MotdepasseField.getText());

        if (NomField.getText().isEmpty()) {
            showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
                    "Please enter your name");
            return;
        }

        if (PrenomField.getText().isEmpty()) {
            showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
                    "Please enter your email id");
            return;
        }
        if (emailIdField.getText().isEmpty()) {
            showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
                    "Please enter a password");
            return;
        }
        if (MotdepasseField.getText().isEmpty()) {
            showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
                    "Please enter a password");
            return;
        }


        String nom = NomField.getText();
        String prenom = PrenomField.getText();
        String email = emailIdField.getText();
        String mot_de_passe = MotdepasseField.getText();

        BCryptPasswordEncoder cryptPasswordEncoder = new BCryptPasswordEncoder();


        UtilisateurRepository  UtilisateurRepository= new UtilisateurRepository();


        UtilisateurRepository.inscription(new Utilisateur(nom,prenom,email,cryptPasswordEncoder.encode(mot_de_passe)));
          UtilisateurRepository.getutilisateurByEmail(new Utilisateur(nom,prenom,email,cryptPasswordEncoder.encode(mot_de_passe)));
        showAlert(Alert.AlertType.CONFIRMATION, owner, "Registration Successful!",
                "Welcome " + NomField.getText());
    }

    private static void showAlert(Alert.AlertType alertType, Window owner, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.initOwner(owner);
        alert.show();
    }
}


