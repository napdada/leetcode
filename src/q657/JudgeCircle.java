package q657;

public class JudgeCircle {
    public static void main(String[] args) {
        System.out.println(judgeCircle("UD"));
        System.out.println(judgeCircle("LL"));
    }

    public static boolean judgeCircle(String moves) {
        int raw = 0, col = 0;
        for (int i = 0; i < moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'U':
                    col++;
                    break;
                case 'D':
                    col--;
                    break;
                case 'L':
                    raw++;
                    break;
                case 'R':
                    raw--;
                    break;
            }
        }
        return raw == 0 && col == 0;
    }
}
