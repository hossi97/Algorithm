package programmers.level_0.math;

/**
 * 피자 나눠먹기 3
 */

public class PG120816 {
    public int solution(int slice, int n) {
        if(slice < n) {
            return (n % slice == 0) ? n / slice : n / slice + 1;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {

        System.out.println();
    }
}
