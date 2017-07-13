package easy;

/**
 * Given an array of integers, every element appears twice except for one. Find that single one.
 *
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * 解决思路:
 * 嵌套循环检查当前下标值是否在整个数组其他地方出现过,
 * 若再次出现continue外层循环继续搜索下一个数, 若未再次出现直接返回这个数
 *
 * Created by second on 2017/7/13.
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {
        loop:
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums.length; j++)
                if (j != i && nums[i] == nums[j]) continue loop;
            return nums[i];
        }
        return 0;
    }

}
