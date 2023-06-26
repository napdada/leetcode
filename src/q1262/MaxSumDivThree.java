package q1262;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxSumDivThree {
    public static void main(String[] args) {
        int[] nums1 = {1, 1, 3}, nums2 = {4}, nums3 = {1, 2, 3, 4, 4};
        System.out.println(MaxSumDivThree.maxSumDivThree(nums1));
        System.out.println(MaxSumDivThree.maxSumDivThree(nums2));
        System.out.println(MaxSumDivThree.maxSumDivThree(nums3));
    }

    public static int maxSumDivThree(int[] nums) {
        int sum = 0;
        List<Integer> list1 = new ArrayList<>(), list2 = new ArrayList<>();
        for (int num : nums) {
            if (num % 3 == 1) {
                list1.add(num);
            } else if (num % 3 == 2) {
                list2.add(num);
            }
            sum += num;
        }

        Collections.sort(list1);
        Collections.sort(list2);

        if (sum % 3 != 0) {
            if (sum % 3 == 2) {
                List<Integer> list3 = list1;
                list1 = list2;
                list2 = list3;
            }
            if (list1.size() == 0 && list2.size() < 2) {
                sum = 0;
            } else if (list1.size() == 0) {
                sum -= list2.get(0) + list2.get(1);
            } else if (list2.size() < 2) {
                sum -= list1.get(0);
            } else {
                sum -= Math.min(list1.get(0), list2.get(0) + list2.get(1));
            }
        }
        return sum;
    }
}
