package q2032;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class TwoOutOfThree {

    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> set1 = new HashSet<>(), set2 = new HashSet<>(), set3 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
        }
        for (int num : nums3) {
            set3.add(num);
        }
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int num : set1) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        for (int num : set2) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        for (int num : set3) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        List<Integer> res = new ArrayList<>();
        for (int num : count.keySet()) {
            if (count.get(num) > 1) {
                res.add(num);
            }
        }
        return res;
    }
}
