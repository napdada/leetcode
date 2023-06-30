package q55;

import java.util.HashSet;

public class CanJump {
    public static void main(String[] args) {
        int[] num1 = {2, 5, 0, 0}, num2 = {3, 2, 1, 0, 4};
        System.out.println(CanJump.canJump(num1));
        System.out.println(CanJump.canJump(num2));
    }

    public static boolean canJump(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        set.add(nums.length - 1);
        int min = nums.length;

        for (int i = nums.length - 2; i >= 0; i--) {
            if ((i + nums[i]) >= min || set.contains(i + nums[i])) {
                set.add(i);
                min = Math.min(min, i);
            }
        }
        return set.contains(0);
    }

    public static boolean canJumpPlus(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                return false;
            }
            k = Math.max(k, i + nums[i]);
        }
        return true;
    }
}
