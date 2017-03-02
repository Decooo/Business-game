package updateDisplay;

import game.CurrentNumbersBuildings;
import javafx.scene.control.Label;

/**
 * Created by Jakub on 01.03.2017.
 */
public class RefreshLabelNumberBuildings {

    public static void refreshLabels(Label labelHouses, Label labelHotels) {
        labelHouses.setText("Pozostała ilość domków: " + CurrentNumbersBuildings.getNumberHouses());
        labelHotels.setText("Pozostała ilość hoteli: " + CurrentNumbersBuildings.getNumberHotels());
    }

}
