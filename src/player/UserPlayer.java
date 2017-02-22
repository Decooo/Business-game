package player;

import controller.SettingNewGameController;

/**
 * Created by Jakub on 08.02.2017.
 */
public class UserPlayer extends Player {


    public UserPlayer() {
        setPositionPlayer(1);
        setAmountMoney(SettingNewGameController.getSelectedAmountOfMoney());
    }

    @Override
    public String toString() {
        return "UserPlayer{" +
                "positionPlayer=" + getPositionPlayer() +
                ", amountMoney=" + getAmountMoney() +
                '}';
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
