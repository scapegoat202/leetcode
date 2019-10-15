package cn.varfunc.leetcode.tree;

import java.util.*;

public class IsValidBSTSolution {
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }

        // 记录当前节点的父节点
        Deque<TreeNode> stack = new LinkedList<>();
        // 记录访问过的节点
        List<TreeNode> visitedNode = new LinkedList<>();
        // 记录当前节点是处在某一祖先节点的左子树还是右子树上，true表示在左子树上，false表示处在右子树上
        Map<TreeNode, Boolean> map = new TreeMap<>(Comparator.comparingInt(o -> o.val));

        stack.push(root);

        while (!stack.isEmpty()) {
            final TreeNode current = stack.peek();

            final TreeNode left = current.left;
            if (left != null && !visitedNode.contains(left)) {
                map.put(current, true);
                for (TreeNode treeNode : stack) {
                    // 当前节点处在祖先节点的左子树上，需小于祖先节点的值
                    if (map.get(treeNode) && left.val >= treeNode.val) {
                        return false;
                    }

                    // 当前节点处在祖先节点的右子树上，需大于祖先节点的值
                    if (!map.get(treeNode) && left.val <= treeNode.val) {
                        return false;
                    }
                }
                stack.push(current.left);
                continue;
            }

            final TreeNode right = current.right;
            if (right != null && !visitedNode.contains(right)) {
                map.put(current, false);
                for (TreeNode treeNode : stack) {
                    if (map.get(treeNode) && right.val >= treeNode.val) {
                        return false;
                    }

                    if (!map.get(treeNode) && right.val <= treeNode.val) {
                        return false;
                    }
                }
                stack.push(right);
                continue;
            }

            stack.pop();
            visitedNode.add(current);
        }
        return true;
    }

    /**
     * 中序遍历任意二叉搜索树，得到的一定是递增序列
     * 非递归实现
     */
    public boolean isValidBST2(TreeNode root) {
        if (root == null) {
            return true;
        }

        TreeNode pre = null;
        TreeNode current = root;

        Deque<TreeNode> stack = new LinkedList<>();

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();

            if (pre != null && pre.val >= current.val) {
                return false;
            }

            pre = current;
            current = current.right;

        }
        return true;
    }

}
