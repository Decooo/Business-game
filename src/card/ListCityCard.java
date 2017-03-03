package card;

/**
 * Created by Jakub on 13.02.2017.
 */
public class ListCityCard {

    private static CityCard[] listCityCard = new CityCard[22];

    public static CityCard[] getListCityCard() {
        return listCityCard;
    }

    public void doListCityCard() {
        listCityCard[0] = new CityCard("Saloniki", 60, 50, 0, new int[]{2, 10, 30, 90, 160, 250}, 0, -1, false);
        listCityCard[1] = new CityCard("Ateny", 60, 50, 0, new int[]{4, 20, 60, 180, 320, 450}, 0, -1, false);

        listCityCard[2] = new CityCard("Rzeszów", 100, 50, 0, new int[]{6, 30, 90, 270, 400, 550}, 1, -1, false);
        listCityCard[3] = new CityCard("Kraków", 100, 50, 0, new int[]{6, 30, 90, 270, 400, 550}, 1, -1, false);
        listCityCard[4] = new CityCard("Warszawa", 120, 50, 0, new int[]{8, 40, 100, 300, 450, 600}, 1, -1, false);

        listCityCard[5] = new CityCard("Marsylia", 140, 100, 0, new int[]{10, 50, 150, 450, 625, 750}, 2, -1, false);
        listCityCard[6] = new CityCard("Lyon", 140, 100, 0, new int[]{10, 50, 150, 450, 625, 750}, 2, -1, false);
        listCityCard[7] = new CityCard("Paryż", 160, 100, 0, new int[]{12, 60, 180, 500, 700, 900}, 2, -1, false);

        listCityCard[8] = new CityCard("Walencja", 180, 100, 0, new int[]{14, 70, 200, 550, 700, 900}, 3, -1, false);
        listCityCard[9] = new CityCard("Barcelona", 180, 100, 0, new int[]{14, 70, 200, 550, 700, 950}, 3, -1, false);
        listCityCard[10] = new CityCard("Madryt", 200, 100, 0, new int[]{16, 80, 220, 600, 800, 1000}, 3, -1, false);

        listCityCard[11] = new CityCard("Monachium", 220, 150, 0, new int[]{18, 90, 250, 700, 875, 1050}, 4, -1, false);
        listCityCard[12] = new CityCard("Dortmund", 220, 150, 0, new int[]{18, 90, 250, 700, 875, 1050}, 4, -1, false);
        listCityCard[13] = new CityCard("Berlin", 240, 150, 0, new int[]{20, 100, 300, 750, 925, 1100}, 4, -1, false);

        listCityCard[14] = new CityCard("Neapol", 260, 150, 0, new int[]{22, 110, 330, 800, 975, 1150}, 5, -1, false);
        listCityCard[15] = new CityCard("Turyn", 260, 150, 0, new int[]{22, 110, 330, 800, 975, 1150}, 5, -1, false);
        listCityCard[16] = new CityCard("Rzym", 280, 150, 0, new int[]{24, 120, 360, 850, 1025, 1200}, 5, -1, false);

        listCityCard[17] = new CityCard("Rotterdam", 300, 200, 0, new int[]{26, 130, 390, 900, 1100, 1275}, 6, -1, false);
        listCityCard[18] = new CityCard("Amsterdam", 300, 200, 0, new int[]{26, 130, 390, 900, 1100, 1275}, 6, -1, false);
        listCityCard[19] = new CityCard("Bruksela", 320, 200, 0, new int[]{28, 150, 450, 1000, 1200, 1400}, 6, -1, false);

        listCityCard[20] = new CityCard("Salzburg", 350, 200, 0, new int[]{35, 175, 500, 1100, 1300, 1500}, 7, -1, false);
        listCityCard[21] = new CityCard("Wiedeń", 400, 200, 0, new int[]{50, 200, 600, 1400, 1700, 2000}, 7, -1, false);

    }

    public CityCard getCityCard(int index) {
        return listCityCard[index];
    }

}
