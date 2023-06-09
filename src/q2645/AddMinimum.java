package q2645;

/**
 * LeetCode Q2645 构造有效字符串的最少插入数(<a href="https://leetcode.cn/problems/minimum-additions-to-make-valid-string/">Q2645 构造有效字符串的最少插入数</a>)
 *
 * @author napdada
 * @version : v 0.1 2023/6/9 下午7:54
 */
public class AddMinimum {

    public static void main(String[] args) {
        System.out.println(AddMinimum.addMinimum("b"));
        System.out.println(AddMinimum.addMinimum("aaa"));
        System.out.println(AddMinimum.addMinimum("abc"));
    }

    public static int addMinimum(String word) {
        int count = 1;
        for (int i = 0; i < word.length() - 1; i++) {
            // 若相邻字符不递增，则属于两个"abc"，计算有多少个"abc"
            if (word.charAt(i) >= word.charAt(i + 1)) {
                count++;
            }
        }
        return 3 * count - word.length();
    }
}
