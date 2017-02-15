package alert;

import javafx.scene.control.Alert;

/**
 * Created by Jakub on 16.02.2017.
 */
public class AlertInformation {

    public static void AlertLackOfMoney() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Kupno karty");
        alert.setHeaderText("Nie masz wystarczająco dużo pieniędzy żeby kupić tę kartę");
        alert.showAndWait();
    }

    public static void AlertEmptyPlayerName(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Nazwa gracza");
        alert.setHeaderText("");
        alert.setContentText("Nazwa gracza nie może być pusta.");
        alert.showAndWait();
    }
}