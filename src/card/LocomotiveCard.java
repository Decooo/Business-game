package card;

/**
 * Created by Jakub on 13.02.2017.
 */
public class LocomotiveCard {

    final int price;
    private int idOwner;
    private boolean depositCard;
    private int[] charge = new int[4];

    public LocomotiveCard(int price, int idOwner, boolean depositCard, int[] charge) {
        this.price = price;
        this.idOwner = idOwner;
        this.depositCard = depositCard;
        this.charge = charge;
    }

    public LocomotiveCard setIdOwner(int idOwner) {
        this.idOwner = idOwner;
        return this;
    }

    public LocomotiveCard setDepositCard(boolean depositCard) {
        this.depositCard = depositCard;
        return this;
    }

    public int getPrice() {

        return price;
    }

    public int getIdOwner() {
        return idOwner;
    }

    public boolean isDepositCard() {
        return depositCard;
    }

    public int[] getCharge() {
        return charge;
    }
}
