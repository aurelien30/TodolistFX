package appli.accueil;

import appli.StartApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import model.Utilisateur;
import repository.UtilisateurRepository;

import java.io.IOException;


public class LoginController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void SwitchToInscription(ActionEvent event) throws IOException {
        StartApplication.changeScene("accueil/Inscription.fxml");

    }

    public void loginValidate(){

    }




    }


