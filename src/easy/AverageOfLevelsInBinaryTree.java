package easy;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Given a non-empty binary tree, return the average value of the nodes on each level in the form of an array.
 * Example 1:
 * Input:
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * Output: [3, 14.5, 11]
 * Explanation:
 * The average value of nodes on level 0 is 3,  on level 1 is 14.5, and on level 2 is 11. Hence return [3, 14.5, 11].
 *
 * Note:
 * The range of node's value is in the range of 32-bit signed integer.
 *
 * 解决思路:
 * 两个Map， 一个统计该层的和，另一个统计该层的节点数
 * 最后通过两个Map求节点的平均数
 * 注意值范围溢出与Map中的排序
 *
 * Created by second on 2017/9/28.
 */
public class AverageOfLevelsInBinaryTree {

    Map<Integer, Long> map = new TreeMap<>();

    Map<Integer, Double> nodeNum = new TreeMap<>();

    int layer = 0;

    public List<Double> averageOfLevels(TreeNode root) {
        count(root);
        List<Double> list = new LinkedList<>();
        map.forEach((key, value) -> list.add(value / nodeNum.get(key)));
        return list;
    }

    public void count(TreeNode root){
        if(root == null) return;
        layer++;
        map.put(layer, map.getOrDefault(layer, 0L) + root.val);
        nodeNum.put(layer, nodeNum.getOrDefault(layer, 0D) + 1);
        averageOfLevels(root.left);
        averageOfLevels(root.right);
        layer--;
    }

    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}
