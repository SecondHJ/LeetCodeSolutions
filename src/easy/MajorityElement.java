package easy;

/**
 * Given an array of size n, find the majority element.
 * The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * You may assume that the array is non-empty and the majority element always exist in the array.
 *
 * 解题思路:
 * 最多的数 > 长度/2
 * 设置majority和count计数 每次遇到当前数count++， 如不是当前数count--,
 * 重要的是majority出现的次数 "大于" 长度/2， 最终majority的计数肯定大于0
 * 也就是最后剩下的数肯定是majority
 *
 * Created by second on 2017/7/26.
 */
public class MajorityElement {

    public int majorityElement(int[] nums) {
        int majority = nums[0], count = 1;
        for (int i = 1; i < nums.length; i++){
            if (count == 0){
                majority = nums[i];
                count++;
            }else if (nums[i] == majority){
                count++;
            }else {
                count--;
            }
        }
        return majority;
    }


}
