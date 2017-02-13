package card;

/**
 * Created by Jakub on 13.02.2017.
 */
public class ListCard {

    private static Object[] listCard = new Object[5];

    public static Object[] getListCard() {
        return listCard;
    }

    public void doListCard() {
        listCard[0] = ListCityCard.getListCityCard();
        listCard[1] = ListLocomotiveCard.getListLocomotiveCards();
        listCard[2] = ListProfessionCard.getListProfessionCard();
        listCard[3] = ListArchitectureCard.getListArchitectureCards();
        listCard[4] = ListSpecialCard.getListSpecialCard();
    }

}
