package q2615;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * LeetCode Q2615 等值距离和(<a href="https://leetcode.cn/problems/sum-of-distances/">Q2615 等值距离和</a>)
 *
 * @author napdada
 * @version : v 0.1 2023/6/9 下午7:52
 */
public class Distance {

    public static void main(String[] args) {
        int[] nums = {1, 3, 1, 1, 2};
        System.out.println(Arrays.toString(Distance.distance(nums)));

        nums = new int[]{0, 5, 3};
        System.out.println(Arrays.toString(Distance.distance(nums)));
    }

    public static long[] distance(int[] nums) {
        long[] arr = new long[nums.length];

        // k: 相同的值，v: 值相同的下标 list
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], new ArrayList<>());
            }
            map.get(nums[i]).add(i);
            arr[i] = 0;
        }

        for (Integer key : map.keySet()) {
            ArrayList<Integer> values = map.get(key);
            if (values.size() > 1) {
                // 某元素与其之前、之后元素距离之和
                long[] before = new long[values.size()];
                long[] after = new long[values.size()];

                before[0] = 0;
                for (Integer v : values) {
                    after[0] += v - values.get(0);
                }
                arr[values.get(0)] = before[0] + after[0];

                // 根据下标必然递增特性，利用上一个元素的计算结果，离前面越来越远、离后面越来越近
                for (int i = 1; i < values.size(); i++) {
                    int diff = values.get(i) - values.get(i - 1);
                    before[i] = before[i - 1] + (long) i * diff;
                    after[i] = after[i - 1] - (long) (values.size() - i) * diff;
                    arr[values.get(i)] = before[i] + after[i];
                }
            }
        }

        return arr;
    }
}
