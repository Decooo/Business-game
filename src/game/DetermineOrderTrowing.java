package game;

import controller.SettingNewGameController;

import java.util.Random;

/**
 * Created by Jakub on 07.02.2017.
 */
public class DetermineOrderTrowing {
    private int numerOfPlayers = SettingNewGameController.getSelectedNumberOfPlayer();
    public int[] determineOrderTrowing() {
        Random rand = new Random();
        int[] orderTrowing = new int[numerOfPlayers];
        int[] temp = new int[numerOfPlayers];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = i;
        }
        int j = temp.length;
        for (int i = 0; i < orderTrowing.length; i++) {
            int elem = rand.nextInt(j);
            orderTrowing[i] = temp[elem];
            temp[elem] = temp[temp.length - 1];
            j--;
        }
        return orderTrowing;
    }
}
