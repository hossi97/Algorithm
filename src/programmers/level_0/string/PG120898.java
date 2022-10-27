package programmers.level_0.string;

/**
 * 편지
 */
public class PG120898 {
    public int solution(String message) {

        return 2 * message.length();
    }

    public static void main(String[] args) {
        PG120898 pg120898 = new PG120898();

        System.out.println(pg120898.solution("I love you~"));
    }
}
