package updateDisplay;

import controller.SettingNewGameController;
import game.ColorComputerPlayer;
import javafx.scene.control.Label;
import player.ListPlayers;
import player.Player;

/**
 * Created by Jakub on 01.03.2017.
 */
public class RefreshLabelPlayers {

    public static void refreshLabelPlayer(Label labelPlayer, Label labelComputer1, Label labelComputer2, Label labelComputer3) {
        ListPlayers listPlayers = new ListPlayers();
        for (int i = 0; i < listPlayers.sizeListPlayers(); i++) {
            if (i == 0) {
                Player player = (Player) listPlayers.getPlayer(i);
                labelPlayer.setText(SettingNewGameController.getPlayerName() + " :  " + player.getAmountMoney());
            } else if (i == 1) {
                Player player = (Player) listPlayers.getPlayer(i);
                labelComputer1.setText("Komputer " + ColorComputerPlayer.fromValue(i) + " : " + player.getAmountMoney());
            } else if (i == 2) {
                Player player = (Player) listPlayers.getPlayer(i);
                labelComputer2.setText("Komputer " + ColorComputerPlayer.fromValue(i) + " : " + player.getAmountMoney());
            } else if (i == 3) {
                Player player = (Player) listPlayers.getPlayer(i);
                labelComputer3.setText("Komputer " + ColorComputerPlayer.fromValue(i) + " : " + player.getAmountMoney());
            }
        }
    }

}
