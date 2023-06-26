package q541;

public class ReverseStr {
    public static void main(String[] args) {
        System.out.println(ReverseStr.reverseStr("abcdefg", 2));
        System.out.println(ReverseStr.reverseStr("abcd", 2));
    }

    public static String reverseStr(String s, int k) {
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < s.length(); ) {
            if (s.length() - i < k) {
                append(res, s.substring(i));
            } else if (s.length() - i >= k && s.length() - i < 2 * k) {
                append(res, s.substring(i, i + k));
                res.append(s.substring(i + k));
            } else {
                append(res, s.substring(i, i + k));
                res.append(s, i + k, i + 2 * k);
            }
            i += 2 * k;
        }
        return res.toString();
    }

    public static void append(StringBuilder s, String add) {
        for (int i = add.length() - 1; i >= 0; i--) {
            s.append(add.charAt(i));
        }
    }
}
