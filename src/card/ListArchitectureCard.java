package card;

/**
 * Created by Jakub on 13.02.2017.
 */
public class ListArchitectureCard {

    private static ArchitectureCard[] listArchitectureCards = new ArchitectureCard[2];

    public ArchitectureCard getListArchitectureCards(int index) {
        return listArchitectureCards[index];
    }

    public static ArchitectureCard[] getListArchitectureCards() {
        return listArchitectureCards;
    }

    public void doListArchitectureCard() {
        listArchitectureCards[0] = new ArchitectureCard("Elektownia", 150, new int[]{4,10},-1, false );
        listArchitectureCards[1] = new ArchitectureCard("Wodociąg", 150, new int[]{4,10},-1, false );

    }

}
