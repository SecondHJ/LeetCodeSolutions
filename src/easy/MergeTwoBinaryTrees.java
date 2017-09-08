package easy;

/**
 * Given two binary trees and imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while
 * the others are not.
 * You need to merge them into a new binary tree. The merge rule is that if two nodes overlap, then sum node values up as the new value
 * of the merged node. Otherwise, the NOT null node will be used as the node of new tree.
 *
 * Example 1:
 * Input:
 * 	        Tree 1                     Tree 2
 * 	          1                         2
 *          / \                       / \
 *         3   2                     1   3
 *        /                           \   \
 *       5                             4   7
 * Output:
 * Merged tree:
 * 	     3
 * 	    / \
 * 	   4   5
 * 	  / \   \
 * 	 5   4   7
 *
 * 解决思路:
 * 二叉树合并，经典DFS问题
 * 边界检查为都等于空 返回空， 其中一方为空 返回另一边
 * 让左边的值等于左边加右边
 * 递归调用， 返回左边
 *
 * Created by second on 2017/9/8.
 */
public class MergeTwoBinaryTrees {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return null;
        if (t1 == null) return t2;
        if (t2 == null) return t1;
        t1.val += t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}
