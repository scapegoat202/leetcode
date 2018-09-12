package cn.varfunc.leetcode.linkedlist;

/**
 * 合并两个有序链表
 * <p>
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的
 */
public class MergeTwoListsSolution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        } else if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }

        if (l1.val > l2.val) {
            ListNode t = l1;
            l1 = l2;
            l2 = t;
        }

        ListNode newHead = l1;
        ListNode node = newHead;
        ListNode node1 = l1.next;
        ListNode node2 = l2;

        while (node1 != null || node2 != null) {
            if (node1 != null && node2 != null) {
                if (node1.val == node2.val) {
                    node.next = node1;
                    node1 = node1.next;

                    node = node.next;
                    node.next = node2;
                    node2 = node2.next;

                    node = node.next;
                } else if (node1.val > node2.val) {
                    node.next = node2;
                    node = node.next;
                    node2 = node2.next;
                } else {
                    node.next = node1;
                    node = node.next;
                    node1 = node1.next;
                }
            } else if (node1 == null) {
                node.next = node2;
                break;
            } else {
                node.next = node1;
                break;
            }
        }

        return newHead;
    }
}
