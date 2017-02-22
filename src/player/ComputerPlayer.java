package player;

import controller.SettingNewGameController;

/**
 * Created by Jakub on 08.02.2017.
 */
public class ComputerPlayer extends Player {

    private static int numberComputerPlayer = 0;


    public ComputerPlayer() {
        numberComputerPlayer++;
        setPositionPlayer(1);
        setAmountMoney(SettingNewGameController.getSelectedAmountOfMoney());
    }

    @Override
    public String toString() {
        return "ComputerPlayer{" +
                "positionComputerPlayer=" + getPositionPlayer() +
                ", amountMoney=" + getAmountMoney() +
                '}';
    }

    public static int getNumberComputerPlayer() {
        return numberComputerPlayer;
    }

    public static void setNumberComputerPlayer(int numberComputerPlayer) {
        ComputerPlayer.numberComputerPlayer = numberComputerPlayer;
    }


    @Override
    public void startPosition() {
        setPositionPlayer(1);
    }

    @Override
    public void throwDice() {

    }

    @Override
    public void purchaseCard() {

    }

    @Override
    public void replacementCard() {

    }

    @Override
    public void expansionCard() {

    }

    @Override
    public void saleCard() {

    }

    @Override
    public void positionPlayer() {

    }

    @Override
    public void movePlayer() {

    }


}
