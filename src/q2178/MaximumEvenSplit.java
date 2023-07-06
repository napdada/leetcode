package q2178;

import java.util.ArrayList;
import java.util.List;

public class MaximumEvenSplit {
    public static void main(String[] args) {
        System.out.println(maximumEvenSplit(12L));
        System.out.println(maximumEvenSplit(7L));
        System.out.println(maximumEvenSplit(28L));
        System.out.println(maximumEvenSplitPlus(12L));
        System.out.println(maximumEvenSplitPlus(7L));
        System.out.println(maximumEvenSplitPlus(28L));
    }

    public static List<Long> maximumEvenSplit(long finalSum) {
        List<Long> res = new ArrayList<>();
        if (finalSum % 2 != 0) {
            return res;
        }
        long sum  = finalSum / 2, count = 2;
        double halfCount, avg;
        while (true) {
            halfCount = Math.ceil(count * 1.0 / 2);
            avg = sum * 1.0 / count;
            if (halfCount > avg) {
                break;
            }
            count++;
        }
        count--;
        if (finalSum - (count - 1) * count <= 2 * (count - 1)) {
            count--;
        }
        for (long i = 1; i < count; i++) {
            res.add(2 * i);
        }
        res.add(finalSum - (count - 1) * count);
        return res;
    }

    public static List<Long> maximumEvenSplitPlus(long finalSum) {
        List<Long> res = new ArrayList<>();
        if (finalSum % 2 > 0){
            return res;
        }
        for (long i = 2; i <= finalSum; i += 2) {
            res.add(i);
            finalSum -=i;
        }
        res.set(res.size() - 1, res.get(res.size() - 1) + finalSum);
        return res;
    }
}
