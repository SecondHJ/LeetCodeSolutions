package easy;


import java.util.HashSet;
import java.util.Set;

/**
 * Given a Binary Search Tree and a target number, return true if there exist two elements in the BST such that their sum is equal to the given target.
 *
 * Example 1:
 * Input:
 *     5
 *    / \
 *   3   6
 *  / \   \
 * 2   4   7
 * Target = 9
 * Output: True
 *
 * Example 2:
 * Input:
 *     5
 *    / \
 *   3   6
 *  / \   \
 * 2   4   7
 * Target = 28
 * Output: False
 *
 * 解决思路:
 * DFS，HashSet
 * 判断Set中是否存在k与每个结点值的差，存在返回true，不存在则加入结点继续搜索
 *
 * Created by second on 2017/10/4.
 */
public class TwoSumIV {

    Set<Integer> set = new HashSet<>();

    public boolean findTarget(TreeNode root, int k) {
        if (root == null) return false;
        if (set.contains(k - root.val)) return true;
        else set.add(root.val);
        return findTarget(root.left, k) || findTarget(root.right, k);
    }

    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}
