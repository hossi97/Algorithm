package programmers.level_0.array;

import java.util.Arrays;

/**
 * 배열 원소의 길이
 */
public class PG120854 {
    public int[] solution(String[] strlist) {
        int[] arr = new int[strlist.length];

        for (int i = 0; i < strlist.length; i++) {
            arr[i] = strlist[i].length();
        }

        return arr;
    }

    public int[] solution2(String[] strList) {
        return Arrays.stream(strList).mapToInt(String::length).toArray();
    }

    public static void main(String[] args) {

        System.out.println();
    }
}
