package medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.
 *
 * For example:
 * Given the below binary tree and sum = 22,
 *               5
 *              / \
 *             4   8
 *            /   / \
 *           11  13  4
 *          /  \    / \
 *         7    2  5   1
 * return
 * [
 *    [5,4,11,2],
 *    [5,8,4,5]
 * ]
 *
 * 解决思路:
 * DFS解决 参考PathSumI
 * 在每个节点上用sum减去节点值，并将当前节点加入list
 * 如果最后在叶子节点上，sum等于0则刚好root-to-leaf的和为sum，将当前list加入result
 * 在返回时用节点值加回sum的值，把当前节点从list移除，继续DFS遍历
 *
 * Created by second on 2017/10/11.
 */
public class PathSumII {

    List<List<Integer>> result = new ArrayList<>();

    List<Integer> list = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root == null) return result;
        sum -= root.val;
        list.add(root.val);
        if (root.left == null && root.right == null){
            if (sum == 0) result.add(new ArrayList<>(list));
            list.remove(list.size() - 1);
            sum += root.val;
            return result;
        }
        if (root.left != null) pathSum(root.left, sum);
        if (root.right != null) pathSum(root.right, sum);
        list.remove(list.size() - 1);
        sum += root.val;
        return result;
    }

    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
