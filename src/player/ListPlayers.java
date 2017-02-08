package player;

import controller.SettingNewGameController;

import java.util.ArrayList;

public class ListPlayers {

    private static ArrayList listPlayers = new ArrayList<>(SettingNewGameController.getSelectedNumberOfPlayer());


    public void doListPlayer() {
        listPlayers.add(new Player());

        for (int i = listPlayers.size(); i < SettingNewGameController.getSelectedNumberOfPlayer(); i++) {
            listPlayers.add(new ComputerPlayer());
        }
    }

    public ArrayList getListPlayers() {
        return listPlayers;
    }

    public Object getPlayer(int index){
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
}
