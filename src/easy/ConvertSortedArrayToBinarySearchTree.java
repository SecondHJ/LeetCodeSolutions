package easy;

import java.util.Arrays;

/**
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 *
 * Example:
 * Given the sorted array: [-10,-3,0,5,9],
 * One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:
 *       0
 *      / \
 *    -3   9
 *    /   /
 *  -10  5
 *
 * 解决思路:
 * 二分
 *
 * Created by second on 2018/1/23.
 */
public class ConvertSortedArrayToBinarySearchTree {

    public TreeNode sortedArrayToBST(int[] nums) {
        return convert(nums, null);
    }

    private TreeNode convert(int[] nums, TreeNode node){
        if (nums.length == 0) return null;
        if (node == null) node = mid(nums);
        int[] left = Arrays.copyOfRange(nums, 0, nums.length / 2);
        int[] right = Arrays.copyOfRange(nums, nums.length / 2 + 1, nums.length);
        if (left.length > 0) node.left = mid(left);
        if (right.length > 0) node.right = mid(right);
        convert(left, node.left);
        convert(right, node.right);
        return node;
    }

    private TreeNode mid(int[] nums){
        return new TreeNode(nums[nums.length / 2]);
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}
