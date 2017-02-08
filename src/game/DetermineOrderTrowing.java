package game;

import controller.SettingNewGameController;

import java.util.Random;

/**
 * Created by Jakub on 07.02.2017.
 */
public class DetermineOrderTrowing {
    private static int numberOfPlayers = SettingNewGameController.getSelectedNumberOfPlayer();
    static int[] orderTrowing = new int[numberOfPlayers];

    public static int returnOrderTrowingPlayer(int index) {
        return orderTrowing[index];
    }

    public int[] determineOrderTrowing() {
        Random rand = new Random();
        int[] temp = new int[numberOfPlayers];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = i;
        }
        int j = temp.length;
        for (int i = 0; i < orderTrowing.length; i++) {
            int elem = rand.nextInt(j);
            orderTrowing[i] = temp[elem];
            temp[elem] = temp[j - 1];
            j--;
        }
        return orderTrowing;
    }
}
