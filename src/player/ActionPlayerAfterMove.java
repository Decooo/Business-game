package player;

import card.*;
import controller.MapController;
import game.ColorFieldPlayer;
import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

import java.util.Optional;

/**
 * Created by Jakub on 13.02.2017.
 */
public class ActionPlayerAfterMove extends ActionAfterMove {


    @Override
    public void doAction(int idPlayer) {
        final int position;
        ListPlayers listPlayers = new ListPlayers();
        Player player = (Player) listPlayers.getPlayer(idPlayer);
        position = player.getPositionPlayer() - 1;

        if (orCardsToBuy(position) == true) {
            ListArchitectureCard listArchitectureCard = new ListArchitectureCard();

            ArchitectureCard card = listArchitectureCard.getListArchitectureCards(0);
            Card card1 = listArchitectureCard.getListArchitectureCards(0);
            System.out.println(card.getPrize());
            System.out.println("prize 2: " + card1.getPrize());
        }

    }

    private Object doCardToBuy() {
        if (getNumberList() == 0) {
            ListCityCard listCityCard = new ListCityCard();
            CityCard card = listCityCard.getCityCard(getIdCardInList());
            return card;
        } else if (getNumberList() == 1) {
            ListLocomotiveCard listLocomotiveCard = new ListLocomotiveCard();
            LocomotiveCard card = listLocomotiveCard.getLocomotiveCard(getIdCardInList());
            return card;
        } else {
            ListArchitectureCard listArchitectureCard = new ListArchitectureCard();
            ArchitectureCard card = listArchitectureCard.getListArchitectureCards(getIdCardInList());
            return card;
        }
    }

    @Override
    void purchaseCard(int idPlayer, int position, int indexCard) {
        ListCityCard listCityCard = new ListCityCard();
        ListPlayers listPlayers = new ListPlayers();
        Player player = (Player) listPlayers.getPlayer(idPlayer);

        if (indexCard != -1) {

            CityCard cityCard = listCityCard.getCityCard(indexCard);
            if (cityCard.getIdOwner() == -1 && player.getAmuontMoney() >= cityCard.getPrice()) {
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Kupno karty");
                alert.setHeaderText("Czy czy chcesz kupić kartę " + cityCard.getNameCity() + " za " + cityCard.getPrice() + "$ ?");
                alert.getButtonTypes().setAll(ButtonType.YES, ButtonType.NO);

                Optional<ButtonType> result = alert.showAndWait();
                if (result.get() == ButtonType.YES) {
                    player.setAmuontMoney(player.getAmuontMoney() - cityCard.getPrice());
                    cityCard.setIdOwner(idPlayer);
                    MapController mapController = new MapController();
                    mapController.getPaneField(position).setBackground(new Background(new BackgroundFill(Color.web(ColorFieldPlayer.fromValue(idPlayer).toString()), CornerRadii.EMPTY, Insets.EMPTY)));

                }
            }
        }
    }
}
