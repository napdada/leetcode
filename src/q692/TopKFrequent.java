package q692;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class TopKFrequent {
    public static void main(String[] args) {
        String[] w1 = {"i", "love", "leetcode", "i", "love", "coding"};
        String[] w2 = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        int k1 = 2, k2 = 4;
        System.out.println(TopKFrequent.topKFrequent(w1, k1));
        System.out.println(TopKFrequent.topKFrequent(w2, k2));
    }

    public static List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> count = new HashMap<>();
        for (String word : words) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }

        ArrayList<String> list = new ArrayList<>(count.keySet());
        list.sort((w1, w2) -> Objects.equals(count.get(w1), count.get(w2)) ? w1.compareTo(w2) : count.get(w2) - count.get(w1));
        return list.subList(0, k);
    }
}
