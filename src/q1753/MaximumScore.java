package q1753;

public class MaximumScore {
    public static void main(String[] args) {
        System.out.println(MaximumScore.maximumScore(2, 4, 6));
        System.out.println(MaximumScore.maximumScore(4, 4, 6));
        System.out.println(MaximumScore.maximumScore(1, 8, 8));
    }

    public static int maximumScore(int a, int b, int c) {
        if (a + b < c) {
            return a + b;
        }
        if (b + c < a) {
            return b + c;
        }
        if (a + c < b) {
            return a + c;
        }
        return (a + b + c) / 2;
    }
}
