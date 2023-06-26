package q645;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class FindErrorNums {

    public static void main(String[] args) {
        int[] num1 = {1, 2, 2, 4}, num2 = {1, 1};
        System.out.println(Arrays.toString(FindErrorNums.findErrorNums(num1)));
        System.out.println(Arrays.toString(FindErrorNums.findErrorNums(num2)));

        System.out.println(Arrays.toString(FindErrorNums.findErrorNumsPlus(num1)));
        System.out.println(Arrays.toString(FindErrorNums.findErrorNumsPlus(num2)));
    }

    public static int[] findErrorNums(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.containsKey(num) ? countMap.get(num) + 1 : 1);
        }

        int[] res = new int[2];
        for (int i = 1; i < nums.length + 1; i++) {
            if (!countMap.containsKey(i)) {
                res[1] = i;
            } else if (countMap.get(i) == 2) {
                res[0] = i;
            }
        }
        return res;
    }

    public static int[] findErrorNumsPlus(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        int numSum = 0, setSum = 0;
        for (int num : nums) {
            numSum += num;
            numSet.add(num);
        }

        for (Integer num : numSet) {
            setSum += num;
        }

        int[] res = new int[2];
        res[0] = numSum - setSum;
        res[1] = nums.length * (nums.length + 1) / 2 - setSum;
        return res;
    }
}
