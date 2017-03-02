package updateDisplay;

import controller.SettingNewGameController;
import game.ColorComputerPlayer;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import player.ListPlayers;
import player.Player;

/**
 * Created by Jakub on 01.03.2017.
 */
public class DisplayPlayers {

    public static void displayPlayers(int numberOfPlayers, Pane paneComputer1, Pane paneComputer2, Pane paneComputer3) {
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
