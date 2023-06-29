package q1464;

import java.util.Arrays;

public class MaxProduct {
    public static void main(String[] args) {
        int[] n1 = {3, 4, 5, 2}, n2 = {1, 5, 4, 5}, n3 = {3, 7};
        System.out.println(MaxProduct.maxProduct(n1));
        System.out.println(MaxProduct.maxProduct(n2));
        System.out.println(MaxProduct.maxProduct(n3));
    }

    public static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
    }
}
