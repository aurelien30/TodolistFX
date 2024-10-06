package appli;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StartApplication extends Application {
    static Stage mainStage;
    @Override
    public void start(Stage stage) throws IOException {

        mainStage = stage;

        FXMLLoader fxmlLoader = new FXMLLoader(StartApplication.class.getResource("accueil/loginView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        mainStage.setTitle("Hello!");
        mainStage.setScene(scene);
        mainStage.show();
    }

    public static void changeScene(String fichierFxml ) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(StartApplication.class.getResource("accueil/Inscription.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        mainStage.setTitle("Hello!");
        mainStage.setScene(scene);
        mainStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
