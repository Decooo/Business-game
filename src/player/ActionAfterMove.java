package player;

import card.CardIndexesInLists;

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

    abstract void purchaseCard(int idPlayer, int position, int indexCard);

    public boolean orCardsToBuy(int position) {
        if (CardIndexesInLists.getCardIndexesInLists(position, 0) == 0) {
            setNumberList(0);
            idCardInList = CardIndexesInLists.getCardIndexesInLists(position, 1);
            return true;
        } else if (CardIndexesInLists.getCardIndexesInLists(position, 0) == 1) {
            setNumberList(1);
            idCardInList = CardIndexesInLists.getCardIndexesInLists(position, 1);
            return true;
        } else if (CardIndexesInLists.getCardIndexesInLists(position, 0) == 3) {
            setNumberList(3);
            idCardInList = CardIndexesInLists.getCardIndexesInLists(position, 1);
            return true;
        }
        return false;
    }

}
