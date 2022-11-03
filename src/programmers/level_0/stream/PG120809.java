package programmers.level_0.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 배열 두배 만들기
 */
public class PG120809 {
    public int[] solution1(int[] numbers) {

//        Arrays.stream(numbers).forEach();

//        List<Integer> nums = new ArrayList<>();

        int[] nums = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            nums[i] = numbers[i] * 2;
        }

        return nums;
    }

    public int[] solution2(int[] numbers) {
        return Arrays.stream(numbers).map(i -> i * 2).toArray();
    }

    public static void main(String[] args) {

        System.out.println();
    }
}
