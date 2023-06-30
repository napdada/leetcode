package q2485;

public class PivotInteger {
    public static void main(String[] args) {
        System.out.println(PivotInteger.pivotInteger(8));
        System.out.println(PivotInteger.pivotInteger(1));
        System.out.println(PivotInteger.pivotInteger(4));
    }

    public static int pivotInteger(int n) {
        int tmp = (int) (n * (n + 1) * 1.0 / 2);
        int x = (int) Math.sqrt(n * (n + 1) * 1.0 / 2);
        return x * x == tmp ? x : -1;
    }
}
