package game;

import controller.SettingNewGameController;

/**
 * Created by Jakub on 07.02.2017.
 */
public interface IGame {

    String playerName = SettingNewGameController.getPlayerName();
    int numbersOfPlayers = SettingNewGameController.getSelectedNumberOfPlayer();

    void doClose();

    void saveGame();

    void loadGame();

    void run();
}
