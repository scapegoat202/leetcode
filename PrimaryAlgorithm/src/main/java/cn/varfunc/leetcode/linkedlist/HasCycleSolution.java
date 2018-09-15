package cn.varfunc.leetcode.linkedlist;

public class HasCycleSolution {
    public boolean hasCycle(ListNode head) {
//        if (head == null) {
//            return false;
//        }
//
//        ListNode fast = head;
//        ListNode slow = head;
//        int count = 0;
//
//        while (fast != null && slow != null) {
//            count++;
//            fast = fast.next;
//            if (count % 2 == 0) {
//                slow = slow.next;
//            }
//
//            if (fast == slow) {
//                return true;
//            }
//        }
//        return false;

        if (head == null || head.next == null) {
            return false;
        }

        ListNode fast = head;
        ListNode slow = head;

        while (slow.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}
