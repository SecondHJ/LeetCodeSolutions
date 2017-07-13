package easy;

/**
 * Given two binary trees, write a function to check if they are equal or not.
 * Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
 *
 * Created by second on 2017/7/13.
 */
public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null){
            return p == q;
        }
        if (p.val != q.val){
            return false;
        } else{
            boolean left = isSameTree(p.left, q.left);
            boolean right = isSameTree(p.right, q.right);
            if(!(left && right)) return false;
        }
        return true;
    }

    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
