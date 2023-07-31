package q1911;

public class MaxAlternatingSum {
    public static void main(String[] args) {
        int[] n1 = {4, 2, 5, 3}, n2 = {5, 6, 7, 8}, n3 = {6, 2, 1, 2, 4, 5};
        System.out.println(maxAlternatingSum(n1));
        System.out.println(maxAlternatingSum(n2));
        System.out.println(maxAlternatingSum(n3));
    }

    public static long maxAlternatingSum(int[] nums) {
        long even = nums[0], odd = 0;
        for (int i = 1; i < nums.length; i++) {
            even = Math.max(even, odd + nums[i]);
            odd = Math.max(odd, even - nums[i]);
        }
        return even;
    }
}
