package q1177;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author napdada
 * @version : v 0.1 2023/6/15 下午10:22
 */
public class CanMakePaliQueries {

    public static void main(String[] args) {
        String s = "abcda";
        int[][] queries = {{3, 3, 0}, {1, 2, 0}, {0, 3, 1}, {0, 3, 2}, {0, 4, 1}};
        System.out.println(CanMakePaliQueries.canMakePaliQueries(s, queries));
    }

    public static List<Boolean> canMakePaliQueries(String s, int[][] queries) {
        if (s == null || s.isEmpty()) {
            return null;
        }

        // 统计下标 i 之前各字母出现个数
        HashMap<Integer, HashMap<String, Integer>> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            HashMap<String, Integer> countMap = new HashMap<>();
            if (i != 0) {
                String key = s.substring(i - 1, i);
                countMap.putAll(map.get(i - 1));
                countMap.put(key, countMap.containsKey(key) ? countMap.get(key) + 1 : 1);
            }
            map.put(i, countMap);
        }

        List<Boolean> res = new ArrayList<>();

        for (int[] query : queries) {
            int left = query[0], right = query[1], k = query[2];
            String sub = s.substring(left, right + 1);
            String r = s.substring(right, right + 1);

            // 计算 left 到 right 之间出现奇数次字母个数
            HashMap<String, Integer> leftMap = map.get(left);
            HashMap<String, Integer> rightMap = new HashMap<>(map.get(right));
            rightMap.put(r, rightMap.containsKey(r) ? rightMap.get(r) + 1 : 1);
            int oddNum = 0;
            for (String key : rightMap.keySet()) {
                int num = rightMap.get(key);
                if (leftMap.containsKey(key)) {
                    num -= leftMap.get(key);
                }
                if (num % 2 != 0) {
                    oddNum++;
                }
            }
            // 只有出现奇数次字母需要替换，使得字符串成为回文
            int replaceNum = sub.length() % 2 == 0 ? oddNum / 2 : (oddNum - 1) / 2;
            res.add(replaceNum <= k);
        }
        return res;
    }

    public static List<Boolean> canMakePaliQueriesPlus(String s, int[][] queries) {
        int[] count = new int[s.length() + 1];
        for (int i = 0; i < count.length - 1; i++) {
            count[i + 1] = count[i] ^ (1 << (s.charAt(i) - 'a'));
        }
        List<Boolean> res = new ArrayList<>();
        for (int[] query : queries) {
            int l = query[0], r = query[1], k = query[2];
            int bits = 0, x = count[r + 1] ^ count[l];
            while (x > 0) {
                x &= x - 1;
                bits++;
            }
            res.add(bits <= 2 * k + 1);
        }
        return res;
    }
}
