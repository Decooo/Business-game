package card;

/**
 * Created by Jakub on 14.02.2017.
 */
public abstract class Card {

    private int prize;

    public Card setPrize(int prize) {
        this.prize = prize;
        return this;
    }

    public int getPrize() {
        return prize;
    }

}
