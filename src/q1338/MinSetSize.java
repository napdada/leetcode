package q1338;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class MinSetSize {
    public static void main(String[] args) {
        int[] a1 = {3,3,3,3,5,5,5,2,2,7}, a2 = {7,7,7,7,7,7};
        System.out.println(minSetSize(a1));
        System.out.println(minSetSize(a2));
    }

    public static int minSetSize(int[] arr) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int a : arr) {
            countMap.put(a, countMap.containsKey(a) ? countMap.get(a) + 1 : 1);
        }
        List<Integer> count = new ArrayList<>(countMap.values());
        count.sort(Comparator.reverseOrder());
        int res = 1, sum = count.get(0);
        for (int i = 1; i < count.size(); i++) {
            if (sum >= arr.length * 1.0 / 2) {
                break;
            }
            sum += count.get(i);
            res++;
        }
        return res;
    }
}
