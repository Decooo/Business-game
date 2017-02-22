package player;

import alert.AlertConfirmation;
import alert.AlertInformation;
import card.Card;

/**
 * Created by Jakub on 13.02.2017.
 */
public class ActionPlayerAfterMove extends ActionAfterMove {


    @Override
    public void possibilityOfBuyingCard(Card card, Player player,int idPlayer) {
        if (player.getAmountMoney() >= card.getPrice()) {
            if (AlertConfirmation.AlertPurchaseCard(card.getName(), card.getPrice()) == true) {
                purchaseCard(card, player, idPlayer);
            }
        } else {
            AlertInformation.AlertLackOfMoney();
        }
    }

}
