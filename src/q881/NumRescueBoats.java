package q881;

import java.util.Arrays;

public class NumRescueBoats {
    public static void main(String[] args) {
        int[] p1 = {1, 2}, p2 = {3, 2, 2, 1}, p3 = {3, 5, 3, 4};
        int l1 = 3, l2 = 3, l3 = 5;
        System.out.println(NumRescueBoats.numRescueBoats(p1, l1));
        System.out.println(NumRescueBoats.numRescueBoats(p2, l2));
        System.out.println(NumRescueBoats.numRescueBoats(p3, l3));
    }

    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int l = 0, r = people.length - 1, num = 0;
        while (l <= r) {
            if (people[l] + people[r] <= limit) {
                l++;
            }
            r--;
            num++;
        }
        return num;
    }
}
