package q152;

public class MaxProduct {
    public static void main(String[] args) {
        int[] num1 = {2, 3, -2, 4}, num2 = {-2, 0, -1};
        System.out.println(MaxProduct.maxProduct(num1));
        System.out.println(MaxProduct.maxProduct(num2));
    }

    public static int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE, imax = 1, imin = 1;
        for (int num : nums) {
            if (num < 0) {
                int tmp = imax;
                imax = imin;
                imin = tmp;
            }
            imax = Math.max(imax * num, num);
            imin = Math.min(imin * num, num);
            max = Math.max(max, imax);
        }
        return max;
    }
}
