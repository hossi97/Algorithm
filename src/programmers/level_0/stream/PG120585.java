package programmers.level_0.stream;

import java.util.Arrays;

/**
 * 머쓱이보다 키 큰 사람
 */
public class PG120585 {
    public int solution(int[] array, int height) {
        int index = 0;

        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            if(array[i] > height) {
                index = i;
            }
        }

        return index;
    }

    public int solution2(int[] array, int height) {
        return (int) Arrays.stream(array).filter(value -> value > height).count();
    }

    public static void main(String[] args) {

        System.out.println();
    }
}
