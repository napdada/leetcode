package q2357;

import java.util.HashSet;

/**
 * @author napdada
 * @version : v 0.1 2023/7/11 下午9:08
 */
public class MinimumOperations {
    public int minimumOperations(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (n > 0) {
                set.add(n);
            }
        }
        return set.size();
    }
}
