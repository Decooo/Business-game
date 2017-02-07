package game;

/**
 * Created by Jakub on 06.02.2017.
 */
public enum NumberOfPlayerEnum {
    TWO(2),
    THREE(3),
    FOUR(4);

    private int number;

    NumberOfPlayerEnum(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "NumberOfPlayerEnum{}";
    }
}
