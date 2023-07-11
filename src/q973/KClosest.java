package q973;

import java.util.Arrays;
import java.util.Comparator;

public class KClosest {
    public static void main(String[] args) {
        int[][] p1 = {{1, 3}, {-2, 2}}, p2 = {{3, 3}, {5, -1}, {-2, 4}};
        System.out.println(Arrays.deepToString(kClosest(p1, 1)));
        System.out.println(Arrays.deepToString(kClosest(p2, 2)));
    }

    public static int[][] kClosest(int[][] points, int k) {
        Arrays.sort(points, new Comparator<int[]>() {
            public int compare(int[] point1, int[] point2) {
                return (point1[0] * point1[0] + point1[1] * point1[1]) - (point2[0] * point2[0] + point2[1] * point2[1]);
            }
        });
        return Arrays.copyOfRange(points, 0, k);
    }
}
