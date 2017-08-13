package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Given two arrays, write a function to compute their intersection.
 * Example:
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].
 * Note:
 * Each element in the result should appear as many times as it shows in both arrays.
 * The result can be in any order.
 *
 * 解决思路:
 * 将nums1放入一个临时list
 * 再遍历nums2如果有相等的就从临时List里面删除，再加入result中
 *
 * Created by second on 2017/8/13.
 */
public class IntersectionOfTwoArraysII {

    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> tmp = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for (int num: nums1){
            tmp.add(new Integer(num));
        }
        for (int num: nums2){
            if (tmp.contains(num)){
                list.add(num);
                tmp.remove(new Integer(num));
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) result[i] = list.get(i);
        return result;
    }

}
