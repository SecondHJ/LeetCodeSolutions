package easy;

/**
 * Given an array and a value, remove all instances of that value in place and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * Example:
 * Given input array nums = [3,2,2,3], val = 3
 * Your function should return length = 2, with the first two elements of nums being 2.
 *
 * 解决思路:
 * 单次循环无额外空间解决方式
 * 遍历数组，在循环内判断当前数字是否等于val, 若等于就将其与最后一位（length - count）做调换
 * 注意判断最后一位是否已经等于val 若等于将count递增并重复当次循环
 *
 * Created by second on 2017/7/18.
 */
public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int count = 1;
        for (int i = 0; i <= nums.length - count; i++){
            if (nums[nums.length - count] == val){
                i--;
                count++;
                continue;
            }
            if (nums[i] == val){
                int t = nums[i];
                nums[i] = nums[nums.length - count];
                nums[nums.length - count] = t;
                count++;
            }
        }
        return nums.length - count + 1;
    }

}
