package programmers.level_0.array;

import java.util.Arrays;

/**
 * 최대값 만들기 (1)
 */
public class PG120847 {
    public int solution(int[] numbers) {

        Arrays.sort(numbers);

        return numbers[numbers.length - 1] * numbers[numbers.length - 2];
    }

    public static void main(String[] args) {

        System.out.println();
    }
}
