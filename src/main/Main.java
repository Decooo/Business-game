package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private static Stage primaryStage;

    public static void main(String[] args) {
        launch(args);
    }

    public static void loadFXML(String nameFXML, int width, int height) throws IOException {
        Parent root = FXMLLoader.load(Main.class.getResource("../view/" + nameFXML + ".fxml"));
        primaryStage.setTitle("Business game");
        primaryStage.setScene(new Scene(root, width, height));
        primaryStage.centerOnScreen();
        primaryStage.show();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Main.primaryStage = primaryStage;
        loadFXML("MainMenu", 490, 580);
    }
}
