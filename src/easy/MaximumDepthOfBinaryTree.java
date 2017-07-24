package easy;

/**
 * Given a binary tree, find its maximum depth.
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 *
 * 解决思路:
 * 递归调用每次传入深度记录depth
 * 如果结点以为空则返回depth
 * 递归调用传入left和right返回最深的那个
 *
 * Created by second on 2017/7/24.
 */
public class MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        return countDepth(root, 0);
    }

    public int countDepth(TreeNode root, int depth){
        if (root == null) return depth;
        int leftdepth = countDepth(root.left, depth + 1);
        int rightdepth = countDepth(root.right, depth + 1);
        return leftdepth > rightdepth ? leftdepth : rightdepth;
    }

    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}
