package easy;

/**
 * Given an array of integers, every element appears twice except for one. Find that single one.
 *
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Created by second on 2017/7/13.
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {
        int bar = 0;
        loop:
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums.length; j++)
                if (j != i && nums[i] == nums[j]) continue loop;
            bar = nums[i];
            break;
        }
        return bar;
    }

}
