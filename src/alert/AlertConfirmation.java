package alert;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.util.Optional;

/**
 * Created by Jakub on 16.02.2017.
 */
public class AlertConfirmation {

    public static boolean AlertPurchaseCard(String name, int price) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Kupno karty");
        alert.setHeaderText("Czy chcesz kupić kartę " + name + " za " + price + "$ ?");
        alert.getButtonTypes().setAll(ButtonType.YES, ButtonType.NO);

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.YES) {
            return true;
        } else {
            return false;
        }
    }

}
