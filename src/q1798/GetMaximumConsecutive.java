package q1798;

import java.util.Arrays;

public class GetMaximumConsecutive {
    public static void main(String[] args) {
        int[] coins1 = {1, 4, 10, 3, 1}, coins2 = {1, 1, 1, 4};
        System.out.println(GetMaximumConsecutive.getMaximumConsecutive(coins1));
        System.out.println(GetMaximumConsecutive.getMaximumConsecutive(coins2));
    }

    public static int getMaximumConsecutive(int[] coins) {
        Arrays.sort(coins);

        int max = 0;
        for (int coin : coins) {
            if (coin > max + 1) {
                break;
            }
            max += coin;
        }
        return max + 1;
    }
}
