package q1323;

public class Maximum69Number {
    public static void main(String[] args) {
        System.out.println(Maximum69Number.maximum69Number(9669));
        System.out.println(Maximum69Number.maximum69Number(9996));
        System.out.println(Maximum69Number.maximum69Number(9999));
        System.out.println(Maximum69Number.maximum69NumberPlus(9999));
    }

    public static int maximum69Number(int num) {
        String s = String.valueOf(num), res;
        int i = 0;
        boolean flag = false;
        for (; i < s.length(); i++) {
            if (s.charAt(i) == '6') {
                flag = true;
                break;
            }
        }
        res = s.substring(0, i);
        if (flag) {
            res += '9';
        }
        if (i < s.length()) {
            res += s.substring(i + 1);
        }
        return Integer.parseInt(res);
    }

    public static int maximum69NumberPlus(int num) {
        return Integer.parseInt(String.valueOf(num).replaceFirst("6", "9"));
    }
}
