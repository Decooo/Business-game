package controller;

import alert.AlertInformation;
import card.InitializeListCards;
import game.DrawPawn;
import game.OrderTrowing;
import game.ThrowDice;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Modality;
import javafx.stage.Stage;
import player.ActionComputerAfterMove;
import player.ActionPlayerAfterMove;
import player.ListPlayers;
import updateDisplay.DisableButtonInMainFrameGame;
import updateDisplay.DisplayPlayers;
import updateDisplay.DisplayTabExpansionCard;
import updateDisplay.RefreshLabelPlayers;

import java.io.IOException;
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

    @FXML
    private TextField textFieldThrowADice;

    public static int getNumberOnTheDice() {
        return numberOnTheDice;
    }

    public static void setNumberOnTheDice(int numberOnTheDice) {
        MapController.numberOnTheDice = numberOnTheDice;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        doListPaneField();
        DisplayPlayers.displayPlayers(numberOfPlayers, paneComputer1, paneComputer2, paneComputer3);

        OrderTrowing drawOrder = new OrderTrowing();
        drawOrder.doDetermineOrderTrowing();

        ListPlayers listPlayers = new ListPlayers();
        listPlayers.doListPlayer();

        RefreshLabelPlayers.refreshLabelPlayer(labelPlayer, labelComputer1, labelComputer2, labelComputer3);

        InitializeListCards initializeListCards = new InitializeListCards();
        initializeListCards.initializeListCards();

        DrawPawn draw = new DrawPawn();
        draw.drawPawnAtTheStart();

        startDisableButton();
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
            DisableButtonInMainFrameGame.disableButtonWhenMovePlayer(btnNextPlayer, btnExpansionCard, btnReplacementCard, btnSaleCard, btnThrowDice);
            movePlayer = true;
        } else {
            ActionComputerAfterMove actionComputerAfterMove = new ActionComputerAfterMove();
            DisableButtonInMainFrameGame.disableButtonWhenMoveComputerPlayer(btnNextPlayer, btnExpansionCard, btnReplacementCard, btnSaleCard, btnThrowDice);
            drawPawn.removeOldPawn(idPlayerWhoTrows);
            setNumberOnTheDice(throwDice.randomNumberOnTheDice());
            list.updatePositionPlayer(idPlayerWhoTrows, getNumberOnTheDice());
            drawPawn.drawPawn(idPlayerWhoTrows);
            orderTrowing.updateOrderTrowing(idPlayerWhoTrows);
            actionComputerAfterMove.doAction(idPlayerWhoTrows);
        }
        RefreshLabelPlayers.refreshLabelPlayer(labelPlayer, labelComputer1, labelComputer2, labelComputer3);

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
        DisableButtonInMainFrameGame.disableButtonWhenPlayerThrowDice(btnNextPlayer, btnExpansionCard, btnReplacementCard, btnSaleCard, btnThrowDice);
        RefreshLabelPlayers.refreshLabelPlayer(labelPlayer, labelComputer1, labelComputer2, labelComputer3);

    }

    @FXML
    private void lostTwoQueuesAction() {
        ActionPlayerAfterMove actionPlayerAfterMove = new ActionPlayerAfterMove();
        DrawPawn drawPawn = new DrawPawn();
        ListPlayers list = new ListPlayers();
        ThrowDice throwDice = new ThrowDice();
        int idPlayerWhoTrows;
        OrderTrowing orderTrowing = new OrderTrowing();
        idPlayerWhoTrows = orderTrowing.idPlayerWhoTrows();
        drawPawn.removeOldPawn(idPlayerWhoTrows);
        setNumberOnTheDice(Integer.valueOf(textFieldThrowADice.getText()));
        list.updatePositionPlayer(idPlayerWhoTrows, getNumberOnTheDice());
        drawPawn.drawPawn(idPlayerWhoTrows);
        orderTrowing.updateOrderTrowing(idPlayerWhoTrows);
        actionPlayerAfterMove.doAction(idPlayerWhoTrows);

        movePlayer = false;
        DisableButtonInMainFrameGame.disableButtonWhenMoveComputerPlayer(btnNextPlayer, btnExpansionCard, btnReplacementCard, btnSaleCard, btnThrowDice);
        RefreshLabelPlayers.refreshLabelPlayer(labelPlayer, labelComputer1, labelComputer2, labelComputer3);

    }

    @FXML
    private void openExpansionCardAction(ActionEvent event) {
        boolean orOpenTheStage = false;

        for (int i = 0; i < 9; i++) {
            if (DisplayTabExpansionCard.ifThePlayerHaveColor(i) == true) {
                orOpenTheStage = true;
                break;
            }
        }

        if (orOpenTheStage == true) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/ExpansionCard.fxml"));
                Parent root1 = fxmlLoader.load();
                Stage stage = new Stage();
                stage.setTitle("Rozbudowa kart");
                stage.setScene(new Scene(root1));
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.showAndWait();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            AlertInformation.AlertNoColor();
        }
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


    private void startDisableButton() {
        OrderTrowing drawOrder = new OrderTrowing();
        int idPlayerWhoTrows = drawOrder.idPlayerWhoTrows();
        if (idPlayerWhoTrows == 0) {
            DisableButtonInMainFrameGame.disableButtonWhenMovePlayer(btnNextPlayer, btnExpansionCard, btnReplacementCard, btnSaleCard, btnThrowDice);
        } else
            DisableButtonInMainFrameGame.disableButtonWhenMoveComputerPlayer(btnNextPlayer, btnExpansionCard, btnReplacementCard, btnSaleCard, btnThrowDice);
    }

}