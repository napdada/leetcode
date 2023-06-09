package q2611;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

/**
 * LeetCode Q2611 老鼠和奶酪(<a href="https://leetcode.cn/problems/mice-and-cheese/">Q2611 老鼠和奶酪</a>)
 *
 * @author napdada
 * @version : v 0.1 2023/6/9 下午7:49
 */
public class MiceAndCheese {

    public static void main(String[] args) {
        int[] reward1 = {1, 1, 3, 4}, reward2 = {4, 4, 1, 1};
        int k = 2;
        System.out.println(MiceAndCheese.miceAndCheese(reward1, reward2, k));
        System.out.println(MiceAndCheese.miceAndCheesePlus(reward1, reward2, k));

        reward1 = new int[]{1, 4, 4, 6, 4};
        reward2 = new int[]{6, 5, 3, 6, 1};
        k = 1;
        System.out.println(MiceAndCheese.miceAndCheese(reward1, reward2, k));
        System.out.println(MiceAndCheese.miceAndCheesePlus(reward1, reward2, k));
    }

    public static int miceAndCheese(int[] reward1, int[] reward2, int k) {
        Integer[] diffReward = new Integer[reward1.length];
        int score = 0;
        for (int i = 0; i < reward1.length; i++) {
            diffReward[i] = reward1[i] - reward2[i];
        }
        // 差值从大到小排序
        Arrays.sort(diffReward, Comparator.reverseOrder());
        // 记录第一只老鼠该吃的奶酪(前 k 个差值大的奶酪)
        HashMap<Integer, Integer> mice1 = new HashMap<>();
        for (int i = 0; i < k; i++) {
            if (mice1.containsKey(diffReward[i])) {
                mice1.put(diffReward[i], mice1.get(diffReward[i]) + 1);
            } else {
                mice1.put(diffReward[i], 1);
            }
        }
        // 遍历每块奶酪，优先给第一只老鼠吃，否则给第二只老鼠吃
        for (int i = 0; i < reward1.length; i++) {
            int diff = reward1[i] - reward2[i];
            if (mice1.containsKey(diff)) {
                mice1.put(diff, mice1.get(diff) - 1);
                if (mice1.get(diff) == 0) {
                    mice1.remove(diff);
                }
                score += reward1[i];
            } else {
                score += reward2[i];
            }
        }
        return score;
    }

    public static int miceAndCheesePlus(int[] reward1, int[] reward2, int k) {
        Integer[] diffReward = new Integer[reward1.length];
        int score = 0;
        for (int i = 0; i < reward1.length; i++) {
            diffReward[i] = reward1[i] - reward2[i];
            score += reward2[i];
        }
        Arrays.sort(diffReward, Comparator.reverseOrder());
        for (int i = 0; i < k; i++) {
            score += diffReward[i];
        }
        return score;
    }
}
