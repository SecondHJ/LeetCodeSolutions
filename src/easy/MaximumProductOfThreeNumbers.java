package easy;

import java.util.Arrays;

/**
 * Given an integer array, find three numbers whose product is maximum and output the maximum product.
 *
 * Example 1:
 * Input: [1,2,3]
 * Output: 6
 *
 * Example 2:
 * Input: [1,2,3,4]
 * Output: 24
 *
 * 解决思路:
 * 排序大法，注意可能有负数的情况，如果前两个为负数可构成一个最大的正数
 *
 * Created by second on 2017/9/5.
 */
public class MaximumProductOfThreeNumbers {

    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        return Math.max(nums[0] * nums[1] * nums[nums.length - 1], nums[length - 3] * nums[length - 2] * nums[length - 1]);
    }

}
