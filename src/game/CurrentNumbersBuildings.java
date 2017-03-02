package game;

/**
 * Created by Jakub on 01.03.2017.
 */
public class CurrentNumbersBuildings {

    private static int numberHouses = 32;
    private static int numberHotels = 32;

    public static int getNumberHouses() {
        return numberHouses;
    }

    public static int getNumberHotels() {
        return numberHotels;
    }

    public static void removeHouse() {
        numberHouses--;
    }

    public static void removeHotels() {
        numberHotels--;
    }

    public static void addHouse() {
        numberHouses++;
    }

    public static void addHotels() {
        numberHotels++;
    }
}
