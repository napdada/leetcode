package q650;

public class MinSteps {
    public static void main(String[] args) {
        System.out.println(MinSteps.minSteps(6));
        System.out.println(MinSteps.minSteps(1));
        System.out.println(MinSteps.minSteps(2));
    }

    public static int minSteps(int n) {
        int res = 0;
        // 分解质数
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                n /= i;
                res += i;
            }
        }
        if (n > 1) {
            res += n;
        }
        return res;
    }
}
