package cn.varfunc.leetcode.linkedlist;

/**
 * 删除链表中的节点
 * <p>
 * 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点
 * <p>
 * 链表至少包含两个节点。
 * 链表中所有节点的值都是唯一的。
 * 给定的节点为非末尾节点并且一定是链表中的一个有效节点。
 * 不要从你的函数中返回任何结果。
 */
class DeleteNodeSolution {
    public void deleteNode(ListNode node) {
        ListNode nextNode = node.next;
        node.val = nextNode.val;
        node.next = nextNode.next;
    }
}

class ListNode {
    @SuppressWarnings("WeakerAccess")
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
