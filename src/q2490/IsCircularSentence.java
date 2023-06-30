package q2490;

public class IsCircularSentence {
    public boolean isCircularSentence(String sentence) {
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            String s1 = words[i], s2 = i == words.length - 1 ? words[0] : words[i + 1];
            if (s1.charAt(s1.length() - 1) != s2.charAt(0)) {
                return false;
            }
        }
        return true;
    }
}
