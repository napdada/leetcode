package q1846;

import java.util.Arrays;

public class MaxElementAfterOperate {
    public static void main(String[] args) {
        int[] arr1 = {2, 2, 1, 2, 1}, arr2 = {100, 1, 1000};
        System.out.println(MaxElementAfterOperate.maximumElementAfterDecrementingAndRearranging(arr1));
        System.out.println(MaxElementAfterOperate.maximumElementAfterDecrementingAndRearranging(arr2));
    }

    public static int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);

        int max = 1;
        arr[0] = 1;

        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i] - arr[i - 1]) > 1) {
                arr[i] = arr[i - 1] + 1;
            }
            max = Math.max(max, arr[i]);
        }

        return max;
    }
}
