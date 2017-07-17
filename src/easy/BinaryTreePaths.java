package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a binary tree, return all root-to-leaf paths.
 * For example, given the following binary tree:
 *
 *      1
 *   /   \
 *  2     3
 *   \
 *    5
 *
 * All root-to-leaf paths are:
 * ["1->2->5", "1->3"]
 *
 * 解决思路:
 * DFS
 * 每次递归在前一次基础上拼接结点值
 *
 * Created by second on 2017/7/17.
 */
public class BinaryTreePaths {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        path(root, "", list);
        return list;
    }

    public void path(TreeNode root, String s, List<String> list){
        if (root == null) return;
        if (root.left == null && root.right == null){
            list.add(s + root.val);
            return;
        }
        s += root.val + "->";
        path(root.left, s, list);
        path(root.right, s, list);
    }

    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}


