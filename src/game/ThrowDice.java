package game;

import java.util.Random;

/**
 * Created by Jakub on 09.02.2017.
 */
public class ThrowDice {

    private static int[] numberOnTheDice;

    public ThrowDice() {
        doTableNumberOnTheDice();
    }

    public void doTableNumberOnTheDice() {
        numberOnTheDice = new int[11];
        for (int i = 0; i < numberOnTheDice.length; i++) {
            numberOnTheDice[i] = i + 2;
        }
    }

    public int randomNumberONTheDice() {
        Random rand = new Random();
        int index = rand.nextInt(11);
        return numberOnTheDice[index];
    }

}
