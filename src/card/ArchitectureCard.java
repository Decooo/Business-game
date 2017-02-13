package card;

/**
 * Created by Jakub on 13.02.2017.
 */
public class ArchitectureCard {

    final int prize;
    final String name;
    private int[] charge = new int[2];
    private int idOwner;
    private boolean depositCard;

    public ArchitectureCard(String name, int prize, int[] charge, int idOwner, boolean depositCard) {
        this.prize = prize;
        this.name = name;
        this.charge = charge;
        this.idOwner = idOwner;
        this.depositCard = depositCard;
    }

    public ArchitectureCard setIdOwner(int idOwner) {
        this.idOwner = idOwner;
        return this;
    }

    public ArchitectureCard setDepositCard(boolean depositCard) {
        this.depositCard = depositCard;
        return this;
    }

    public int getPrize() {
        return prize;
    }

    public String getName() {
        return name;
    }

    public int[] getCharge() {
        return charge;
    }

    public int getIdOwner() {
        return idOwner;
    }

    public boolean isDepositCard() {
        return depositCard;
    }
}
