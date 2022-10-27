package programmers.level_0.calculate;

/**
 * 피자 나눠 먹기
 */
public class PG120814 {
    public int solution(int n) {
        return (int) Math.ceil(n / 7.0);
    }

    public static void main(String[] args) {
        PG120814 pg120814 = new PG120814();
        System.out.println(pg120814.solution(7));
    }
}
