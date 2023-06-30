package q1253;

import java.util.ArrayList;
import java.util.List;

public class ReconstructMatrix {
    public static void main(String[] args) {
        int[] c1 = {0, 1, 2, 0, 0, 0, 0, 0, 2, 1, 2, 1, 2}, c2 = {2, 2, 1, 1}, c3 = {2, 1, 2, 0, 1, 0, 1, 2, 0, 1};
        System.out.println(ReconstructMatrix.reconstructMatrix(9, 2, c1));
        System.out.println(ReconstructMatrix.reconstructMatrix(2, 3, c2));
        System.out.println(ReconstructMatrix.reconstructMatrix(5, 5, c3));
    }

    public static List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
        int count1 = 0, count2 = 0;
        for (int c : colsum) {
            if (c == 1) {
                count1++;
            } else if (c == 2) {
                count2++;
            }
        }
        List<List<Integer>> res = new ArrayList<>();
        if (count2 <= upper && count2 <= lower && upper + lower - 2 * count2 == count1) {
            List<Integer> up = new ArrayList<>(), lo = new ArrayList<>();
            int i = 0;
            for (int c : colsum) {
                if (c == 0) {
                    up.add(0);
                    lo.add(0);
                } else if (c == 1) {
                    if (i < upper - count2) {
                        up.add(1);
                        lo.add(0);
                        i++;
                    } else {
                        up.add(0);
                        lo.add(1);
                    }
                } else if (c == 2) {
                    up.add(1);
                    lo.add(1);
                }
            }
            res.add(up);
            res.add(lo);
        }
        return res;
    }
}
