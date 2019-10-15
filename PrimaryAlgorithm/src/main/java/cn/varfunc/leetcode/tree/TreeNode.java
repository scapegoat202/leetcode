package cn.varfunc.leetcode.tree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    private TreeNode(int val) {
        this.val = val;
    }

    public static TreeNode parse(Integer... arr) {
        int length = arr.length;
        if (length == 0) {
            return null;
        }

        TreeNode[] nodes = new TreeNode[length];

        TreeNode root = new TreeNode(arr[0]);
        nodes[0] = root;

        Deque<Integer> stack = new LinkedList<>();
        stack.push(0);

        List<Integer> visitedIndex = new LinkedList<>();

        while (!stack.isEmpty()) {
            final int current = stack.peek();
            final int left = current * 2 + 1;
            final int right = current * 2 + 2;

            if (left < length && !visitedIndex.contains(left)) {
                stack.push(left);
                nodes[left] = arr[left] == null ? null : new TreeNode(arr[left]);
                nodes[current].left = nodes[left];
                continue;
            }

            if (right < length && !visitedIndex.contains(right)) {
                stack.push(right);
                nodes[right] = arr[right] == null ? null : new TreeNode(arr[right]);
                nodes[current].right = nodes[right];
                continue;
            }

            visitedIndex.add(current);
            stack.pop();
        }
        return root;
    }
}
