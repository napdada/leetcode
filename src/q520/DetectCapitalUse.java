package q520;

public class DetectCapitalUse {
    public static void main(String[] args) {
        System.out.println(DetectCapitalUse.detectCapitalUse("USA"));
        System.out.println(DetectCapitalUse.detectCapitalUse("FlaG"));
    }

    public static boolean detectCapitalUse(String word) {
        if (word.length() == 1) {
            return true;
        }

        if (word.charAt(0) >= 'a' && word.charAt(0) <= 'z') {
            for (int i = 1; i < word.length(); i++) {
                if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
                    return false;
                }
            }
        } else {
            boolean isBig = (word.charAt(1) >= 'A' && word.charAt(1) <= 'Z');
            for (int i = 2; i < word.length(); i++) {
                if (isBig) {
                    if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z') {
                        return false;
                    }
                } else {
                    if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
