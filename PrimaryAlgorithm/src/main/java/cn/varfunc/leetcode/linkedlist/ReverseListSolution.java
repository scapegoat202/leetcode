package cn.varfunc.leetcode.linkedlist;

public class ReverseListSolution {
    public ListNode reverseList(ListNode head) {
        ListNode node = head;
        ListNode newHead = null;
        ListNode preNode;
        while (node != null) {
            preNode = newHead;
            newHead = new ListNode(node.val);
            newHead.next = preNode;

            node = node.next;
        }
        return newHead;
    }
}
