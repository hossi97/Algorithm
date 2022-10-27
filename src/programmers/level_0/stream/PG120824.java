package programmers.level_0.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 짝수 홀수 개수
 */
public class PG120824 {
    public int[] solution(int[] num_list) {

        int evenCnt = (int) Arrays.stream(num_list).filter(value -> value % 2 == 0).count();
        int oddCnt = (int) Arrays.stream(num_list).filter(value -> value % 2 == 0).count();



        return new int[]{evenCnt, oddCnt};
    }

    public int[] solution2(int[] num_list) {

        int evenCnt = (int) Arrays.stream(num_list).filter(value -> value % 2 == 0).count();
        int oddCnt = (int) Arrays.stream(num_list).filter(value -> value % 2 == 0).count();

        return IntStream.of(oddCnt, evenCnt).toArray();
    }

    public static void main(String[] args) {

        PG120824 pg120824 = new PG120824();

        Arrays.stream(pg120824.solution2(new int[]{1, 2, 3, 4})).forEach(System.out::println);

    }
}
