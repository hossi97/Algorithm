package programmers.level_0.oop;

import static programmers.level_0.oop.Cafe.*;

/**
 * 아이스 아메리카노
 */
public class PG120819 {
    public int[] solution(int money) {

        int[] cntAndChanges = new int[2];

        cntAndChanges[0] = money / AMERICANO.getAmericanoPrice();
        cntAndChanges[1] = money  - cntAndChanges[0] * AMERICANO.getAmericanoPrice();

        return cntAndChanges;
    }

    public static void main(String[] args) {

        System.out.println();
    }
}

