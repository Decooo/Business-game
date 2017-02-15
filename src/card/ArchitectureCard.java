package card;

/**
 * Created by Jakub on 13.02.2017.
 */
public class ArchitectureCard extends Card {


    public ArchitectureCard(String name, int price, int[] charge, int idOwner, boolean depositCard) {
        setPrice(price);
        setName(name);
        setCharge(charge);
        setIdOwner(idOwner);
        setDepositCard(depositCard);
    }

}
