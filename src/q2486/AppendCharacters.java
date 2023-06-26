package q2486;

/**
 * @author napdada
 * @version : v 0.1 2023/6/26 下午11:41
 */
public class AppendCharacters {
    public int appendCharacters(String s, String t) {
        int flag = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t.charAt(flag)) {
                flag++;
            }
            if (flag == t.length()) {
                break;
            }
        }
        return t.length() - flag;
    }
}
