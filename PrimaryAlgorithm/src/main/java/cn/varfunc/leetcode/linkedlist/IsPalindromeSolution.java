package cn.varfunc.leetcode.linkedlist;

import java.util.HashMap;
import java.util.Map;

/**
 * 回文链表
 * <p>
 * 请判断一个链表是否为回文链表
 */
public class IsPalindromeSolution {
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return false;
        }

        int length = 0;
        Map<Integer, ListNode> map = new HashMap<>();
        ListNode node = head;
        while (node != null) {
            map.put(length++, node);
            node = node.next;
        }

        for (int i = 0; i < length / 2; i++) {
            if (map.get(i).val != map.get(length - 1 - i).val) {
                return false;
            }
        }
        return true;
    }
}
