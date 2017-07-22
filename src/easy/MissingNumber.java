package easy;

/**
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
 * For example,
 * Given nums = [0, 1, 3] return 2.
 * Note:
 * Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
 *
 * 解决思路:
 * 由于给定数组是乱序，先将数组排序
 * 比较前后两数的差如果不为1则返回前一个数的值+1
 *
 * Created by second on 2017/7/22.
 */
public class MissingNumber {

    public int missingNumber(int[] nums) {
        sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] != 1){
                return nums[i - 1] + 1;
            }
        }
        return nums[0] == 0 ? nums[nums.length - 1] + 1 : 0;
    }

    public void sort(int[] a){
        int N = a.length;
        for (int i = 1; i < N; i++){
            for (int j = i; j > 0 && a[j] < a[j - 1]; j--){
                int t = a[j];
                a[j] = a[j - 1];
                a[j - 1] =t;
            }
        }
    }

}
