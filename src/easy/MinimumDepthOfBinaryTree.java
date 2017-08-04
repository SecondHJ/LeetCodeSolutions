package easy;

/**
 * Given a binary tree, find its minimum depth.
 * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 *
 * 解决思路:
 * DFS解决方式
 * 设置root为空为边界, 返回0
 * 递归调用传入left和right节点
 * 判断左右节点是否其中一个已到边界,
 * 如果两个子节点其中一个已到边界则返回两个节点深度的和+1,
 * 如果都没到边界则将返回计数以最短那个为基础递增
 *
 * Created by second on 2017/7/25.
 */
public class MinimumDepthOfBinaryTree {

    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        return (left == 0 || right == 0) ? left + right + 1 : Math.min(left, right) + 1;
    }

    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
