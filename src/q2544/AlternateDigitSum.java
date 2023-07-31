package q2544;

public class AlternateDigitSum {
    public static void main(String[] args) {

    }

    public int alternateDigitSum(int n) {
        String s = String.valueOf(n);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                sum += s.charAt(i) - '0';
            } else {
                sum -= s.charAt(i) - '0';
            }
        }
        return sum;
    }
}
