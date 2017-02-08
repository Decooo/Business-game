package player;

import controller.SettingNewGameController;

/**
 * Created by Jakub on 07.02.2017.
 */
public class CurrentNumberOfPlayers {
    private static int currentNumberOfPlayers = SettingNewGameController.getSelectedNumberOfPlayer();

    public static int getCurrentNumberOfPlayers() {
        return currentNumberOfPlayers;
    }

    public static void removePlayer() {
        currentNumberOfPlayers--;
    }

    public static boolean noEnemies() {
        if (currentNumberOfPlayers >= 2) {
            return false;
        } else return true;
    }
}
