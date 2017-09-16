package easy;

/**
 * Given two non-empty binary trees s and t, check whether tree t has exactly the same structure and node values with a subtree of s. A
 * subtree of s is a tree consists of a node in s and all of this node's descendants. The tree s could also be considered as a subtree of itself.
 *
 * Example 1:
 * Given tree s:
 *      3
 *     / \
 *    4   5
 *   / \
 *  1   2
 * Given tree t:
 *    4
 *   / \
 *  1   2
 * Return true, because t has the same structure and node values with a subtree of s.
 *
 * Example 2:
 * Given tree s:
 *      3
 *     / \
 *    4   5
 *   / \
 *  1   2
 *     /
 *    0
 * Given tree t:
 *    4
 *   / \
 *  1   2
 * Return false.
 *
 * 解决思路:
 * DFS tree s
 * 如果s == t 比较两树是否相同，相同返回true，不同继续往下搜索
 *
 * Created by second on 2017/9/16.
 */
public class SubtreeOfAnotherTree {

    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null) return false;
        if (s.val == t.val)
            if(compare(s, t))
                return true;
        boolean left = isSubtree(s.left, t);
        boolean right = isSubtree(s.right, t);
        return left || right;
    }

    public boolean compare(TreeNode s, TreeNode t){
        if (s == null || t == null) return s == t;
        if (s.val != t.val) return false;
        boolean left = compare(s.left, t.left);
        boolean right = compare(s.right, t.right);
        return left && right;
    }

    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
