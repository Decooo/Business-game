package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
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
    static List<AnchorPane> anchorPaneCheckBox = new ArrayList<>(8);
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
    private TabPane tabPaneChoiceColor;
    @FXML
    private Button btnCloseStage;
    @FXML
    private AnchorPane anchorPaneGreece;
    @FXML
    private AnchorPane anchorPanePoland;
    @FXML
    private AnchorPane anchorPaneFrance;
    @FXML
    private AnchorPane anchorPaneSpain;
    @FXML
    private AnchorPane anchorPaneItaly;
    @FXML
    private AnchorPane anchorPaneGermany;
    @FXML
    private AnchorPane anchorPaneBenelux;
    @FXML
    private AnchorPane anchorPaneAustria;

    public static AnchorPane getAnchorPaneCheckBox(int index) {
        return anchorPaneCheckBox.get(index);
    }

    public static Tab getTabExpansionCard(int index) {
        return tabExpansionCard.get(index);
    }

    public static int getSizeTabExpansionCard() {
        return tabExpansionCard.size();
    }

    public TabPane getTabPaneChoiceColor() {
        return tabPaneChoiceColor;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tabExpansionCard.clear();
        anchorPaneCheckBox.clear();
        doListPane();
        RefreshLabelNumberBuildings.refreshLabels(labelHouses, labelHotels);
        DisplayTabExpansionCard.displayTabExpansionCard(getTabPaneChoiceColor());

    }

    @FXML
    private void closeStageAction(ActionEvent event) {
        closeStage();
    }

    public void closeStage() {
        Stage stage = (Stage) btnCloseStage.getScene().getWindow();
        stage.close();
    }

    private void doListPane() {
        tabExpansionCard.add(tabGreece);
        tabExpansionCard.add(tabPoland);
        tabExpansionCard.add(tabFrance);
        tabExpansionCard.add(tabSpain);
        tabExpansionCard.add(tabGermany);
        tabExpansionCard.add(tabItaly);
        tabExpansionCard.add(tabBenelux);
        tabExpansionCard.add(tabAustria);
        anchorPaneCheckBox.add(anchorPaneGreece);
        anchorPaneCheckBox.add(anchorPanePoland);
        anchorPaneCheckBox.add(anchorPaneFrance);
        anchorPaneCheckBox.add(anchorPaneSpain);
        anchorPaneCheckBox.add(anchorPaneGermany);
        anchorPaneCheckBox.add(anchorPaneItaly);
        anchorPaneCheckBox.add(anchorPaneBenelux);
        anchorPaneCheckBox.add(anchorPaneAustria);
    }

}