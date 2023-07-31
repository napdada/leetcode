package q2643;

import java.util.Arrays;

public class RowAndMaximumOnes {
    public static void main(String[] args) {
        int[][] m1 = {{0,1},{1,0}}, m2 = {{0,0,0},{0,1,1}}, m3 = {{0,0},{1,1},{0,0}};
        System.out.println(Arrays.toString(rowAndMaximumOnes(m1)));
        System.out.println(Arrays.toString(rowAndMaximumOnes(m2)));
        System.out.println(Arrays.toString(rowAndMaximumOnes(m3)));
    }

    public static int[] rowAndMaximumOnes(int[][] mat) {
        int index = 0, maxCount = 0;
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                index = i;
            }
        }
        int[] res = new int[2];
        res[0] = index;
        res[1] = maxCount;
        return res;
    }
}
