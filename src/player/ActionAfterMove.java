package player;

import card.*;
import controller.MapController;
import game.ColorFieldPlayer;
import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

/**
 * Created by Jakub on 14.02.2017.
 */
public abstract class ActionAfterMove {

    private static int numberList;
    private static int idCardInList;

    public static int getNumberList() {
        return numberList;
    }

    public static void setNumberList(int numberList) {
        ActionAfterMove.numberList = numberList;
    }

    public static int getIdCardInList() {
        return idCardInList;
    }

    public static void setIdCardInList(int idCardInList) {
        ActionAfterMove.idCardInList = idCardInList;
    }

    abstract public void possibilityOfBuyingCard(Card card, Player player,int idPlayer);

    public void doAction(int idPlayer) {
        final int position;
        ListPlayers listPlayers = new ListPlayers();
        Player player = (Player) listPlayers.getPlayer(idPlayer);
        position = player.getPositionPlayer() - 1;

        if (orCardsToBuy(position) == true) {
            Card card = doCardToBuy();
            if (checkOwnerCard(idPlayer, card.getIdOwner()) == 0) {
                possibilityOfBuyingCard(card, player,idPlayer);
            } else if (checkOwnerCard(idPlayer, card.getIdOwner()) == 2) {
                payCharge(player, card.getIdOwner(), card);
            }
        }
    }

    void purchaseCard(Card card, Player player, int idPlayer) {
        player.setAmountMoney(player.getAmountMoney() - card.getPrice());
        card.setIdOwner(idPlayer);
        MapController mapController = new MapController();
        mapController.getPaneField(player.getPositionPlayer() - 1).setBackground(new Background(new BackgroundFill(Color.web(ColorFieldPlayer.fromValue(idPlayer).toString()), CornerRadii.EMPTY, Insets.EMPTY)));

    }

    public boolean orCardsToBuy(int position) {
        if (CardIndexesInLists.getCardIndexesInLists(position, 0) == 0) {
            setNumberList(0);
            setIdCardInList(CardIndexesInLists.getCardIndexesInLists(position, 1));
            return true;
        } else if (CardIndexesInLists.getCardIndexesInLists(position, 0) == 1) {
            setNumberList(1);
            setIdCardInList(CardIndexesInLists.getCardIndexesInLists(position, 1));
            return true;
        } else if (CardIndexesInLists.getCardIndexesInLists(position, 0) == 3) {
            setNumberList(3);
            setIdCardInList(CardIndexesInLists.getCardIndexesInLists(position, 1));
            return true;
        }
        return false;
    }

    /**
     * @param idPlayer
     * @param idOwner
     * @return 0 when idOwner==-1 , 1 when idPlayer==idOwner , 2 when idPlayer!=idOwner and idOwner!=-1
     */
    public int checkOwnerCard(int idPlayer, int idOwner) {
        if (idOwner == -1) {
            return 0;
        } else if (idPlayer == idOwner) {
            return 1;
        } else {
            return 2;
        }
    }

    public void payCharge(Player playerPaying, int idPlayerGetting, Card card) {
        ListPlayers listPlayers = new ListPlayers();
        CalculateCharge calculateCharge = new CalculateCharge();
        int charge = calculateCharge.calculateCharge(card, getNumberList());
        Player playerGetting = (Player) listPlayers.getPlayer(idPlayerGetting);
        playerGetting.setAmountMoney(playerGetting.getAmountMoney() + charge);
        playerPaying.setAmountMoney(playerPaying.getAmountMoney() - charge);

        System.out.println("charge = " + charge);
    }

    public Card doCardToBuy() {
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

}
