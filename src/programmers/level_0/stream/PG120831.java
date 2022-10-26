package programmers.level_0.stream;

import java.util.stream.IntStream;

/**
 * 짝수의 합
 * - IntStream : 반복문을 간결하게 처리할 수 있다.
 */
public class PG120831 {
    // 단일 for 문
    public int solution(int n) {

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += (i % 2 == 0) ? i : 0;
        }

        return sum;
    }

    // IntStream
    public int solution2(int n) {
        return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 0).sum();
    }

    public static void main(String[] args) {
        PG120831 pg120831 = new PG120831();

        System.out.println(pg120831.solution(10));
    }
}
