package card;

/**
 * Created by Jakub on 13.02.2017.
 */
public class CityCard extends Card implements ICityCard {


    public CityCard(String nameCity, int price, int costExpansion, int levelOfExpansion, int[] charge, int colorCard, int idOwner, boolean depositCard) {
        setPrice(price);
        setCostExpansion(costExpansion);
        setLevelOfExpansion(levelOfExpansion);
        setCharge(charge);
        setColorCard(colorCard);
        setName(nameCity);
        setIdOwner(idOwner);
        setDepositCard(depositCard);
    }

    @Override
    public void depositCard() {

    }

    @Override
    public void expansionCard() {

    }
}
