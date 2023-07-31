package q1773;

import java.util.List;

public class CountMatches {
    public static void main(String[] args) {

    }

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = 0;
        switch (ruleKey) {
            case "type":
                break;
            case "color":
                index = 1;
                break;
            case "name":
                index = 2;
                break;
        }
        int count = 0;
        for (List<String> item : items) {
            if (ruleValue.equals(item.get(index))) {
                count++;
            }
        }
        return count;
    }
}
