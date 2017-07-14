package easy;

/**
 * Given a binary tree and a sum,determine if the tree has a root-to-leaf path such that
 * adding up all the values along the path equals the given sum.
 *
 * For example:
 * Given the below binary tree and sum = 22,
 *      5
 *     /  \
 *    4   8
 *   /   / \
 *  11  13  4
 *  /   \   \
 * 7    2    1
 * return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
 *
 * 解决思路:
 * DFS解决方法
 * 在每次递归(下跳)时在sum上减去结点的值
 * 判断如果是最后一个结点切sum刚好等于0说明sum值路径存在
 * 如遇最后一个结点但sum不等于0，则将结点减去的值加回去并返回false
 * 最后分别递归调用判断左结点和右结点
 * 返回 left || right
 *
 * Created by second on 2017/7/14.
 */
public class PathSum {

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        sum -= root.val;
        if (root.left == null && root.right == null && sum == 0) return true;
        if (root.left == null && root.right == null && sum != 0){
            sum += root.val;
            return false;
        }
        boolean left = false, right = false;
        if (root.left != null) left = hasPathSum(root.left, sum);
        if (root.right != null) right = hasPathSum(root.right, sum);
        return left || right;
    }

    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
