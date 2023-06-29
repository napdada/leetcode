package q581;

public class FindUnsortedSubarray {
    public static void main(String[] args) {
        int[] n1 = {1, 3, 5, 4, 2}, n2 = {1, 2, 3, 4}, n3 = {1};
        System.out.println(findUnsortedSubarray(n1));
        System.out.println(findUnsortedSubarray(n2));
        System.out.println(findUnsortedSubarray(n3));
    }

    public static int findUnsortedSubarray(int[] nums) {
        int max = Integer.MIN_VALUE, r = -1;
        int min = Integer.MAX_VALUE, l = -1;
        for (int i = 0; i < nums.length; i++) {
            if (max > nums[i]) {
                r = i;
            } else {
                max = nums[i];
            }

            if (min < nums[nums.length - i - 1]) {
                l = nums.length - i - 1;
            } else {
                min = nums[nums.length - i - 1];
            }
        }
        return r == -1 ? 0 : r - l + 1;
    }
}
