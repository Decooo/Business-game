package game;

import controller.MapController;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import player.ComputerPlayer;
import player.ListPlayers;
import player.Player;

import java.util.List;

/**
 * Created by Jakub on 08.02.2017.
 */
public class DrawPane {

    public void drawPawn() {
        ListPlayers listPlayers = new ListPlayers();
        for (int i = 0; i < listPlayers.sizeListPlayers(); i++) {
            if (i == 0) {
                Player play = (Player) listPlayers.getPlayer(i);
                int positionPlayer = play.getPositionPlayer();
                Color c = Color.BLUE;
                String namePane = "paneField" + play.getPositionPlayer();
                MapController map = new MapController();
               map.drawPane(map.getPaneField(positionPlayer - 1), c);


            } else if (i == 1) {
                ComputerPlayer play = (ComputerPlayer) listPlayers.getPlayer(i);
                int positionComputerPlayer = play.getPositionComputerPlayer();
                Color c = Color.RED;
                String namePane = "paneField" + play.getPositionComputerPlayer();
                MapController map = new MapController();
                map.drawPane(map.getPaneField(positionComputerPlayer - 1), c);
            } else if (i == 2) {
                ComputerPlayer play = (ComputerPlayer) listPlayers.getPlayer(i);
                int positionComputerPlayer = play.getPositionComputerPlayer();
                Color c = Color.GREEN;
                String namePane = "paneField" + play.getPositionComputerPlayer();
                MapController map = new MapController();
                map.drawPane(map.getPaneField(positionComputerPlayer - 1), c);
            } else if (i == 3) {
                ComputerPlayer play = (ComputerPlayer) listPlayers.getPlayer(i);
                int positionComputerPlayer = play.getPositionComputerPlayer();
                Color c = Color.YELLOW;
                String namePane = "paneField" + play.getPositionComputerPlayer();
                MapController map = new MapController();
                map.drawPane(map.getPaneField(positionComputerPlayer - 1), c);
            }
        }
    }

}
