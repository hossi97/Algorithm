package programmers.level_0.condition;

public class PG120841 {

    public int solution(int[] dot) {

        int x = dot[0];
        int y = dot[1];

        if (x > 0) {
            if (y > 0) {
                return 1;
            } else {
                return 4;
            }
        } else {
            if (y > 0) {
                return 2;
            } else {
                return 3;
            }
        }

    }

    public static void main(String[] args) {

        System.out.println();
    }

}
