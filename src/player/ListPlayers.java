package player;

import controller.SettingNewGameController;

import java.util.ArrayList;

public class ListPlayers {

    private static ArrayList listPlayers = new ArrayList<>(SettingNewGameController.getSelectedNumberOfPlayer());


    public void doListPlayer() {
        listPlayers.add(new UserPlayer());

        for (int i = listPlayers.size(); i < SettingNewGameController.getSelectedNumberOfPlayer(); i++) {
            listPlayers.add(new ComputerPlayer());
        }
    }

    public Object getPlayer(int index) {
        return listPlayers.get(index);
    }

    public void printListPlayer() {
        for (int i = 0; i < listPlayers.size(); i++) {
            System.out.println(listPlayers.get(i).toString());
        }
    }

    public void removePlayer(int index) {
        listPlayers.remove(index);
    }

    public int sizeListPlayers() {
        return listPlayers.size();
    }

    public void updatePositionPlayer(int numberPlayer, int numberOnTheDice) {
        if (numberPlayer == 0) {
            UserPlayer play = (UserPlayer) listPlayers.get(numberPlayer);
            play.setPositionPlayer(getNewPosition(play.getPositionPlayer(), numberOnTheDice));
        } else {
            ComputerPlayer play = (ComputerPlayer) listPlayers.get(numberPlayer);
            play.setPositionPlayer(getNewPosition(play.getPositionPlayer(), numberOnTheDice));
        }
    }

    private int getNewPosition(int oldPosition, int numberOnTheDice) {
        int newPosition = oldPosition + numberOnTheDice;
        if (newPosition > 42) {
            newPosition -= 42;
            return newPosition;
        } else return newPosition;
    }

    public int getOldPosition(int idPlayer) {
        int oldPosition;
        if (idPlayer == 0) {
            UserPlayer play = (UserPlayer) listPlayers.get(idPlayer);
            oldPosition = play.getPositionPlayer();
        } else {
            ComputerPlayer play = (ComputerPlayer) listPlayers.get(idPlayer);
            oldPosition = play.getPositionPlayer();
        }
        return oldPosition;
    }
}
