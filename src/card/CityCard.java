package card;

/**
 * Created by Jakub on 13.02.2017.
 */
public class CityCard implements ICityCard {
    private final int price;
    private final int costExpansion;
    private final int colorCard;
    private final String nameCity;
    private int levelOfExpansion;
    private int[] charge = new int[6];
    private int idOwner;
    private boolean depositCard;

    public CityCard(String nameCity, int price, int costExpansion, int levelOfExpansion, int[] charge, int colorCard, int idOwner,boolean depositCard) {
        this.price = price;
        this.costExpansion = costExpansion;
        this.levelOfExpansion = levelOfExpansion;
        this.charge = charge;
        this.colorCard = colorCard;
        this.nameCity = nameCity;
        this.idOwner = idOwner;
        this.depositCard = depositCard;
    }

    public boolean isDepositCard() {
        return depositCard;
    }

    public CityCard setDepositCard(boolean depositCard) {
        this.depositCard = depositCard;
        return this;
    }

    public int getIdOwner() {
        return idOwner;
    }

    public CityCard setIdOwner(int idOwner) {
        this.idOwner = idOwner;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public int getCostExpansion() {
        return costExpansion;
    }

    public int getLevelOfExpansion() {
        return levelOfExpansion;
    }

    public CityCard setLevelOfExpansion(int levelOfExpansion) {
        this.levelOfExpansion = levelOfExpansion;
        return this;
    }

    public int[] getCharge() {
        return charge;
    }

    public int getColorCard() {
        return colorCard;
    }

    public String getNameCity() {
        return nameCity;
    }


    @Override
    public void depositCard() {

    }

    @Override
    public void expansionCard() {

    }
}
