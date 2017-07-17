package easy;

/**
 * Given an array nums, write a function to move all 0's to the end of it
 * while maintaining the relative order of the non-zero elements.
 * For example,
 * given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
 * Note:
 * 1.You must do this in-place without making a copy of the array.
 * 2.Minimize the total number of operations.
 *
 * 解决思路:
 * 冒泡。
 *
 * Created by second on 2017/7/17.
 */
public class MoveZeroes {

    public static void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++){
            for (int j = 0; j < nums.length - 1 -i; j++) {
                if (nums[j] == 0) {
                    int t = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = t;
                }
            }
        }
    }

}
