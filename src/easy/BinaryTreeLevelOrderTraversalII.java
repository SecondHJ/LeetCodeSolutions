package easy;

import java.util.*;

/**
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its bottom-up level order traversal as:
 * [
 *   [15,7],
 *   [9,20],
 *   [3]
 * ]
 *
 * 解决思路:
 * DFS并使用TreeMap对每层数字统计
 * 注意需从下往上反序输入（而TreeMap默认是升序排序），所以层数也应为负数(从下至上由小到大)
 *
 * Created by second on 2017/9/29.
 */
public class BinaryTreeLevelOrderTraversalII {

    Map<Integer, List<Integer>> map = new TreeMap<>();

    int layer = 0;

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        count(root);
        List<List<Integer>> list = new ArrayList<>();
        map.forEach((key, value) -> list.add(value));
        return list;
    }

    public void count(TreeNode root){
        if (root == null) return;
        layer--;
        List<Integer> list = map.get(layer) == null ? new ArrayList<>() : map.get(layer);
        list.add(root.val);
        map.put(layer, list);
        count(root.left);
        count(root.right);
        layer++;
    }

    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}
