package q2007;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindOriginalArray {
    public static void main(String[] args) {
        int[] c1 = {2, 1, 2, 4, 2, 4}, c2 = {6, 3, 0, 1}, c3 = {1};
        System.out.println(Arrays.toString(FindOriginalArray.findOriginalArray(c1)));
        System.out.println(Arrays.toString(FindOriginalArray.findOriginalArray(c2)));
        System.out.println(Arrays.toString(FindOriginalArray.findOriginalArray(c3)));
    }

    public static int[] findOriginalArray(int[] changed) {
        if (changed.length % 2 != 0) {
            return new int[0];
        }

        Arrays.sort(changed);
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int num : changed) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) - 1);
                if (map.get(num) == 0) {
                    map.remove(num);
                }
                list.add(num / 2);
            } else {
                map.put(2 * num, map.containsKey(2 * num) ? map.get(2 * num) + 1 : 1);
            }
        }

        if (!map.isEmpty()) {
            return new int[0];
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
