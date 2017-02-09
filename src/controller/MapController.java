package controller;

import game.DetermineOrderTrowing;
import game.DrawPane;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import player.ComputerPlayer;
import player.ListPlayers;
import player.Player;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import static controller.SettingNewGameController.*;

public class MapController implements Initializable {

    final static int numberOfPlayers = getSelectedNumberOfPlayer();
    final static int startingAmountOfMoney = getSelectedAmountOfMoney();
    final static String playerName = getPlayerName();

    static List<Pane> listPaneField = new ArrayList<>(42);

    public int[] getOrderTrowing() {
        return orderTrowing;
    }

    public MapController setOrderTrowing(int[] orderTrowing) {
        this.orderTrowing = orderTrowing;
        return this;
    }

    private static int[] orderTrowing;

    @FXML
    private Label labelPlayer;
    @FXML
    private Label labelComputer1;
    @FXML
    private Label labelComputer2;
    @FXML
    private Label labelComputer3;

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


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        doListPaneField();
        labelPlayer.setText(playerName + ": " + startingAmountOfMoney);
        displayPlayers(numberOfPlayers);

        DetermineOrderTrowing drawOrder = new DetermineOrderTrowing();
        orderTrowing = drawOrder.determineOrderTrowing();

        ListPlayers listPlayers = new ListPlayers();
        listPlayers.doListPlayer();

        DrawPane draw = new DrawPane();
        draw.drawPawnAtTheStart();


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
    private void usunAction(ActionEvent event) {
        ListPlayers list = new ListPlayers();
        list.printListPlayer();




    }

    public void drawPane(Pane pane, Color c, double centerX, double centerY) {
        Ellipse ellipse = new Ellipse(centerX, centerY, 10, 10);
        ellipse.setFill(c);
        ellipse.setStroke(Color.BLACK);
        ellipse.setStrokeWidth(1);
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

}