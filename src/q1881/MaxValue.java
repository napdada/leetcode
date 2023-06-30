package q1881;

public class MaxValue {
    public static void main(String[] args) {
        System.out.println(MaxValue.maxValue("99", 9));
        System.out.println(MaxValue.maxValue("-13", 2));
    }

    public static String maxValue(String n, int x) {
        int i;
        if (n.charAt(0) == '-') {
            i = 1;
            for (; i < n.length(); i++) {
                if (n.charAt(i) - '0' > x) {
                    break;
                }
            }
        } else {
            i = 0;
            for (; i < n.length(); i++) {
                if (n.charAt(i) - '0' < x) {
                    break;
                }
            }
        }
        return n.substring(0, i) + x + n.substring(i);
    }
}
