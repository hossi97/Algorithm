package programmers.level_0.oop;

import static programmers.level_0.oop.Menu.*;
import static programmers.level_0.oop.Menu.LAMB;

/**
 * 양꼬치
 */
public class PG120830 {
    // 내 풀이
    public int solution(int n, int k) {

        final int LAMB_PRICE = 12000;
        final int DRINK_PRICE = 2000;

        int serviceCnt = n / 10;

        int totalPrice = 0;
        totalPrice += LAMB_PRICE * n;
        totalPrice += DRINK_PRICE * (k - serviceCnt);

        return totalPrice;
    }

    // enum, oop
    public int solution2(int n, int k) {

        int totalPrice = 0;

        totalPrice += totalPrice(DRINK, n);
        totalPrice += totalPrice(LAMB, n);
        totalPrice -= discount(LAMB, n);

        return totalPrice;

    }

    private int totalPrice (Menu menu, int quantity) {
        return menu.getPrice() * quantity;
    }

    private int discount (Menu menu, int lambQuantity) {
        return menu.getPrice() * (lambQuantity / 10);
    }

    public static void main(String[] args) {

        System.out.println();
    }
}