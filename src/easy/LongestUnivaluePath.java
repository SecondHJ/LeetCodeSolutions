package easy;

/**
 * Given a binary tree, find the length of the longest path where each node in the path has the same value.
 * This path may or may not pass through the root.
 * Note: The length of path between two nodes is represented by the number of edges between them.
 *
 * Example 1:
 * Input:
 *               5
 *              / \
 *             4   5
 *            / \   \
 *           1   1   5
 * Output:
 *          2
 *
 * Example 2:
 * Input:
 *               1
 *              / \
 *             4   5
 *            / \   \
 *           4   4   5
 * Output:
 *          2
 *
 * Note: The given binary tree has not more than 10000 nodes. The height of the tree is not more than 1000.
 *
 * 解决思路:
 * 注意 "path" 含义
 * DFS累计相同节点path
 * 左右相加是否超过Max, 返回左和右之中最长的路径
 *
 * Created by second on 2017/11/16.
 */
public class LongestUnivaluePath {

    int max;

    public int longestUnivaluePath(TreeNode root) {
        count(root);
        return max;
    }

    private int count(TreeNode root){
        if (root == null) return 0;
        int left = count(root.left);
        int right = count(root.right);
        if (root.left != null){
            if (root.val == root.left.val) left++;
            else left = 0;
        }
        if (root.right != null){
            if (root.val == root.right.val) right++;
            else right = 0;
        }
        if (left + right > max) max = left + right;
        return Math.max(left, right);
    }

    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}
