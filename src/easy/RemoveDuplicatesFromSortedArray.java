package easy;

import java.util.Arrays;

/**
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * For example,
 * Given input array nums = [1,1,2],
 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
 * It doesn't matter what you leave beyond the new length.
 *
 * 解决思路:
 * 定义两个指针i, j
 * 因为数组已经有序
 * 遍历数组，当nums[i]不等于nums[j]时, 说明nums[i]无重复，此时i的计数+1
 * 当i和j处于不同位置时，必须令nums[i] = nums[j]，让nums[i]记下j当前的数字，然后j++继续后移和nums[i]比较
 * 最后返回i的计数+1即为不重复数组的长度
 *
 * Created by second on 2017/7/22.
 */
public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++){
            if (nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
            System.out.println(Arrays.toString(nums));
        }
        return i + 1;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 1, 2, 3, 4, 4, 4, 5, 6}));
    }
}
