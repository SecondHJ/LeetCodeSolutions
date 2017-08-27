package easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of integers and an integer k,
 * find out whether there are two distinct indices i and j in the array
 * such that nums[i] = nums[j] and the absolute difference between i and j is at most k.
 *
 * 解决思路:
 * 遍历数组将元素存入Set集合
 * 判断总Set内元素个数是否大于k，如已大于k将数组最前面存入Set的元素移除
 * 利用Set集合在存入的返回时判断是否已存在
 *
 * Created by second on 2017/8/26.
 */
public class ContainsDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(i > k) set.remove(nums[i - k - 1]);
            if(!set.add(nums[i])) return true;
        }
        return false;
    }

}
