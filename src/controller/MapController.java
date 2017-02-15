package controller;

import card.InitializeListCards;
import game.DrawPawn;
import game.OrderTrowing;
import game.ThrowDice;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import player.ActionPlayerAfterMove;
import player.ComputerPlayer;
import player.ListPlayers;
import player.UserPlayer;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import static controller.SettingNewGameController.*;

public class MapController implements Initializable {

    final static int numberOfPlayers = getSelectedNumberOfPlayer();
    final static int startingAmountOfMoney = getSelectedAmountOfMoney();
    final static String playerName = getPlayerName();
    static boolean movePlayer = false;
    static List<Pane> listPaneField = new ArrayList<>(42);
    private static int numberOnTheDice;
    @FXML
    private Label labelPlayer;
    @FXML
    private Label labelComputer1;
    @FXML
    private Label labelComputer2;
    @FXML
    private Label labelComputer3;
    @FXML
    private Button btnNextPlayer;
    @FXML
    private Button btnExpansionCard;
    @FXML
    private Button btnReplacementCard;
    @FXML
    private Button btnThrowDice;
    @FXML
    private Button btnSaleCard;
    @FXML
    private Pane paneComputer1;
    @FXML
    private Pane paneComputer2;
    @FXML
    private Pane paneComputer3;
    @FXML
    private Pane paneField1;
    @FXML
    private Pane paneField2;
    @FXML
    private Pane paneField3;
    @FXML
    private Pane paneField4;
    @FXML
    private Pane paneField5;
    @FXML
    private Pane paneField6;
    @FXML
    private Pane paneField7;
    @FXML
    private Pane paneField8;
    @FXML
    private Pane paneField9;
    @FXML
    private Pane paneField10;
    @FXML
    private Pane paneField11;
    @FXML
    private Pane paneField12;
    @FXML
    private Pane paneField13;
    @FXML
    private Pane paneField14;
    @FXML
    private Pane paneField15;
    @FXML
    private Pane paneField16;
    @FXML
    private Pane paneField17;
    @FXML
    private Pane paneField18;
    @FXML
    private Pane paneField19;
    @FXML
    private Pane paneField20;
    @FXML
    private Pane paneField21;
    @FXML
    private Pane paneField22;
    @FXML
    private Pane paneField23;
    @FXML
    private Pane paneField24;
    @FXML
    private Pane paneField25;
    @FXML
    private Pane paneField26;
    @FXML
    private Pane paneField27;
    @FXML
    private Pane paneField28;
    @FXML
    private Pane paneField29;
    @FXML
    private Pane paneField30;
    @FXML
    private Pane paneField31;
    @FXML
    private Pane paneField32;
    @FXML
    private Pane paneField33;
    @FXML
    private Pane paneField34;
    @FXML
    private Pane paneField35;
    @FXML
    private Pane paneField36;
    @FXML
    private Pane paneField37;
    @FXML
    private Pane paneField38;
    @FXML
    private Pane paneField39;
    @FXML
    private Pane paneField40;
    @FXML
    private Pane paneField41;
    @FXML
    private Pane paneField42;

    public static int getNumberOnTheDice() {
        return numberOnTheDice;
    }

    public static void setNumberOnTheDice(int numberOnTheDice) {
        MapController.numberOnTheDice = numberOnTheDice;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        doListPaneField();
        displayPlayers(numberOfPlayers);

        OrderTrowing drawOrder = new OrderTrowing();
        drawOrder.doDetermineOrderTrowing();

        ListPlayers listPlayers = new ListPlayers();
        listPlayers.doListPlayer();

        refreshLabel();

        InitializeListCards initializeListCards = new InitializeListCards();
        initializeListCards.initializeListCards();

        DrawPawn draw = new DrawPawn();
        draw.drawPawnAtTheStart();

        startDisableButton();
    }

    public void displayPlayers(int numberOfPlayers) {
        if (numberOfPlayers == 2) {
            paneComputer1.setVisible(true);
        } else if (numberOfPlayers == 3) {
            paneComputer1.setVisible(true);
            paneComputer2.setVisible(true);
        } else if (numberOfPlayers == 4) {
            paneComputer1.setVisible(true);
            paneComputer2.setVisible(true);
            paneComputer3.setVisible(true);
        }
    }

    @FXML
    private void nextPlayerAction(ActionEvent event) {
        int idPlayerWhoTrows;
        ThrowDice throwDice = new ThrowDice();
        OrderTrowing orderTrowing = new OrderTrowing();
        DrawPawn drawPawn = new DrawPawn();
        ListPlayers list = new ListPlayers();

        idPlayerWhoTrows = orderTrowing.idPlayerWhoTrows();
        if (idPlayerWhoTrows == 0) {
            disableButtonWhenMovePlayer();
            movePlayer = true;
        } else {
            disableButtonWhenMoveComputerPlayer();
            drawPawn.removeOldPawn(idPlayerWhoTrows);
            setNumberOnTheDice(throwDice.randomNumberOnTheDice());
            list.updatePositionPlayer(idPlayerWhoTrows, getNumberOnTheDice());
            drawPawn.drawPawn(idPlayerWhoTrows);
            orderTrowing.updateOrderTrowing(idPlayerWhoTrows);
        }
        refreshLabel();
    }

