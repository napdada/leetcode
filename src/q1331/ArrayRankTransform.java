package q1331;

import java.util.Arrays;
import java.util.HashMap;

public class ArrayRankTransform {
    public static void main(String[] args) {
        int[] arr1 = {40, 10, 20, 30};
        int[] arr2 = {1, 1, 1};
        int[] arr3 = {37, 12, 28, 9, 100, 56, 80, 5, 12};
        System.out.println(Arrays.toString(ArrayRankTransform.arrayRankTransform(arr1)));
        System.out.println(Arrays.toString(ArrayRankTransform.arrayRankTransform(arr2)));
        System.out.println(Arrays.toString(ArrayRankTransform.arrayRankTransform(arr3)));
    }

    public static int[] arrayRankTransform(int[] arr) {
        int[] sortArr = Arrays.copyOf(arr, arr.length), res = new int[arr.length];
        Arrays.sort(sortArr);
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = 0;
        for (int a : sortArr) {
            if (!map.containsKey(a)) {
                n++;
            }
            map.put(a, n);
        }
        for (int i = 0; i < res.length; i++) {
            res[i] = map.get(arr[i]);
        }
        return res;
    }
}
