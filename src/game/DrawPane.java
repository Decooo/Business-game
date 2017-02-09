package game;

import controller.MapController;
import javafx.scene.paint.Color;
import player.ComputerPlayer;
import player.ListPlayers;
import player.Player;

/**
 * Created by Jakub on 08.02.2017.
 */
public class DrawPane {

    private static double centerX = 0;
    private static double centerY = 0;

    private ListPlayers listPlayers = new ListPlayers();

    public void drawPawnAtTheStart() {
        MapController map = new MapController();
        int[] order = map.getOrderTrowing();


        for (int i = 0; i < order.length; i++) {
            int numberPawn = order[i];
            centerPawn(numberPawn+1, 120, 120);
            if (i == 0) {
                Color c = Color.BLUE;
                map.drawPane(map.getPaneField(0), c, centerX, centerY);
            } else if (i == 1) {
                Color c = Color.RED;
                map.drawPane(map.getPaneField(0), c, centerX, centerY);
            } else if (i == 2) {
                Color c = Color.GREEN;
                map.drawPane(map.getPaneField(0), c, centerX, centerY);
            } else if (i == 3) {
                Color c = Color.YELLOW;
                map.drawPane(map.getPaneField(0), c, centerX, centerY);
            }
        }
    }

    public void drawPawn(int i) {
        if (i == 0) {
            Color c = Color.BLUE;
            drawPlayerPawn(i, c);
        } else if (i == 1) {
            Color c = Color.RED;
            drawComputerPawn(i, c);
        } else if (i == 2) {
            Color c = Color.GREEN;
            drawComputerPawn(i, c);
        } else if (i == 3) {
            Color c = Color.YELLOW;
            drawComputerPawn(i, c);
        }
    }

    public void drawPlayerPawn(int i, Color c) {
        Player play = (Player) listPlayers.getPlayer(i);
        int positionPlayer = play.getPositionPlayer();
        MapController map = new MapController();
        double width = map.getPaneField(positionPlayer - 1).getWidth();
        double height = map.getPaneField(positionPlayer - 1).getHeight();
        numberPawnField(positionPlayer, width, height);
        map.drawPane(map.getPaneField(positionPlayer - 1), c, centerX, centerY);
    }

    public void drawComputerPawn(int i, Color c) {
        ComputerPlayer play = (ComputerPlayer) listPlayers.getPlayer(i);
        int positionComputerPlayer = play.getPositionComputerPlayer();
        MapController map = new MapController();
        double width = map.getPaneField(positionComputerPlayer - 1).getWidth();
        double height = map.getPaneField(positionComputerPlayer - 1).getHeight();
        numberPawnField(positionComputerPlayer, width, height);
        map.drawPane(map.getPaneField(positionComputerPlayer - 1), c, centerX, centerY);
    }

    public void numberPawnField(int position, double width, double height) {
        int numberPawn = 0;
        ListPlayers listPlayers = new ListPlayers();

        for (int i = 0; i < listPlayers.sizeListPlayers(); i++) {
            if (i == 0) {
                Player play = (Player) listPlayers.getPlayer(i);
                if (play.getPositionPlayer() == position) {
                    numberPawn++;
                }
            } else {
                ComputerPlayer play = (ComputerPlayer) listPlayers.getPlayer(i);
                if (play.getPositionComputerPlayer() == position) {
                    numberPawn++;
                }
            }
        }
        centerPawn(numberPawn, width, height);
    }

    public void centerPawn(int numberPawn, double width, double height) {
        if ((width == 80 && height == 120) || (width == 120 && height == 80)) {
            if (numberPawn == 1) {
                centerX = 28;
                centerY = 75;
            } else if (numberPawn == 2) {
                centerX = 52;
                centerY = 75;
            } else if (numberPawn == 3) {
                centerX = 28;
                centerY = 50;
            } else if (numberPawn == 4) {
                centerX = 52;
                centerY = 50;
            } else {
                System.err.println("bad number pawn");
            }
        } else if (width == 120 && height == 120) {
            if (numberPawn == 1) {
                centerX = 21;
                centerY = 60;
            } else if (numberPawn == 2) {
                centerX = 47;
                centerY = 60;
            } else if (numberPawn == 3) {
                centerX = 73;
                centerY = 60;
            } else if (numberPawn == 4) {
                centerX = 99;
                centerY = 60;
            } else {
                System.err.println("wrong size fields");
            }
        }
    }

}
