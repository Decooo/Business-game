package card;

import controller.MapController;

/**
 * Created by Jakub on 15.02.2017.
 */
public class CalculateCharge {

    public int calculateCharge(Card card, int numberList) {
        if (numberList == 0) {
            return calculateChargeCityCard(card);
        } else if (numberList == 1) {
            return calculateChargeLocomotiveCard(card);
        } else if (numberList == 3) {
            return calculateChargeArchitectureCard(card);
        }
        return 0;
    }

    private int calculateChargeCityCard(Card card) {
        int charge;
        int numbersCardOfTheColor = 0;
        int numbersCardsTheOwner = 0;
        ListCityCard listCityCard = new ListCityCard();

        if (card.getLevelOfExpansion() != 0) {
            for (int i = 0; i < ListCityCard.getListCityCard().length; i++) {
                Card tempCard = listCityCard.getCityCard(i);
                if (tempCard.getColorCard() == card.getColorCard()) {
                    numbersCardOfTheColor++;
                    if (tempCard.getIdOwner() == card.getIdOwner()) {
                        numbersCardsTheOwner++;
                    }
                }
            }
            if (numbersCardOfTheColor == numbersCardsTheOwner && numbersCardOfTheColor != 0) {
                charge = card.getCharge(card.getLevelOfExpansion()) * 2;
            } else {
                charge = card.getCharge(card.getLevelOfExpansion());
            }
        } else {
            charge = card.getCharge(card.getLevelOfExpansion());
        }
        return charge;
    }

    private int calculateChargeLocomotiveCard(Card card) {
        int charge;
        ListLocomotiveCard listLocomotiveCard = new ListLocomotiveCard();
        int numberCard = -1;
        for (int i = 0; i < ListLocomotiveCard.getListLocomotiveCards().length; i++) {
            Card tempCard = listLocomotiveCard.getLocomotiveCard(i);
            if (tempCard.getIdOwner() == card.getIdOwner()) {
                numberCard++;
            }
        }
        charge = card.getCharge(numberCard);
        return charge;
    }

    private int calculateChargeArchitectureCard(Card card) {
        int charge;
        ListArchitectureCard listArchitectureCard = new ListArchitectureCard();
        int numberCard = -1;
        for (int i = 0; i < ListArchitectureCard.getListArchitectureCards().length; i++) {
            Card tempCard = listArchitectureCard.getListArchitectureCards(i);
            if (tempCard.getIdOwner() == card.getIdOwner()) {
                numberCard++;
            }
        }
        charge = card.getCharge(numberCard) * MapController.getNumberOnTheDice();
        return charge;
    }
}
