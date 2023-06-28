package q238;

import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] n1 = {1, 2, 3, 4}, n2 = {-1, 1, 0, -3, 3};
        System.out.println(Arrays.toString(ProductExceptSelf.productExceptSelf(n1)));
        System.out.println(Arrays.toString(ProductExceptSelf.productExceptSelf(n2)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];

        res[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            res[i] = nums[i - 1] * res[i - 1];
        }

        int r = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            res[i] *= r;
            r *= nums[i];
        }
        return res;
    }
}
