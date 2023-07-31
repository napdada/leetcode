package q2600;

public class KItemsWithMaximumSum {
    public static void main(String[] args) {
        System.out.println(kItemsWithMaximumSum(3, 2, 0, 2));
        System.out.println(kItemsWithMaximumSum(3, 2, 0, 4));
    }

    public static int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if (k <= numOnes) {
            return k;
        } else if (k <= numOnes + numZeros) {
            return numOnes;
        } else if (k <= numOnes + numZeros + numNegOnes) {
            return 2 * numOnes + numZeros - k;
        }
        return 0;
    }
}
