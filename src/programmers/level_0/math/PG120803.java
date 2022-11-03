package programmers.level_0.math;

/**
 * 두 수의 차
 */

public class PG120803 {
    public int solution(int num1, int num2) {

        return num1 - num2;
    }

    public static void main(String[] args) {
        PG120803 probs = new PG120803();

        System.out.println(probs.solution(1, 2));
    }
}
