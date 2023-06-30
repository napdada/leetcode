package q829;

public class ConsecutiveNumbersSum {
    public static void main(String[] args) {
        System.out.println(ConsecutiveNumbersSum.consecutiveNumbersSum(5));
        System.out.println(ConsecutiveNumbersSum.consecutiveNumbersSum(9));
        System.out.println(ConsecutiveNumbersSum.consecutiveNumbersSum(15));
    }

    /**
     * 利用等差数列求和
     *
     * @param n 正整数
     * @return 连续整数和等于 n 的个数
     */
    public static int consecutiveNumbersSum(int n) {
        int ans = 0;
        for (int k = 1; k * k < 2 * n; k++) {
            if (2 * n % k == 0 && (2 * n / k - k + 1) % 2 == 0) {
                ans++;
            }
        }
        return ans;
    }
}
