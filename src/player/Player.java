package player;

import controller.SettingNewGameController;
import game.OrderTrowing;

/**
 * Created by Jakub on 08.02.2017.
 */
public class Player implements IPlayer {

    private int positionPlayer;
    private int amountMoney;

    public Player() {
        setPositionPlayer(1);
        setAmuontMoney(SettingNewGameController.getSelectedAmountOfMoney());
    }

    @Override
    public String toString() {
        return "Player{" +
                "positionPlayer=" + positionPlayer +
                ", amountMoney=" + amountMoney +
                '}';
    }


    public int getAmuontMoney() {
        return amountMoney;
    }

    public Player setAmuontMoney(int amuontMoney) {
        this.amountMoney = amuontMoney;
        return this;
    }

    public int getPositionPlayer() {
        return positionPlayer;
    }

    public Player setPositionPlayer(int positionPlayer) {
        this.positionPlayer = positionPlayer;
        return this;
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
