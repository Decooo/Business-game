package player;

import alert.AlertConfirmation;
import alert.AlertInformation;
import card.*;
import controller.MapController;
import game.ColorFieldPlayer;
import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

/**
 * Created by Jakub on 13.02.2017.
 */
public class ActionPlayerAfterMove extends ActionAfterMove {


    @Override
    public void doAction(int idPlayer) {
        final int position;
        ListPlayers listPlayers = new ListPlayers();
        UserPlayer player = (UserPlayer) listPlayers.getPlayer(idPlayer);
        position = player.getPositionPlayer() - 1;

        if (orCardsToBuy(position) == true) {
            Card card = doCardToBuy();
            if (checkOwnerCard(idPlayer, card.getIdOwner()) == 0) {
                possibilityOfBuyingCard(card, player);
            } else if (checkOwnerCard(idPlayer, card.getIdOwner()) == 2) {
                payCharge(player, card.getIdOwner(), card);
            }
        }
    }

    private Card doCardToBuy() {
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


    public void possibilityOfBuyingCard(Card card, UserPlayer player) {
        if (player.getAmountMoney() >= card.getPrice()) {
            if (AlertConfirmation.AlertPurchaseCard(card.getName(), card.getPrice()) == true) {
                purchaseCard(card, player, 0);
            }
        } else {
            AlertInformation.AlertLackOfMoney();
        }
    }


    @Override
    void purchaseCard(Card card, UserPlayer player, int idPlayer) {
        player.setAmountMoney(player.getAmountMoney() - card.getPrice());
        card.setIdOwner(0);
        MapController mapController = new MapController();
        mapController.getPaneField(player.getPositionPlayer() - 1).setBackground(new Background(new BackgroundFill(Color.web(ColorFieldPlayer.fromValue(idPlayer).toString()), CornerRadii.EMPTY, Insets.EMPTY)));

    }
}
