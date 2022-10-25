package programmers.level_0.calculate;

/**
 * 두 수의 나눗셈
 */

public class PG120806 {
    public int solution(int num1, int num2) {
        int answer = 0;

        answer = (int)(((double) num1 / num2) * 1000);

        return answer;
    }

    public static void main(String[] args) {
        PG120806 pg120806 = new PG120806();

        System.out.println(pg120806.solution(3, 2));
    }
}
