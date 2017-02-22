package game;

/**
 * Created by Jakub on 16.02.2017.
 */
public enum ColorComputerPlayer {

    czerwony(1),
    zielony(2),
    żółty(3);

    private int value;

    ColorComputerPlayer(int value) {
        this.value = value;
    }

    public static ColorComputerPlayer fromValue(int value) {
        for (ColorComputerPlayer val : ColorComputerPlayer.values()) {
            if (val.value == value) {
                return val;
            }
        }
        return null;
    }

}
