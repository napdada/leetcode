package q890;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAndReplacePattern {
    public static void main(String[] args) {
        String[] words = {"abc", "cba", "mee", "aqq", "dkd", "ccc"};
        String pattern = "abc";
        System.out.println(findAndReplacePattern(words, pattern));
    }

    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        HashMap<Character, Character> map1 = new HashMap<>(), map2 = new HashMap<>();
        List<String> res = new ArrayList<>();
        for (String w : words) {
            if (w.length() == pattern.length()) {
                boolean match = true;
                for (int i = 0; i < w.length(); i++) {
                    if (map1.containsKey(pattern.charAt(i))) {
                        if (!map1.get(pattern.charAt(i)).equals(w.charAt(i))) {
                            match = false;
                            break;
                        }
                    } else {
                        map1.put(pattern.charAt(i), w.charAt(i));
                        if (map2.containsKey(w.charAt(i))) {
                            if (!map2.get(w.charAt(i)).equals(pattern.charAt(i))) {
                                match = false;
                                break;
                            }
                        } else {
                            map2.put(w.charAt(i), pattern.charAt(i));
                        }
                    }
                }
                if (match) {
                    res.add(w);
                }
                map1.clear();
                map2.clear();
            }
        }
        return res;
    }
}
