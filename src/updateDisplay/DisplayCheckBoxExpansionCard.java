package updateDisplay;

import card.Card;
import card.ListCityCard;
import controller.ExpansionCardController;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jakub on 03.03.2017.
 */
public class DisplayCheckBoxExpansionCard {

    public void displayCheckBox(int idColor) {
        List<Integer> lvlExpansionCard = new ArrayList<>();
        ListCityCard listCityCard = new ListCityCard();
        for (int i = 0; i < ListCityCard.getListCityCard().length; i++) {
            Card tempCard = listCityCard.getCityCard(i);
            if (tempCard.getColorCard() == idColor) {
                lvlExpansionCard.add(tempCard.getLevelOfExpansion());
            }
        }
        unblockCheckBox(idColor, minLvl(lvlExpansionCard), maxLvl(lvlExpansionCard));
        selectedCheckBox(idColor, lvlExpansionCard);
    }

    private void unblockCheckBox(int idColor, int minLvlExpansion, int maxLvlExpansion) {

        if (maxLvlExpansion == minLvlExpansion && minLvlExpansion == 0) {
            AnchorPane anchorPane = ExpansionCardController.getAnchorPaneCheckBox(idColor);
            String name = "lvl" + (maxLvlExpansion + 1);
            String id = "";
            for (int i = 0; i < anchorPane.getChildren().size(); i++) {
                if (anchorPane.getChildren().get(i).getId() != null) {
                    id = anchorPane.getChildren().get(i).getId();
                }
                if (id.contains(name)) {
                    CheckBox checkBox = (CheckBox) anchorPane.getChildren().get(i);
                    checkBox.setDisable(false);
                }
            }

        } else if (maxLvlExpansion == minLvlExpansion && minLvlExpansion > 0 && minLvlExpansion < 5) {
            AnchorPane anchorPane = ExpansionCardController.getAnchorPaneCheckBox(idColor);
            String id = "";
            for (int i = 0; i < anchorPane.getChildren().size(); i++) {
                if (anchorPane.getChildren().get(i).getId() != null) {
                    id = anchorPane.getChildren().get(i).getId();
                }
                if (id.contains("lvl" + (maxLvlExpansion + 1)) || id.contains("lvl" + maxLvlExpansion)) {
                    CheckBox checkBox = (CheckBox) anchorPane.getChildren().get(i);
                    checkBox.setDisable(false);
                }
            }

        } else {
            AnchorPane anchorPane = ExpansionCardController.getAnchorPaneCheckBox(idColor);
            String id = "";
            for (int i = 0; i < anchorPane.getChildren().size(); i++) {
                if (anchorPane.getChildren().get(i).getId() != null) {
                    id = anchorPane.getChildren().get(i).getId();
                }
                if (id.contains("lvl" + maxLvlExpansion)) {
                    CheckBox checkBox = (CheckBox) anchorPane.getChildren().get(i);
                    checkBox.setDisable(false);
                }
            }
        }
    }

    private int maxLvl(List<Integer> lvlExpansionCard) {
        int max = lvlExpansionCard.get(0);

        for (int i = 1; i < lvlExpansionCard.size(); i++) {
            if (lvlExpansionCard.get(i) > max) {
                max = lvlExpansionCard.get(i);
            }
        }
        return max;
    }

    private int minLvl(List<Integer> lvlExpansionCard) {
        int min = lvlExpansionCard.get(0);

        for (int i = 1; i < lvlExpansionCard.size(); i++) {
            if (lvlExpansionCard.get(i) < min) {
                min = lvlExpansionCard.get(i);
            }
        }
        return min;
    }

    public void selectedCheckBox(int idColor, List<Integer> lvlExpansionCard) {
        AnchorPane anchorPane = ExpansionCardController.getAnchorPaneCheckBox(idColor);
        String idNameCheckBox = "";
        for (int i = 0; i < lvlExpansionCard.size(); i++) {
            int lvl = lvlExpansionCard.get(i);

            if (lvl == 0) {
                continue;
            }
            for (int j = 0; j < anchorPane.getChildren().size(); j++) {
                if (anchorPane.getChildren().get(j).getId() != null) {
                    idNameCheckBox = anchorPane.getChildren().get(j).getId();
                }
                for (int k = 1; k <= lvl; k++) {
                    if (idNameCheckBox.equals("lvl" + k + romanNumberCard(i) + letterIndicatingColor(idColor))) {
                        CheckBox checkBox = (CheckBox) anchorPane.getChildren().get(j);
                        checkBox.setSelected(true);
                        checkBox.setStyle("-fx-font-weight: bold;");

                    }
                }
            }
        }
    }

    private String romanNumberCard(int number) {
        number++;
        if (number == 1) {
            return "I";
        } else if (number == 2) {
            return "II";
        } else return "III";
    }

    public String letterIndicatingColor(int idColor) {
        String[] letter = {"g", "p", "f", "s", "ge", "it", "b", "a"};
        return letter[idColor];
    }

}
