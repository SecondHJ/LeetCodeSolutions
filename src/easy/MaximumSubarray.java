package easy;

/**
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
 *
 * For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
 * the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 *
 * 解决思路:
 * 设置一个record记录最大值（起始值必须为最小）
 * 设置sum，嵌套循环遍历数组，每次在sum基础上加当前数，如果超过record则刷新record
 *
 * Created by second on 2017/7/23.
 */
public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        int largest = -2147483647;
        int sum = 0;
        for (int i = 0; i < nums.length; i++){
            for (int j = i; j < nums.length; j++){
                sum += nums[j];
                largest = sum > largest ? sum : largest;
            }
            sum = 0;
        }
        return largest;
    }

}