    @FXML
    private void throwDiceAction() {
        int idPlayer = 0;
        ActionPlayerAfterMove actionPlayerAfterMove = new ActionPlayerAfterMove();
        DrawPawn drawPawn = new DrawPawn();
        ListPlayers listPlayers = new ListPlayers();
        ThrowDice throwDice = new ThrowDice();
        OrderTrowing orderTrowing = new OrderTrowing();
        drawPawn.removeOldPawn(idPlayer);
        setNumberOnTheDice(throwDice.randomNumberOnTheDice());
        listPlayers.updatePositionPlayer(idPlayer, getNumberOnTheDice());
        drawPawn.drawPawn(idPlayer);
        orderTrowing.updateOrderTrowing(idPlayer);
        actionPlayerAfterMove.doAction(idPlayer);

        movePlayer = false;
        disableButtonWhenMoveComputerPlayer();
        refreshLabel();
    }

    @FXML
    private void lostTwoQueuesAction() {
        DrawPawn drawPawn = new DrawPawn();
        ListPlayers list = new ListPlayers();
        ThrowDice throwDice = new ThrowDice();
        int idPlayerWhoTrows;
        OrderTrowing orderTrowing = new OrderTrowing();
        idPlayerWhoTrows = orderTrowing.idPlayerWhoTrows();
        drawPawn.removeOldPawn(idPlayerWhoTrows);
        setNumberOnTheDice(throwDice.randomNumberOnTheDice());
        list.updatePositionPlayer(idPlayerWhoTrows, getNumberOnTheDice());
        drawPawn.drawPawn(idPlayerWhoTrows);
        orderTrowing.waitingNumberOfQueues(idPlayerWhoTrows, 2);
    }

    public void drawPane(Pane pane, Color c, double centerX, double centerY, int idPlayer) {
        Ellipse ellipse = new Ellipse(centerX, centerY, 10, 10);
        ellipse.setFill(c);
        ellipse.setStroke(Color.BLACK);
        ellipse.setStrokeWidth(1);
        ellipse.setId("player" + idPlayer);
        pane.getChildren().add(ellipse);
    }


    public Pane getPaneField(int index) {
        return listPaneField.get(index);
    }

    public void doListPaneField() {
        listPaneField.add(paneField1);
        listPaneField.add(paneField2);
        listPaneField.add(paneField3);
        listPaneField.add(paneField4);
        listPaneField.add(paneField5);
        listPaneField.add(paneField6);
        listPaneField.add(paneField7);
        listPaneField.add(paneField8);
        listPaneField.add(paneField9);
        listPaneField.add(paneField10);
        listPaneField.add(paneField11);
        listPaneField.add(paneField12);
        listPaneField.add(paneField13);
        listPaneField.add(paneField14);
        listPaneField.add(paneField15);
        listPaneField.add(paneField16);
        listPaneField.add(paneField17);
        listPaneField.add(paneField18);
        listPaneField.add(paneField19);
        listPaneField.add(paneField20);
        listPaneField.add(paneField21);
        listPaneField.add(paneField22);
        listPaneField.add(paneField23);
        listPaneField.add(paneField24);
        listPaneField.add(paneField25);
        listPaneField.add(paneField26);
        listPaneField.add(paneField27);
        listPaneField.add(paneField28);
        listPaneField.add(paneField29);
        listPaneField.add(paneField30);
        listPaneField.add(paneField31);
        listPaneField.add(paneField32);
        listPaneField.add(paneField33);
        listPaneField.add(paneField34);
        listPaneField.add(paneField35);
        listPaneField.add(paneField36);
        listPaneField.add(paneField37);
        listPaneField.add(paneField38);
        listPaneField.add(paneField39);
        listPaneField.add(paneField40);
        listPaneField.add(paneField41);
        listPaneField.add(paneField42);
    }

    private void disableButtonWhenMoveComputerPlayer() {
        btnNextPlayer.setDisable(false);
        btnExpansionCard.setDisable(true);
        btnReplacementCard.setDisable(true);
        btnSaleCard.setDisable(true);
        btnThrowDice.setDisable(true);
    }

    private void disableButtonWhenMovePlayer() {
        btnNextPlayer.setDisable(true);
        btnExpansionCard.setDisable(false);
        btnReplacementCard.setDisable(false);
        btnSaleCard.setDisable(false);
        btnThrowDice.setDisable(false);
    }

    private void startDisableButton() {
        OrderTrowing drawOrder = new OrderTrowing();
        int idPlayerWhoTrows = drawOrder.idPlayerWhoTrows();
        if (idPlayerWhoTrows == 0) {
            disableButtonWhenMovePlayer();
        } else disableButtonWhenMoveComputerPlayer();

    }

    private void refreshLabel() {
        ListPlayers listPlayers = new ListPlayers();
        for (int i = 0; i < listPlayers.sizeListPlayers(); i++) {
            if (i == 0) {
                UserPlayer play = (UserPlayer) listPlayers.getPlayer(i);
                labelPlayer.setText(playerName + " :  " + play.getAmountMoney());
            } else if (i == 1) {
                ComputerPlayer play = (ComputerPlayer) listPlayers.getPlayer(i);
                labelComputer1.setText("Komputer czerwony : " + play.getAmountMoney());
            } else if (i == 2) {
                ComputerPlayer play = (ComputerPlayer) listPlayers.getPlayer(i);
                labelComputer2.setText("Komputer zielony : " + play.getAmountMoney());
            } else if (i == 3) {
                ComputerPlayer play = (ComputerPlayer) listPlayers.getPlayer(i);
                labelComputer3.setText("Komputer żółty : " + play.getAmountMoney());
            }
        }
    }

}