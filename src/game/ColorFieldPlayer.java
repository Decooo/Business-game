package game;

/**
 * Created by Jakub on 14.02.2017.
 */
public enum ColorFieldPlayer {

    color0(0) {
        @Override
        public String toString() {
            return "ADEAEA";
        }
    },
    color1(1) {
        @Override
        public String toString() {
            return "ff6666";
        }
    },
    color2(2) {
        @Override
        public String toString() {
            return "#99ff99";
        }
    },
    color3(3) {
        @Override
        public String toString() {
            return "ffff99";
        }
    };

    private int value;

    ColorFieldPlayer(int value) {
        this.value = value;
    }

    public static ColorFieldPlayer fromValue(int value) {
        for (ColorFieldPlayer val : ColorFieldPlayer.values()) {
            if (val.value == value) {
                return val;
            }
        }
        return null;
    }


}
