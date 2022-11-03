package programmers.level_0.math;

/**
 * 제곱수 판별하기
 */
public class PG120909 {
    public int solution(int n) {

        if ((int)Math.sqrt(n) == Math.sqrt(n)) {
            return 1;
        }

        return 2;
    }

    public int solution2(int n) {

        if (n % Math.sqrt(n) == 0) {
            return 1;
        }

        return 2;
    }

    public int solution3(int n) {

        Double m = Math.sqrt(n);

        if (Math.sqrt(n) == m.intValue()) {
            return 1;
        }

        return 2;
    }

    public static void main(String[] args) {

        System.out.println();
    }
}
