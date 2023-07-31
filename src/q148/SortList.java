package q148;

import node.ListNode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortList {
    public static void main(String[] args) {

    }

    public ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode node = head;
        List<Integer> list = new ArrayList<>();
        while (node != null) {
            list.add(node.val);
            node = node.next;
        }
        list.sort(Comparator.naturalOrder());
        ListNode h = new ListNode(list.get(0)), index = h;
        for (int i = 1; i < list.size(); i++) {
            ListNode tmp = new ListNode(list.get(i));
            index.next = tmp;
            index = tmp;
        }
        index.next = null;
        return h;
    }
}
