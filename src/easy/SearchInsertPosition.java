package easy;

/**
 * Given a sorted array and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 * You may assume no duplicates in the array.
 * Here are few examples.
 * [1,3,5,6], 5 → 2
 * [1,3,5,6], 2 → 1
 * [1,3,5,6], 7 → 4
 * [1,3,5,6], 0 → 0
 *
 * 解决思路:
 * 如数组无重复，则插入下标等于第一次出现比target大的数的下标
 * 如没有比target大的数，则返回最后一位的下标+1（等于数组的长度）
 *
 *
 * Created by second on 2017/7/17.
 */
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == target || nums[i] > target) return i;
        return nums.length;
    }

}
