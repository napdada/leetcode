package q1561;

import java.util.Arrays;

public class MaxCoins {
    public static void main(String[] args) {
        int[] p1 = {2, 4, 1, 2, 7, 8}, p2 = {2, 4, 5}, p3 = {9, 8, 7, 6, 5, 1, 2, 3, 4};
        System.out.println(maxCoins(p1));
        System.out.println(maxCoins(p2));
        System.out.println(maxCoins(p3));
    }

    public static int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int i = 0, j = piles.length - 2, num = 0;
        while (i < j) {
            num += piles[j];
            j = j - 2;
            i++;
        }
        return num;
    }
}
