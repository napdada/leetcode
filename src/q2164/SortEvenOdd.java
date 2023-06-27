package q2164;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class SortEvenOdd {
    public static void main(String[] args) {
        int[] num1 = {4, 1, 2, 3}, num2 = {2, 1};
        System.out.println(Arrays.toString(SortEvenOdd.sortEvenOdd(num1)));
        System.out.println(Arrays.toString(SortEvenOdd.sortEvenOdd(num2)));
    }

    public static int[] sortEvenOdd(int[] nums) {
        ArrayList<Integer> even = new ArrayList<>(), odd = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                even.add(nums[i]);
            } else {
                odd.add(nums[i]);
            }
        }
        even.sort(Comparator.naturalOrder());
        odd.sort(Comparator.reverseOrder());
        int[] res = new int[nums.length];
        for (int i = 0; i < res.length; i++) {
            if (i % 2 == 0) {
                res[i] = even.get(i / 2);
            } else {
                res[i] = odd.get((i - 1) / 2);
            }
        }
        return res;
    }
}
