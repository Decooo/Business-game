package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.stage.Stage;
import updateDisplay.DisplayTabExpansionCard;
import updateDisplay.RefreshLabelNumberBuildings;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

/**
 * FXML Controller class
 *
 * @author Jakub
 */
public class ExpansionCardController implements Initializable {
    static List<Tab> tabExpansionCard = new ArrayList<>(8);
    @FXML
    private Label labelHouses;
    @FXML
    private Label labelHotels;
    @FXML
    private Tab tabGreece;
    @FXML
    private Tab tabPoland;
    @FXML
    private Tab tabFrance;
    @FXML
    private Tab tabSpain;
    @FXML
    private Tab tabGermany;
    @FXML
    private Tab tabItaly;
    @FXML
    private Tab tabBenelux;
    @FXML
    private Tab tabAustria;

    @FXML
    private Button btnCloseStage;

    public static Tab getTabExpansionCard(int index) {
        return tabExpansionCard.get(index);
    }

    public static int getSizeTabExpansionCard() {
        return tabExpansionCard.size();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tabExpansionCard.clear();
        doTabExpansionCard();
        RefreshLabelNumberBuildings.refreshLabels(labelHouses, labelHotels);
        DisplayTabExpansionCard.displayTabExpansionCard();
    }

    @FXML
    private void closeStageAction(ActionEvent event) {
        closeStage();
    }

    public void closeStage() {
        Stage stage = (Stage) btnCloseStage.getScene().getWindow();
        stage.close();
    }

    private void doTabExpansionCard() {
        tabExpansionCard.add(tabGreece);
        tabExpansionCard.add(tabPoland);
        tabExpansionCard.add(tabFrance);
        tabExpansionCard.add(tabSpain);
        tabExpansionCard.add(tabGermany);
        tabExpansionCard.add(tabItaly);
        tabExpansionCard.add(tabBenelux);
        tabExpansionCard.add(tabAustria);
    }
}