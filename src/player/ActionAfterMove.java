package player;

import card.CardIndexesInLists;

/**
 * Created by Jakub on 14.02.2017.
 */
public abstract class ActionAfterMove implements IActionAfterMove {

    public int isTheCityCard(int position) {
        int idCardInList = -1;
        if (CardIndexesInLists.getCardIndexesInLists(position, 0) == 0) {
            idCardInList = CardIndexesInLists.getCardIndexesInLists(position, 1);
        }
        return idCardInList;
    }

}
