package card;

/**
 * Created by Jakub on 03.03.2017.
 */
public class EntireColor {

    public static boolean ifThePlayerHaveColor(int idColor ,int idPlayer) {
        ListCityCard listCityCard = new ListCityCard();
        int numbersCardOfTheColor = 0;
        int numbersCardsTheOwner = 0;
        for (int j = 0; j < ListCityCard.getListCityCard().length; j++) {
            Card tempCard = listCityCard.getCityCard(j);
            if (tempCard.getColorCard() == idColor) {
                numbersCardOfTheColor++;
                if (tempCard.getIdOwner() == idPlayer) {
                    numbersCardsTheOwner++;
                }
            }
        }

        if (numbersCardOfTheColor == numbersCardsTheOwner && numbersCardOfTheColor != 0) {
            return true;
        } else return false;
    }

}
