package player;

import card.*;

/**
 * Created by Jakub on 14.02.2017.
 */
public abstract class ActionAfterMove implements IActionAfterMove {

    private static int numberList;
    private static int idCardInList;

    public static int getNumberList() {
        return numberList;
    }

    public static void setNumberList(int numberList) {
        ActionAfterMove.numberList = numberList;
    }

    public static int getIdCardInList() {
        return idCardInList;
    }

    public static void setIdCardInList(int idCardInList) {
        ActionAfterMove.idCardInList = idCardInList;
    }

    abstract void purchaseCard(Card card, UserPlayer userPlayer, int idPlayer);

    public boolean orCardsToBuy(int position) {
        if (CardIndexesInLists.getCardIndexesInLists(position, 0) == 0) {
            setNumberList(0);
            setIdCardInList(CardIndexesInLists.getCardIndexesInLists(position, 1));
            return true;
        } else if (CardIndexesInLists.getCardIndexesInLists(position, 0) == 1) {
            setNumberList(1);
            setIdCardInList(CardIndexesInLists.getCardIndexesInLists(position, 1));
            return true;
        } else if (CardIndexesInLists.getCardIndexesInLists(position, 0) == 3) {
            setNumberList(3);
            setIdCardInList(CardIndexesInLists.getCardIndexesInLists(position, 1));
            return true;
        }
        return false;
    }

    /**
     * @param idPlayer
     * @param idOwner
     * @return 0 when idOwner==-1 , 1 when idPlayer==idOwner , 2 when idPlayer!=idOwner and idOwner!=-1
     */
    public int checkOwnerCard(int idPlayer, int idOwner) {
        if (idOwner == -1) {
            return 0;
        } else if (idPlayer == idOwner) {
            return 1;
        } else {
            return 2;
        }
    }

    public void payCharge(UserPlayer playerPaying, int idPlayerGetting, Card card) {
        ListPlayers listPlayers = new ListPlayers();
        CalculateCharge calculateCharge = new CalculateCharge();
        int charge = calculateCharge.calculateCharge(card,getNumberList());
        if (idPlayerGetting == 0) {
            UserPlayer playerGetting = (UserPlayer) listPlayers.getPlayer(idPlayerGetting);
            playerGetting.setAmountMoney(playerPaying.getAmountMoney() + charge);
        } else {
            ComputerPlayer playerGetting = (ComputerPlayer) listPlayers.getPlayer(idPlayerGetting);
            playerGetting.setAmountMoney(playerPaying.getAmountMoney() + charge);
        }
        playerPaying.setAmountMoney(playerPaying.getAmountMoney() - charge);
    }


}
