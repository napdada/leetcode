package q1375;

/**
 * @author napdada
 * @version : v 0.1 2023/6/14 下午8:20
 */
public class NumTimesAllBlue {
    public static void main(String[] args) {
        System.out.println(NumTimesAllBlue.numTimesAllBlue(new int[] {3, 2, 4, 1, 5}));
        System.out.println(NumTimesAllBlue.numTimesAllBlue(new int[] {4, 1, 2, 3}));
    }

    public static int numTimesAllBlue(int[] flips) {
        int num = 0, max = 0;
        for (int i = 0; i < flips.length; i++) {
            max = Math.max(max, flips[i]);
            if (max == i + 1) {
                num++;
            }
        }
        return num;
    }
}