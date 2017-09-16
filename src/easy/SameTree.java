package easy;

/**
 * Given two binary trees, write a function to check if they are equal or not.
 * Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
 *
 * 解决思路:
 * 典型的DFS问题
 * 1. 检查p，q两树是否有一方为空，如有空则equals pq 并返回 (已遍历到最深)
 * 2. 检查p, q两树的值是否不同，如不同立即返回false
 * 3. 递归调用检查两个树的左边结点和右边结点，如其中一个为false立即返回false
 * 如整个DFS过程无false返回说明两树相等
 *
 * Created by second on 2017/7/13.
 */
public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) return p == q;
        if (p.val != q.val) return false;
        boolean left = isSameTree(p.left, q.left);
        boolean right = isSameTree(p.right, q.right);
        return left && right;
    }

    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
