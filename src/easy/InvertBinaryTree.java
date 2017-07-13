package easy;

/**
 * Invert a binary tree.
 *
 * Trivia:
 * This problem was inspired by this original tweet by Max Howell:
 * Google: 90% of our engineers use the software you wrote (Homebrew),
 * but you can’t invert a binary tree on a whiteboard so fuck off.
 *
 * .....LOL
 *
 * 解决思路:
 * 直接DFS递归置换两个子节点。。。
 *
 * Created by second on 2017/7/13.
 */
public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }

    public static void invert(TreeNode root){
        if (root == null || (root.left == null && root.right == null)) return;
        TreeNode t = root.left;
        root.left = root.right;
        root.right = t;
        invert(root.left);
        invert(root.right);
    }

    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
