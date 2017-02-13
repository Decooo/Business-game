package game;

import controller.SettingNewGameController;

import java.util.Random;

/**
 * Created by Jakub on 07.02.2017.
 */
public class OrderTrowing {

    private static int numberOfPlayers = SettingNewGameController.getSelectedNumberOfPlayer();
    static int[] orderTrowing = new int[numberOfPlayers];

    public static int getOrderTrowingPlayer(int index) {
        return orderTrowing[index];
    }

    public static int[] getOrderTrowing() {
        return orderTrowing;
    }

    public static void setOrderTrowing(int[] orderTrowing) {
        OrderTrowing.orderTrowing = orderTrowing;
    }

    public static int sizeOrderTrowing() {
        return orderTrowing.length;
    }

    public int idPlayerWhoTrows() {
        int idPlayer = 0;
        int minValue = orderTrowing[0];
        for (int i = 1; i < orderTrowing.length; i++) {
            if (orderTrowing[i] < minValue) {
                idPlayer = i;
                minValue = orderTrowing[i];
            }
        }
        return idPlayer;
    }

    private int[] determineOrderTrowing() {
        Random rand = new Random();
        int[] temp = new int[numberOfPlayers];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = i;
        }
        int j = temp.length;
        for (int i = 0; i < orderTrowing.length; i++) {
            int elem = rand.nextInt(j);
            orderTrowing[i] = temp[elem];
            temp[elem] = temp[j - 1];
            j--;
        }
        return orderTrowing;
    }

    public void doDetermineOrderTrowing() {
        determineOrderTrowing();
    }

    public void updateOrderTrowing(int idPlayerWhoTrow) {

        reductionNumbersInOrderTrowing();
        orderTrowing[idPlayerWhoTrow] += orderTrowing.length - 1;
        for (int i = 0; i < orderTrowing.length; i++) {
            if (i != idPlayerWhoTrow) {
                orderTrowing[i] -= 1;
            }
        }
        ifTheNumberAreDifferent(idPlayerWhoTrow);
    }

    public void waitingNumberOfQueues(int idPlayerWhoTrow, int numberQueues) {
        orderTrowing[idPlayerWhoTrow] = orderTrowing[idPlayerWhoTrow] + (numberQueues + 2) * (orderTrowing.length - 1);

        for (int i = 0; i < orderTrowing.length; i++) {
            if (i != idPlayerWhoTrow) {
                orderTrowing[i] -= 1;
            }
        }
        ifTheNumberAreDifferent(idPlayerWhoTrow);
    }

    private void reductionNumbersInOrderTrowing() {
        int minValue = orderTrowing[0];
        boolean orSubtract = true;
        boolean isFound = false;
        for (int i = 1; i < orderTrowing.length; i++) {
            if (orderTrowing[i] < minValue) {
                minValue = orderTrowing[i];
            }
        }

        for (int i = 1; i < orderTrowing.length + 1; i++) {
            for (int j = 0; j < orderTrowing.length; j++) {
                if (orderTrowing[j] == minValue + i) {
                    isFound = true;
                    break;
                }
            }
            if (isFound == false) {
                orSubtract = false;
                break;
            }
        }

        if (orSubtract == true) {
            for (int i = 0; i < orderTrowing.length; i++) {
                orderTrowing[i] -= minValue;
            }
        }
    }

    private void ifTheNumberAreDifferent(int idPlayerWhoTrow) {
        for (int i = 0; i < orderTrowing.length; i++) {
            if (i != idPlayerWhoTrow) {
                if (orderTrowing[i] == orderTrowing[idPlayerWhoTrow]) {
                    orderTrowing[idPlayerWhoTrow] = orderTrowing[idPlayerWhoTrow] + 1;
                    i = -1;
                }
            }
        }
    }

}
