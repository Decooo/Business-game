package card;

/**
 * Created by Jakub on 13.02.2017.
 */
public class ListLocomotiveCard {

    private static LocomotiveCard[] listLocomotiveCards = new LocomotiveCard[4];

    public LocomotiveCard getLocomotiveCard(int index) {
        return listLocomotiveCards[index];
    }

    public void doListLocomotiveCard() {
        for (int i = 0; i < listLocomotiveCards.length; i++) {
            listLocomotiveCards[i] = new LocomotiveCard(200, -1, false, new int[]{25, 50, 100, 200});
        }

    }

    public static LocomotiveCard[] getListLocomotiveCards() {
        return listLocomotiveCards;
    }
}
