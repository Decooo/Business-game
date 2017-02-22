package player;

/**
 * Created by Jakub on 16.02.2017.
 */
public abstract class Player implements IPlayer {

    private int positionPlayer;
    private int amountMoney;

    public int getPositionPlayer() {
        return positionPlayer;
    }

    public Player setPositionPlayer(int positionPlayer) {
        this.positionPlayer = positionPlayer;
        return this;
    }

    public int getAmountMoney() {
        return amountMoney;
    }

    public Player setAmountMoney(int amountMoney) {
        this.amountMoney = amountMoney;
        return this;
    }
}
