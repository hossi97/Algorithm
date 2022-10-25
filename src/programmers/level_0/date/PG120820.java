package programmers.level_0.date;

import java.time.LocalDate;

/**
 * 나이(출생년도) 출력
 *
 * Java8 이후, 날짜 및 시간을 구하는 방법
 * - java.time.LocalDate : 날짜 클래스
 * - java.time.LocalTime : 시간 클래스
 * - java.time.LocalDateTime : 날짜와 시간 클래스
 */
public class PG120820 {
    public int solution(int age) {

        LocalDate now = LocalDate.now();
        int year = now.getYear();

        int answer = year - age + 1;

        return answer;
    }

    public static void main(String[] args) {
        PG120820 pg120820 = new PG120820();

        System.out.println(pg120820.solution(40));
    }
}
