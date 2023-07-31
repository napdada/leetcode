package q1791;

public class FindCenter {
    public static void main(String[] args) {
        int[][] e1 = {{1, 2}, {2, 3}, {4, 2}}, e2 = {{1, 2}, {5, 1}, {1, 3}, {1, 4}};
        System.out.println(findCenter(e1));
        System.out.println(findCenter(e2));
    }

    public static int findCenter(int[][] edges) {
        int x1 = edges[0][0], x2 = edges[0][1];
        int y1 = edges[1][0], y2 = edges[1][1];
        if (x1 == y1 || x1 == y2) {
            return x1;
        }
        if (x2 == y1 || x2 == y2) {
            return x2;
        }
        return 0;
    }
}
