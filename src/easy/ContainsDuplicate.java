package easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of integers, find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice in the array,
 * and it should return false if every element is distinct.
 *
 * 解决思路:
 * Set去重，比较前后尺寸。。
 *
 * Created by second on 2017/7/13.
 */
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set set = new HashSet();
        for(int i : nums) set.add(i);
        return !(set.size() == nums.length);
    }

}
