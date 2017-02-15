package card;

/**
 * Created by Jakub on 14.02.2017.
 */
public abstract class Card {

    private int price;
    private boolean depositCard;
    private int idOwner;
    private int[] charge;
    private String name;
    private int levelOfExpansion;
    private int colorCard;

    public int getColorCard() {
        return colorCard;
    }

    public Card setColorCard(int colorCard) {
        this.colorCard = colorCard;
        return this;
    }

    public int getCostExpansion() {
        return costExpansion;
    }

    public Card setCostExpansion(int costExpansion) {
        this.costExpansion = costExpansion;
        return this;
    }

    private int costExpansion;
    
    public int getLevelOfExpansion() {
        return levelOfExpansion;
    }

    public Card setLevelOfExpansion(int levelOfExpansion) {
        this.levelOfExpansion = levelOfExpansion;
        return this;
    }

    public String getName() {
        return name;
    }

    public Card setName(String name) {
        this.name = name;
        return this;
    }

    public int getCharge(int index) {
        return charge[index];
    }

    public Card setCharge(int[] charge) {
        this.charge = charge;
        return this;
    }

    public int getIdOwner() {
        return idOwner;
    }

    public Card setIdOwner(int idOwner) {
        this.idOwner = idOwner;
        return this;
    }

    public boolean isDepositCard() {
        return depositCard;
    }

    public Card setDepositCard(boolean depositCard) {
        this.depositCard = depositCard;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public Card setPrice(int prize) {
        this.price = prize;
        return this;
    }

}
