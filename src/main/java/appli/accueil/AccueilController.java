package appli.accueil;

import appli.StartApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.scene.control.TableColumn;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AccueilController implements Initializable {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void SwitchToLogin(ActionEvent event) throws IOException {
        StartApplication.changeScene("accueil/loginView.fxml");

    }

    @FXML
    private TableView<?> tableauListe;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        String[][] colonnes = {
                {"Id liste", "idListe"},
                {"Nom", "nom"},
        };

        //Pacourir l'ensemble de nos colonnes
        for (int i = 0; i < colonnes.length; i++) {
            //Créer la colonne avec le titre
            TableColumn<Liste, String> maColonne = new TableColumn<>(colonnes[i][0]);
            //Ligne permettant la liaison automatique de la cellule avec la propriété donné
            maColonne.setCellFactory(new PropertyValueFactory<Liste, String>(colonnes[i][1]));
            //Ajouter la colonne dans notre tableau
            tableauListe.getColumns().add(maColonne);
        }
    }
}

