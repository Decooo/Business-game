package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

import static controller.SettingNewGameController.*;

public class MapController implements Initializable {

    final static int numberOfPlayers = getSelectedNumberOfPlayer();
    final static int startingAmountOfMoney = getSelectedAmountOfMoney();
    final static String playerName = getPlayerName();

    @FXML
    private Label labelPlayer;
    @FXML
    private Label labelComputer1;
    @FXML
    private Label labelComputer2;
    @FXML
    private Label labelComputer3;

    @FXML
    private Pane paneComputer1;
    @FXML
    private Pane paneComputer2;
    @FXML
    private Pane paneComputer3;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        labelPlayer.setText(playerName + ": " + startingAmountOfMoney);
        if (numberOfPlayers == 2) {
            paneComputer1.setVisible(true);
        } else if (numberOfPlayers == 3) {
            paneComputer1.setVisible(true);
            paneComputer2.setVisible(true);
        } else if (numberOfPlayers == 4) {
            paneComputer1.setVisible(true);
            paneComputer2.setVisible(true);
            paneComputer3.setVisible(true);
        }
    }


}
