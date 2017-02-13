package card;

/**
 * Created by Jakub on 13.02.2017.
 */
public class ListProfessionCard {

    private static ProfessionCard[] listProfessionCard = new ProfessionCard[3];

    public ProfessionCard getProfessionCard(int index) {
        return listProfessionCard[index];
    }

    public static ProfessionCard[] getListProfessionCard() {
        return listProfessionCard;
    }

    public void doListProfessionCards(){
        listProfessionCard[0] = new ProfessionCard("Doktor",75,5,-1);
        listProfessionCard[1] = new ProfessionCard("Informatyk",125,10,-1);
        listProfessionCard[2] = new ProfessionCard("Prawnik",175,15,-1);

    }

}
