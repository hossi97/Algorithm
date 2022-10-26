package programmers.level_0.stream;

import java.util.Arrays;

/**
 * 중복된 숫자 개수
 * - Arrays.stream(array)
 */
public class PG120583 {
    // for-each
    public int solution(int[] array, int n) {

        int cnt = 0;

        for (int num : array) {
            cnt += (num == n) ? 1 : 0;
        }

        return cnt;
    }

    // Arrays.stream(array)
    public int solution2(int[] array, int n) {
        return (int) Arrays.stream(array).filter(i -> i == n).count();
    }

    public static void main(String[] args) {

        PG120583 pg120583 = new PG120583();

        System.out.println(pg120583.solution(new int[]{1, 1, 2, 3, 4, 5}, 1));
    }
}
