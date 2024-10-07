package appli.accueil;

import appli.StartApplication;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AccueilController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void SwitchToLogin(ActionEvent event) throws IOException {
        StartApplication.changeScene("accueil/loginView.fxml");

    }
}
