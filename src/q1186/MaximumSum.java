package q1186;

public class MaximumSum {
    public static void main(String[] args) {
        int[] arr1 = {-4, 1, 2, 3}, arr2 = {1, -2, -2, 3}, arr3 = {-1, -1, -1, -1};
        System.out.println(MaximumSum.maximumSum(arr1));
        System.out.println(MaximumSum.maximumSum(arr2));
        System.out.println(MaximumSum.maximumSum(arr3));
    }

    public static int maximumSum(int[] arr) {
        int dp0 = arr[0], dp1 = 0, res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            dp1 = Math.max(dp0, dp1 + arr[i]);
            dp0 = Math.max(dp0, 0) + arr[i];
            res = Math.max(res, Math.max(dp0, dp1));
        }
        return res;
    }
}
