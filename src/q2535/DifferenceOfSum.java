package q2535;

public class DifferenceOfSum {
    public static void main(String[] args) {
        int[] n1 = {1, 15, 6, 3}, n2 = {1, 2, 3, 4};
        System.out.println(differenceOfSum(n1));
        System.out.println(differenceOfSum(n2));
    }

    public static int differenceOfSum(int[] nums) {
        int sum1 = 0, sum2 = 0;
        String str;
        for (int num : nums) {
            sum1 += num;
            str = String.valueOf(num);
            for (int i = 0; i < str.length(); i++) {
                sum2 += str.charAt(i) - '0';
            }
        }
        return Math.abs(sum1 - sum2);
    }
}
