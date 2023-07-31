package q445;

import node.ListNode;

import java.util.Stack;

public class AddTwoNumbers {
    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>(), s2 = new Stack<>(), s3 = new Stack<>();
        ListNode node1 = l1, node2 = l2;
        while (node1 != null) {
            s1.push(node1.val);
            node1 = node1.next;
        }
        while (node2 != null) {
            s2.push(node2.val);
            node2 = node2.next;
        }

        ListNode res = s1.size() >= s2.size() ? l1 : l2, index = res;
        int num1, num2, flag = 0, sum;
        while (!s1.isEmpty() || !s2.isEmpty()) {
            num1 = s1.isEmpty() ? 0 : s1.pop();
            num2 = s2.isEmpty() ? 0 : s2.pop();
            sum = (num1 + num2 + flag) > 9 ? num1 + num2 + flag - 10 : num1 + num2 + flag;
            flag = (num1 + num2 + flag) > 9 ? 1 : 0;
            s3.push(sum);
        }

        if (flag == 1) {
            s3.push(1);
            ListNode fistNode = new ListNode();
            fistNode.val = s3.pop();
            fistNode.next = res;
            res = fistNode;
        }
        while (!s3.isEmpty()) {
            index.val = s3.pop();
            index = index.next;
        }
        return res;
    }
}
