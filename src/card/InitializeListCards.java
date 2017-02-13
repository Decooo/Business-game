package card;

/**
 * Created by Jakub on 13.02.2017.
 */
public class InitializeListCards {

    public void initializeListCards() {
        ListCityCard listCityCard = new ListCityCard();
        ListLocomotiveCard listLocomotiveCard = new ListLocomotiveCard();
        ListProfessionCard listProfessionCard = new ListProfessionCard();
        ListArchitectureCard listArchitectureCard = new ListArchitectureCard();
        ListSpecialCard listSpecialCard = new ListSpecialCard();
        ListCard listCard = new ListCard();
        CardIndexesInLists cardIndexesInLists = new CardIndexesInLists();

        listCityCard.doListCityCard();
        listLocomotiveCard.doListLocomotiveCard();
        listProfessionCard.doListProfessionCards();
        listArchitectureCard.doListArchitectureCard();
        listSpecialCard.doListSpecialCard();
        listCard.doListCard();
        cardIndexesInLists.doListCardIndexesInList();
    }


}
