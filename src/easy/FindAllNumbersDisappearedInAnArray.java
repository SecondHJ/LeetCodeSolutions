package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
 * Find all the elements of [1, n] inclusive that do not appear in this array.
 * Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
 *
 * Example:
 * Input:
 * [4,3,2,7,8,2,3,1]
 * Output:
 * [5,6]
 *
 * 解决思路:
 * 循环标记数字对应对数组下标的数字为负
 * 如某个下标对应数字非负，则该下标对应数字不存在
 * 参考 https://discuss.leetcode.com/topic/65738/java-accepted-simple-solution
 *
 * Created by second on 2017/10/8.
 */
public class FindAllNumbersDisappearedInAnArray {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            int val = Math.abs(nums[i]) - 1;
            if (nums[val] > 0){
                nums[val] = -nums[val];
            }
        }
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > 0){
                list.add(i + 1);
            }
        }
        return list;
    }

}
