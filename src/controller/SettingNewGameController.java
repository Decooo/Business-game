package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ToggleGroup;
import main.Main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * FXML Controller class
 *
 * @author Jakub
 */
public class SettingNewGameController implements Initializable {

    private static int selectedNumberOfPlayer;
    private static int selectedAmountOfMoney;
    @FXML
    private ToggleGroup amountOfMoney;
    @FXML
    private ToggleGroup numberOfPlayers;

    public static int getSelectedNumberOfPlayer() {
        return selectedNumberOfPlayer;
    }

    public static int getSelectedAmountOfMoney() {
        return selectedAmountOfMoney;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void backAction(ActionEvent event) throws IOException {
        Main.loadFXML("MainMenu", 490, 580);

    }

    @FXML
    private void startNewGameAction(ActionEvent event) throws IOException {
        String[] temp = amountOfMoney.getSelectedToggle().toString().split("'");
        selectedAmountOfMoney = Integer.parseInt(temp[1]);
        temp = numberOfPlayers.getSelectedToggle().toString().split("'");
        selectedNumberOfPlayer = Integer.parseInt(temp[1]);
        Main.loadFXML("Map", 1280, 720);

    }

}