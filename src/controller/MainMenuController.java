package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import main.Main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * FXML Controller class
 *
 * @author Jakub
 */
public class MainMenuController implements Initializable {
    /**
     * Initializes the controller class.
     */


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void newGameAction(ActionEvent event) throws IOException {
        Main.loadFXML("SettingNewGame", 490, 580);

    }

    @FXML
    private void closeGameAction(ActionEvent event) {
        System.exit(0);
    }
}