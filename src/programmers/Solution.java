package programmers;

import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {
    public int solution(int[][] heights) {

        int row = heights.length;
        int col = heights[0].length;

        System.out.println("row = " + row);
        System.out.println("col = " + col);

        int minRow = Integer.MAX_VALUE;
        int minCol = Integer.MAX_VALUE;

        for (int i = 0; i < row; i++) {
            if (minRow > heights[i][0]) minRow = heights[0][i];
            if (minRow > heights[i][col - 1]) minRow = heights[0][col - 1];
        }

        for (int i = 0; i < col; i++) {
            if (minCol > heights[0][i]) minCol = heights[0][i];
            if (minCol > heights[row - 1][i]) minCol = heights[row - 1][i];
        }

        int min = (int) Math.min(minCol, minRow);
        int sum = 0;
        for (int i = 1; i < row - 1; i++) {
            for (int j = 1; j < col - 1; j++) {
                 sum += min - heights[i][j];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] nums = {{3, 4, 5, 4, 3, 3}, {3, 2, 1, 1, 2, 3}, {4, 2, 1, 1, 2, 3}, {3, 3, 3, 3, 5, 3}};

        System.out.println(solution.solution(nums));
    }

}
