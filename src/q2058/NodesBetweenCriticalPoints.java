package q2058;

import node.ListNode;

public class NodesBetweenCriticalPoints {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] res = {-1, -1};
        if (head == null || head.next == null) {
            return res;
        }
        ListNode node = head.next, l = head, r = node.next;
        int index = 2, fistPoint = -1, lastPoint = -1, min = 100000;
        while (r != null) {
            if (node.val > l.val && node.val > r.val || node.val < l.val && node.val < r.val) {
                if (fistPoint == -1) {
                    fistPoint = index;
                } else {
                    min = Math.min(min, index - lastPoint);
                }
                lastPoint = index;
            }
            l = l.next;
            node = node.next;
            r = r.next;
            index++;
        }
        if (fistPoint != -1 && lastPoint != -1 && lastPoint != fistPoint) {
            res[0] = min;
            res[1] = lastPoint - fistPoint;
        }
        return res;
    }
}
