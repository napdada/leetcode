package q1363;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LargestMultipleOfThree {
    public static void main(String[] args) {
        int[] d1 = {7, 1, 2, 4, 0, 0, 4, 0, 3, 8}, d2 = {8, 6, 7, 1, 0}, d3 = {1}, d4 = {0, 0, 0, 0, 0, 0};
        System.out.println(LargestMultipleOfThree.largestMultipleOfThree(d1));
        System.out.println(LargestMultipleOfThree.largestMultipleOfThree(d2));
        System.out.println(LargestMultipleOfThree.largestMultipleOfThree(d3));
        System.out.println(LargestMultipleOfThree.largestMultipleOfThree(d4));
    }

    public static String largestMultipleOfThree(int[] digits) {
        // 余 0、1、2
        List<Integer> pickList = new ArrayList<>(), list1 = new ArrayList<>(), list2 = new ArrayList<>();
        int sum = 0;
        for (int digit : digits) {
            if (digit % 3 == 0) {
                pickList.add(digit);
            } else if (digit % 3 == 1) {
                list1.add(digit);
            } else {
                list2.add(digit);
            }
            sum += digit;
        }

        list1.sort(Comparator.naturalOrder());
        list2.sort(Comparator.naturalOrder());

        // 根据 sum 余数决定如何移除数，优先移除数量少的
        if (sum % 3 == 1) {
            if (list1.size() != 0) {
                list1.remove(0);
            } else if (list2.size() > 1) {
                list2.remove(0);
                list2.remove(0);
            }
        }
        if (sum % 3 == 2) {
            if (list2.size() != 0) {
                list2.remove(0);
            } else if (list1.size() > 1) {
                list1.remove(0);
                list1.remove(0);
            }
        }
        pickList.addAll(list1);
        pickList.addAll(list2);
        pickList.sort(Comparator.reverseOrder());

        if (pickList.size() == 0) {
            return "";
        } else if (pickList.get(0) == 0) {
            return "0";
        }

        StringBuilder s = new StringBuilder();
        for (Integer pick : pickList) {
            s.append(pick);
        }
        return s.toString();
    }
}
