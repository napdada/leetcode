package q1962;

import java.util.PriorityQueue;

public class MinStoneSum {
    public static void main(String[] args) {
        int[] p1 = {5,4,9}, p2 = {4,3,6,7};
        System.out.println(minStoneSum(p1, 2));
        System.out.println(minStoneSum(p2, 3));
    }

    public static int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);
        int sum = 0;
        for (int p : piles) {
            queue.add(p);
            sum += p;
        }
        while (k-- > 0) {
            int e = queue.poll();
            sum -= e / 2;
            queue.add((e + 1) / 2);
        }
        return sum;
    }
}
