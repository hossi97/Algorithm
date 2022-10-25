package programmers.level_0.array;

public class PG120817 {
    public double solution(int[] numbers) {
        double answer = 0;
        int sum = 0;

        for (int num: numbers) {
            sum += num;
        }

        answer = (double) sum / numbers.length;

        return answer;
    }

    public static void main(String[] args) {
        PG120817 pg120817 = new PG120817();

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(pg120817.solution(numbers));
    }
}
