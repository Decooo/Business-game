package alert;

import game.ColorComputerPlayer;
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

    public static void AlertEmptyPlayerName() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Nazwa gracza");
        alert.setHeaderText("");
        alert.setContentText("Nazwa gracza nie może być pusta.");
        alert.showAndWait();
    }

    public static void AlertComputerBuyCard(int idPlayer, String name, int price) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Kupiono karte");
        alert.setHeaderText("");
        alert.setContentText("Komputer " + ColorComputerPlayer.fromValue(idPlayer) + " kupił kartę " + name + " za " + price + "$.");
        alert.showAndWait();
    }

    public static void AlertNoColor(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Brak koloru");
        alert.setHeaderText("Nie posiadasz żadnego całego koloru");
        alert.setContentText("Aby móc budować domy i hotele musisz posiadać wszystkie karty danego koloru");
        alert.showAndWait();
    }

}