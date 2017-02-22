package player;

import alert.AlertInformation;
import card.Card;
import card.ListArchitectureCard;

import java.util.Random;

/**
 * Created by Jakub on 19.02.2017.
 */
public class ActionComputerAfterMove extends ActionAfterMove {

    @Override
    public void possibilityOfBuyingCard(Card card, Player player, int idPlayer) {
        if (getNumberList() == 0 || getNumberList() == 1) {
            if (player.getAmountMoney() >= card.getPrice()) {
                purchaseCard(card, player, idPlayer);
                AlertInformation.AlertComputerBuyCard(idPlayer, card.getName(), card.getPrice());
            }
        } else if (getNumberList() == 3) {
            if (buyArchitectureCard(player, card, idPlayer) == true) {
                purchaseCard(card, player, idPlayer);
                AlertInformation.AlertComputerBuyCard(idPlayer, card.getName(), card.getPrice());
            }
        }
    }

    public boolean buyArchitectureCard(Player player, Card card, int idPlayer) {
        Random rand = new Random();
        int numbersCardsTheOwner = 0;
        final int number = rand.nextInt(100) + 1;
        ListArchitectureCard listArchitectureCard = new ListArchitectureCard();
        for (int i = 0; i < ListArchitectureCard.getListArchitectureCards().length; i++) {
            Card tempCard = listArchitectureCard.getListArchitectureCards(i);
            if (tempCard.getIdOwner() == idPlayer) {
                numbersCardsTheOwner++;
            }
        }
        System.out.println("number = " + number);
        if (numbersCardsTheOwner == 0) {
            if (player.getAmountMoney() >= card.getPrice() * 7) {
                if (number <= 95) {
                    return true;
                } else return false;
            } else if (player.getAmountMoney() >= card.getPrice() * 5) {
                if (number <= 70) {
                    return true;
                } else return false;
            } else if (player.getAmountMoney() >= card.getPrice() * 3) {
                if (number <= 50) {
                    return true;
                } else return false;
            } else if (player.getAmountMoney() >= card.getPrice() * 2) {
                if (number <= 25) {
                    return true;
                } else return false;
            } else if (player.getAmountMoney() >= card.getPrice() * 1) {
                if (number <= 10) {
                    return true;
                } else return false;
            } else return false;

        } else {
            if (player.getAmountMoney() >= card.getPrice() * 3) {
                if (number <= 90) {
                    return true;
                } else return false;
            } else if (player.getAmountMoney() >= card.getPrice() * 2) {
                if (number <= 75) {
                    return true;
                } else return false;
            } else if (player.getAmountMoney() >= card.getPrice() * 1) {
                if (number <= 50) {
                    return true;
                } else return false;
            } else return false;
        }
    }

}
