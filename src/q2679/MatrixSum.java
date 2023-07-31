package q2679;

import java.util.Arrays;

public class MatrixSum {
    public static void main(String[] args) {
        int[][] a1 = {{7,2,1},{6,4,2},{6,5,3},{3,2,1}}, a2 = {{1}};
        System.out.println(matrixSum(a1));
        System.out.println(matrixSum(a2));
    }

    public static int matrixSum(int[][] nums) {
        for (int[] num : nums) {
            Arrays.sort(num);
        }

        int score = 0, max = 0;
        for (int j = 0; j < nums[0].length; j++) {
            for (int[] num : nums) {
                max = Math.max(max, num[j]);
            }
            score += max;
        }
        return score;
    }
}
