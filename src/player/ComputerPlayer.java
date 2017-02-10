package player;

import controller.SettingNewGameController;
import game.OrderTrowing;

/**
 * Created by Jakub on 08.02.2017.
 */
public class ComputerPlayer implements IPlayer {

    private static int numberComputerPlayer = 0;
    private int positionComputerPlayer;
    private int amountMoney;

    public ComputerPlayer() {
        numberComputerPlayer++;
        setPositionComputerPlayer(1);
        setAmountMoney(SettingNewGameController.getSelectedAmountOfMoney());
    }

    @Override
    public String toString() {
        return "ComputerPlayer{" +
                "positionComputerPlayer=" + positionComputerPlayer +
                ", amountMoney=" + amountMoney +
                '}';
    }

    public static int getNumberComputerPlayer() {
        return numberComputerPlayer;
    }

    public static void setNumberComputerPlayer(int numberComputerPlayer) {
        ComputerPlayer.numberComputerPlayer = numberComputerPlayer;
    }

    public int getAmountMoney() {
        return amountMoney;
    }

    public ComputerPlayer setAmountMoney(int amountMoney) {
        this.amountMoney = amountMoney;
        return this;
    }


    public int getPositionComputerPlayer() {
        return positionComputerPlayer;
    }

    public ComputerPlayer setPositionComputerPlayer(int positionComputerPlayer) {
        this.positionComputerPlayer = positionComputerPlayer;
        return this;
    }

    @Override
    public void startPosition() {
        setPositionComputerPlayer(1);
    }

    @Override
    public void throwDice() {

    }

    @Override
    public void purchaseCard() {

    }

    @Override
    public void replacmentCard() {

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
