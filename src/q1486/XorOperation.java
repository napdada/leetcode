package q1486;

public class XorOperation {
    public static void main(String[] args) {
        System.out.println(XorOperation.xorOperation(5, 0));
        System.out.println(XorOperation.xorOperation(4, 3));
        System.out.println(XorOperation.xorOperation(1, 7));
        System.out.println(XorOperation.xorOperation(10, 5));
    }

    public static int xorOperation(int n, int start) {
        int res = start;
        for (int i = 1; i < n; i++) {
            res ^= start + 2 * i;
        }
        return res;
    }
}
