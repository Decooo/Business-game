package card;

/**
 * Created by Jakub on 13.02.2017.
 */
public class ProfessionCard {

    final int prize;
    final int charge;
    final String name;
    int idOwner;

    public ProfessionCard(String name, int prize, int charge, int idOwner) {
        this.prize = prize;
        this.charge = charge;
        this.name = name;
        this.idOwner = idOwner;
    }

    public int getPrize() {

        return prize;
    }

    public int getCharge() {
        return charge;
    }

    public String getName() {
        return name;
    }

    public int getIdOwner() {
        return idOwner;
    }

    public ProfessionCard setIdOwner(int idOwner) {
        this.idOwner = idOwner;
        return this;
    }
}
