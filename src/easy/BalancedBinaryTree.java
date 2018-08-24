package easy;

/**
 * Given a binary tree, determine if it is height-balanced.
 * For this problem, a height-balanced binary tree is defined as:
 *
 * `` a binary tree in which the depth of the two subtrees of every node never differ by more than 1. ``
 *
 * 解决思路:
 * 两层DFS （一层遍历树，一层遍历左右子树的最深层数）
 *
 */
public class BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int left = search(root.left, 0);
        int right = search(root.right, 0);
        if (Math.abs(left - right) > 1){
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    private int search(TreeNode node, int count){
        if (node == null){
            return count;
        }
        return Math.max(search(node.left, count + 1), search(node.right, count + 1));
    }


    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}
