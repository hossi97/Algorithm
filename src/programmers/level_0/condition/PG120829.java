package programmers.level_0.condition;

/**
 * 각도기
 * - 예각 < 90 : 1
 * - 직각 = 90 : 2
 * - 90 < 둔각 < 180 : 3
 * - 180 = 평각 : 4
 */
public class PG120829 {
    public int solution(int angle) {
        int answer = 0;

        if (angle < 90) {
            answer = 1;
        } else if (angle == 90) {
            answer = 2;
        } else if (90 < angle && angle < 180) {
            answer = 3;
        } else if (angle == 180) {
            answer = 4;
        }

        return answer;
    }

    public static void main(String[] args) {
        PG120829 pg120829 = new PG120829();




        System.out.println(pg120829.solution(120));
    }
}
