package q187;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindRepeatedDnaSequences {
    public static void main(String[] args) {
        String s1 = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT", s2 = "AAAAAAAAAAA";
        System.out.println(FindRepeatedDnaSequences.findRepeatedDnaSequences(s1));
        System.out.println(FindRepeatedDnaSequences.findRepeatedDnaSequences(s2));
    }

    public static List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new ArrayList<>();
        if (s.length() < 10) {
            return res;
        }

        // 重复的 dna、已经加入 res 的 dna
        HashSet<String> dna = new HashSet<>(), addDna = new HashSet<>();
        for (int i = 0; i < s.length() - 9; i++) {
            String sub = s.substring(i, i + 10);
            if (dna.contains(sub) && !addDna.contains(sub)) {
                res.add(sub);
                addDna.add(sub);
            } else {
                dna.add(sub);
            }
        }
        return res;
    }
}
