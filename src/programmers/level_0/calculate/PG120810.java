package programmers.level_0.calculate;

/**
 * 두 수의 나머지
 */
public class PG120810 {
    public int solution(int num1, int num2) {

        return num1 % num2;
    }

    public static void main(String[] args) {
        PG120810 prob = new PG120810();

        System.out.println(prob.solution(1, 2));
    }
}
