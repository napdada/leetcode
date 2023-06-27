package q2185;

public class PrefixCount {
    public static void main(String[] args) {
        String[] w1 = {"pay", "attention", "practice", "attend"}, w2 = {"leetcode", "win", "loops", "success"};
        String p1 = "at", p2 = "code";
        System.out.println(PrefixCount.prefixCount(w1, p1));
        System.out.println(PrefixCount.prefixCount(w2, p2));
    }

    public static int prefixCount(String[] words, String pref) {
        int count = 0;
        for (String word : words) {
            if (word.startsWith(pref)) {
                count++;
            }
        }
        return count;
    }
}
