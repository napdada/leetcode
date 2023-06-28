package q1721;

import node.ListNode;

public class SwapNodes {
    public static void main(String[] args) {

    }

    public ListNode swapNodes(ListNode head, int k) {
        ListNode left = head;
        ListNode right = head;
        for (int i = 1; i < k; i++) {
            left = left.next;
        }
        ListNode cur = left;
        while (cur.next != null) {
            right = right.next;
            cur = cur.next;
        }
        int m = right.val;
        right.val = left.val;
        left.val = m;
        return head;
    }
}
