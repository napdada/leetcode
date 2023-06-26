package q1844;

public class ReplaceDigits {
    public static void main(String[] args) {
        String s1 = "a1c1e1", s2 = "a1b2c3d4e";
        System.out.println(ReplaceDigits.replaceDigits(s1));
        System.out.println(ReplaceDigits.replaceDigits(s2));
    }

    public static String replaceDigits(String s) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length() - 1; ) {
            res.append(s.charAt(i));
            res.append((char) (s.charAt(i) + (s.charAt(i + 1) - '0')));
            i = i + 2;
        }
        if (res.length() != s.length()) {
            res.append(s.charAt(s.length() - 1));
        }
        return res.toString();
    }
}
