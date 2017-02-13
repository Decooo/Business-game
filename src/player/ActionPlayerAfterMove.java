package player;

import card.CardIndexesInLists;
import card.CityCard;
import card.ListCityCard;
import controller.MapController;
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
        ListCityCard listCityCard = new ListCityCard();
        final int position;
        ListPlayers listPlayers = new ListPlayers();
        Player player = (Player) listPlayers.getPlayer(idPlayer);
        position = player.getPositionPlayer() - 1;

        int indexCard = isTheCityCard(position);
        if(indexCard!=-1){
            CityCard cityCard = listCityCard.getCityCard(indexCard);
            if(cityCard.getIdOwner()==-1 && player.getAmuontMoney()>=cityCard.getPrice()){
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Kupno karty");
                alert.setHeaderText("Czy czy chcesz kupić kartę?");
                alert.getButtonTypes().setAll(ButtonType.YES, ButtonType.NO);

                Optional<ButtonType> result = alert.showAndWait();
                if (result.get() == ButtonType.YES) {
                    player.setAmuontMoney(player.getAmuontMoney()-cityCard.getPrice());
                    cityCard.setIdOwner(idPlayer);
                    MapController mapController = new MapController();
                    mapController.getPaneField(position).setBackground(new Background(new BackgroundFill(Color.web("ADEAEA"), CornerRadii.EMPTY, Insets.EMPTY)));

                }else{

                }
            }
        }
    }



}
