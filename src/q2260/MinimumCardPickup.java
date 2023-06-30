package q2260;

import java.util.HashMap;

public class MinimumCardPickup {
    public static void main(String[] args) {
        int[] c1 = {3, 4, 2, 3, 4, 7}, c2 = {1, 0, 5, 3};
        System.out.println(MinimumCardPickup.minimumCardPickup(c1));
        System.out.println(MinimumCardPickup.minimumCardPickup(c2));
    }

    public static int minimumCardPickup(int[] cards) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < cards.length; i++) {
            if (map.containsKey(cards[i])) {
                min = Math.min(min, i - map.get(cards[i]) + 1);
            }
            map.put(cards[i], i);
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
