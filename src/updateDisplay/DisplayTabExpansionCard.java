package updateDisplay;

import card.Card;
import card.ListCityCard;
import controller.ExpansionCardController;
import javafx.scene.control.Tab;

/**
 * Created by Jakub on 01.03.2017.
 */
public class DisplayTabExpansionCard {

    public static void displayTabExpansionCard() {

        for (int i = 0; i < ExpansionCardController.getSizeTabExpansionCard(); i++) {

            if (ifThePlayerHaveColor(i) == true) {
                Tab tab = ExpansionCardController.getTabExpansionCard(i);
                tab.setDisable(false);
            } else {
                Tab tab = ExpansionCardController.getTabExpansionCard(i);
                tab.setDisable(true);
            }
        }
    }

    public static boolean ifThePlayerHaveColor(int idColor) {
        ListCityCard listCityCard = new ListCityCard();
        int numbersCardOfTheColor = 0;
        int numbersCardsTheOwner = 0;
        for (int j = 0; j < ListCityCard.getListCityCard().length; j++) {
            Card tempCard = listCityCard.getCityCard(j);
            if (tempCard.getColorCard() == idColor) {
                numbersCardOfTheColor++;
                if (tempCard.getIdOwner() == 0) {
                    numbersCardsTheOwner++;
                }
            }
        }

        if (numbersCardOfTheColor == numbersCardsTheOwner && numbersCardOfTheColor != 0) {
            return true;
        } else return false;
    }

}
