package q503;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class NextGreaterElements {
    public static void main(String[] args) {
        int[] n1 = {1,2,1}, n2 = {1,2,3,4,3};
        System.out.println(Arrays.toString(nextGreaterElements(n1)));
        System.out.println(Arrays.toString(nextGreaterElements(n2)));
        System.out.println(Arrays.toString(nextGreaterElementsPlus(n1)));
        System.out.println(Arrays.toString(nextGreaterElementsPlus(n2)));
    }

    public static int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
        boolean flag1, flag2;
        for (int i = 0; i < nums.length; i++) {
            flag1 = false;
            flag2 = false;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[i]) {
                    res[i] = nums[j];
                    flag1 = true;
                    break;
                }
            }
            if (!flag1) {
                for (int j = 0; j < i; j++) {
                    if (nums[j] > nums[i]) {
                        res[i] = nums[j];
                        flag2 = true;
                        break;
                    }
                }
                if (!flag2) {
                    res[i] = -1;
                }
            }
        }
        return res;
    }

    public static int[] nextGreaterElementsPlus(int[] nums) {
        int n = nums.length;
        int[] ret = new int[n];
        Arrays.fill(ret, -1);
        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < n * 2 - 1; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i % n]) {
                ret[stack.pop()] = nums[i % n];
            }
            stack.push(i % n);
        }
        return ret;
    }
}
