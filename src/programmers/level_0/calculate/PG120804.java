package programmers.level_0.calculate;

/**
 * 두 수의 곱
 */
public class PG120804 {

    public int solution(int num1, int num2) {
        int answer = num1 * num2;
        return answer;
    }

    public static void main(String[] args) {
        PG120804 prob = new PG120804();

        int num1 = 1;
        int num2 = 2;

        System.out.println(prob.solution(num1, num2));
    }
}

