package programmers.level_0.stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 배열 뒤집기
 */
public class PG120821 {
    /* for-each */
    public int[] solution(int[] num_list) {
        int[] arr = new int[num_list.length];

        int i = num_list.length - 1;
        for (int num : num_list) {
            arr[i--] = num;
        }

        return arr;
    }

    /* for-i */
    public int[] solution2(int[] num_list) {
        int[] arr = new int[num_list.length];

        for (int i = 0; i < num_list.length; i++) {
            arr[num_list.length - 1 - i] = num_list[i];
        }

        return arr;
    }

    /*
     * boxed() 메소드는 IntStream 같이 원시 타입에 대한 스트림 지원을 클래스 타입 (예: IntStream -> Stream<Integer>)으로 전환하여
     * 전용으로 실행 가능한 (예를 들어 본문과 같이 int 자체로는 Collection 에 못 담기 때문에
     * Integer 클래스로 변환하여 List<Integer> 로 담기 위해 등) 기능을 수행하기 위해 존재합니다.
     */
    public int[] solution3(int[] num_list) {

        // Array<int> to List<Integer>
        List<Integer> list = Arrays.stream(num_list).boxed().collect(Collectors.toList());

        // Collections 반대로 정렬
        Collections.reverse(list);

        // List<Integer> to Array<int>
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {

        System.out.println();
    }
}
