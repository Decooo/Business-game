package updateDisplay;

import javafx.scene.control.Button;

/**
 * Created by Jakub on 01.03.2017.
 */
public class DisableButtonInMainFrameGame {
    public static void disableButtonWhenPlayerThrowDice(Button btnNextPlayer, Button btnExpansionCard, Button btnReplacementCard, Button btnSaleCard, Button btnThrowDice) {
        btnNextPlayer.setDisable(false);
        btnExpansionCard.setDisable(false);
        btnReplacementCard.setDisable(false);
        btnSaleCard.setDisable(false);
        btnThrowDice.setDisable(true);
    }

    public static void disableButtonWhenMoveComputerPlayer(Button btnNextPlayer, Button btnExpansionCard, Button btnReplacementCard, Button btnSaleCard, Button btnThrowDice) {
        btnNextPlayer.setDisable(false);
        btnExpansionCard.setDisable(true);
        btnReplacementCard.setDisable(true);
        btnSaleCard.setDisable(true);
        btnThrowDice.setDisable(true);
    }

    public static void disableButtonWhenMovePlayer(Button btnNextPlayer, Button btnExpansionCard, Button btnReplacementCard, Button btnSaleCard, Button btnThrowDice) {
        btnNextPlayer.setDisable(true);
        btnExpansionCard.setDisable(true);
        btnReplacementCard.setDisable(true);
        btnSaleCard.setDisable(true);
        btnThrowDice.setDisable(false);
    }
}
