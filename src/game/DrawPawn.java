package game;

import controller.MapController;
import javafx.scene.paint.Color;
import player.ComputerPlayer;
import player.ListPlayers;
import player.UserPlayer;

/**
 * Created by Jakub on 08.02.2017.
 */
public class DrawPawn {

    private static double centerX = 0;
    private static double centerY = 0;

    private ListPlayers listPlayers = new ListPlayers();

    public void drawPawnAtTheStart() {
        MapController map = new MapController();
        OrderTrowing order = new OrderTrowing();


        for (int i = 0; i < listPlayers.sizeListPlayers(); i++) {
            int numberPawn = OrderTrowing.getOrderTrowingPlayer(i);
            centerPawn(numberPawn , 120, 120);
            if (i == 0) {
                Color c = Color.BLUE;
                map.drawPane(map.getPaneField(0), c, centerX, centerY, i);
            } else if (i == 1) {
                Color c = Color.RED;
                map.drawPane(map.getPaneField(0), c, centerX, centerY, i);
            } else if (i == 2) {
                Color c = Color.GREEN;
                map.drawPane(map.getPaneField(0), c, centerX, centerY, i);
            } else if (i == 3) {
                Color c = Color.YELLOW;
                map.drawPane(map.getPaneField(0), c, centerX, centerY, i);
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
        UserPlayer play = (UserPlayer) listPlayers.getPlayer(i);
        int positionPlayer = play.getPositionPlayer();
        MapController map = new MapController();
        double width = map.getPaneField(positionPlayer - 1).getWidth();
        double height = map.getPaneField(positionPlayer - 1).getHeight();
        centerPawn(i,width,height);
        map.drawPane(map.getPaneField(positionPlayer - 1), c, centerX, centerY, i);


    }

    public void drawComputerPawn(int i, Color c) {
        ComputerPlayer play = (ComputerPlayer) listPlayers.getPlayer(i);
        int positionComputerPlayer = play.getPositionComputerPlayer();
        MapController map = new MapController();
        double width = map.getPaneField(positionComputerPlayer - 1).getWidth();
        double height = map.getPaneField(positionComputerPlayer - 1).getHeight();
        centerPawn(i,width,height);
        map.drawPane(map.getPaneField(positionComputerPlayer - 1), c, centerX, centerY, i);


    }

    public void removeOldPawn(int idPlayer) {
        int oldPosition = listPlayers.getOldPosition(idPlayer);
        MapController map = new MapController();
        String idPawn = "player" + idPlayer;
        for (int i = 0; i < map.getPaneField(oldPosition - 1).getChildren().size(); i++) {
            String nameItem = map.getPaneField(oldPosition - 1).getChildren().get(i).getId();
            if (idPawn.equals(nameItem)) {
                map.getPaneField(oldPosition - 1).getChildren().remove(i);
            }
        }
    }

    public void centerPawn(int idPlayer, double width, double height) {
        if ((width == 80 && height == 120) || (width == 120 && height == 80)) {
            if (idPlayer == 0) {
                centerX = 28;
                centerY = 75;
            } else if (idPlayer == 1) {
                centerX = 52;
                centerY = 75;
            } else if (idPlayer == 2) {
                centerX = 28;
                centerY = 50;
            } else if (idPlayer == 3) {
                centerX = 52;
                centerY = 50;
            } else {
                System.err.println("bad number pawn");
            }
        } else if (width == 120 && height == 120) {
            if (idPlayer == 0) {
                centerX = 21;
                centerY = 60;
            } else if (idPlayer == 1) {
                centerX = 47;
                centerY = 60;
            } else if (idPlayer == 2) {
                centerX = 73;
                centerY = 60;
            } else if (idPlayer == 3) {
                centerX = 99;
                centerY = 60;
            } else {
                System.err.println("wrong size fields");
            }
        }
    }

}
