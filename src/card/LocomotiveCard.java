package card;

/**
 * Created by Jakub on 13.02.2017.
 */
public class LocomotiveCard extends Card {


    public LocomotiveCard(String name, int price, int idOwner, boolean depositCard, int[] charge) {
        setPrice(price);
        setIdOwner(idOwner);
        setDepositCard(depositCard);
        setCharge(charge);
        setName(name);
    }

}
