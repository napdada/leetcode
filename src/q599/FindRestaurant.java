package q599;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindRestaurant {
    public static void main(String[] args) {
        String[] l1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] l2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
        System.out.println(Arrays.toString(findRestaurant(l1, l2)));
    }

    public static String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        List<String> res = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) {
                if (map.get(list2[i]) + i < min) {
                    res.clear();
                    min = map.get(list2[i]) + i;
                    res.add(list2[i]);
                } else if (map.get(list2[i]) + i == min) {
                    res.add(list2[i]);
                }
            }
        }
        return res.toArray(new String[0]);
    }
}
