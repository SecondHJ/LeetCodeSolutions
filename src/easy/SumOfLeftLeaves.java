package easy;

import javax.swing.tree.TreeNode;

/**
 * Find the sum of all left leaves in a given binary tree.
 * Example:
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.
 *
 * 解决思路:
 *  DFS递归
 * 判断是否是叶子节点(最终节点)与是否是左边的叶子节点，如是返回节点值，否则返回0
 *
 * Created by huajun on 17-8-16.
 */
public class SumOfLeftLeaves {

    public int sumOfLeftLeaves(TreeNode root) {
        return sum(root, false);
    }

    public int sum(TreeNode root, boolean isLeft){
        if (root == null) return 0;
        int sum = root.left == null && root.right == null && isLeft ? root.val : 0;
        int left = sum(root.left, true);
        int right = sum(root.right, false);
        return left + right + sum;
    }

    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
