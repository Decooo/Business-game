package card;

/**
 * Created by Jakub on 13.02.2017.
 */
public class ListSpecialCard {

    private static SpecialCard[] listSpecialCard = new SpecialCard[11];

    public static SpecialCard getListSpecialCard(int index) {
        return listSpecialCard[index];
    }

    public static SpecialCard[] getListSpecialCard() {
        return listSpecialCard;
    }

    public void doListSpecialCard() {
        for (int i = 0; i < listSpecialCard.length; i++) {
            listSpecialCard[i] = new SpecialCard();
        }
    }

}
