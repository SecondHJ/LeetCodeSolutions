package easy;

/**
 * Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.
 * Example:
 * Given nums = [-2, 0, 3, -5, 2, -1]
 * sumRange(0, 2) -> 1
 * sumRange(2, 5) -> -1
 * sumRange(0, 5) -> -3
 *
 * 解决思路:
 * 题意是通过构造函数给定nums，调用sumRange获取答案
 * 若是直接在sumRange中遍历计算结果会得到Time Limit Exceeded
 *
 * 所以可以在构造函数中对给定数组nums进行一些处理
 * 这里循环让 nums[i] += nums[i - 1]
 * 在sumRange计算的时候， 就可以用 nums[j] - nums[i - 1] 求出 i ~ j 的和
 * 参考 https://discuss.leetcode.com/topic/29194/java-simple-o-n-init-and-o-1-query-solution
 *
 * Created by second on 2017/11/17.
 */
public class NumArray {

    int[] nums;

    public NumArray(int[] nums) {
        for(int i = 1; i < nums.length; i++)
            nums[i] += nums[i - 1];
        this.nums = nums;
    }

    public int sumRange(int i, int j) {
        if(i == 0) return nums[j];
        return nums[j] - nums[i - 1];
    }

}
