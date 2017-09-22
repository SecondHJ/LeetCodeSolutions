package easy;

/**
 * Given a binary search tree with non-negative values, find the minimum absolute difference between values of any two nodes.
 *
 * Example:
 * Input:
 *    1
 *     \
 *      3
 *     /
 *    2
 * Output:
 * 1
 * Explanation:
 * The minimum absolute difference is 1, which is the difference between 2 and 1 (or between 2 and 3).
 * Note: There are at least two nodes in this BST.
 *
 * 解决思路:
 * 嵌套DFS搜索比较差的绝对值
 * 注意只和当前节点以下节点比较，当前节点与它之上的节点肯定已经被比较过了
 *
 * Created by second on 2017/9/22.
 */
public class MinimumAbsoluteDifferenceInBST {

    int min = Integer.MAX_VALUE;

    TreeNode currentNode;

    public int getMinimumDifference(TreeNode root) {
        if (root == null) return min;
        currentNode = root;
        search(root);
        getMinimumDifference(root.left);
        getMinimumDifference(root.right);
        return min;
    }

    private void search(TreeNode rootNode){
        if (rootNode == null) return;
        int diff = Math.abs(currentNode.val - rootNode.val);
        if (rootNode != currentNode && diff < min) min = diff;
        search(rootNode.left);
        search(rootNode.right);
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
