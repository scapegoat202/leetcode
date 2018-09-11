package cn.varfunc.leetcode.linkedlist;

/**
 * 删除链表的倒数第N个节点
 * <p>
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点
 * <p>
 * 给定的 n 保证是有效的
 */
class RemoveNthFromEndSolution {
    public ListNode removeNthFromEndSolution(ListNode head, int n) {
        /* 两趟扫描 */
        if (head == null) {
            return null;
        } else {
            /* 第一趟扫描，计算数组长度 */
            ListNode node = head;
            int length = 0;
            while (node != null) {
                length++;
                node = node.next;
            }

            /* 第二趟，找出目标元素并删除 */
            if (length == 1) {
                return null;
            } else {
                int index = length - 1;
                ListNode preNode = null;
                node = head;
                int count = 0;
                while (node != null) {
                    if (index == count) {
                        if (node == head) {
                            return node.next;
                        } else {
                            preNode.next = node.next;
                            node.next = null;
                            return head;
                        }
                    }
                    count++;
                    preNode = node;
                    node = node.next;
                }
                return null;
            }
        }
    }
}

