package updateDisplay;

import card.EntireColor;
import controller.ExpansionCardController;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

/**
 * Created by Jakub on 01.03.2017.
 */
public class DisplayTabExpansionCard {

    public static void displayTabExpansionCard(TabPane tabPane) {
        int idOpenTab = -1;

        DisplayCheckBoxExpansionCard displayCheckBoxExpansionCard = new DisplayCheckBoxExpansionCard();

        for (int i = 0; i < ExpansionCardController.getSizeTabExpansionCard(); i++) {

            if (EntireColor.ifThePlayerHaveColor(i, 0) == true) {
                Tab tab = ExpansionCardController.getTabExpansionCard(i);
                tab.setDisable(false);

                displayCheckBoxExpansionCard.displayCheckBox(i);

                if (idOpenTab == -1) {
                    idOpenTab = i;
                }

            } else {
                Tab tab = ExpansionCardController.getTabExpansionCard(i);
                tab.setDisable(true);
            }
        }
        if (idOpenTab != -1) {
            tabPane.getSelectionModel().select(idOpenTab);
        }
    }


}
