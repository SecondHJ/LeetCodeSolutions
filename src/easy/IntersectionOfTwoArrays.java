package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Given two arrays, write a function to compute their intersection.
 * Example:
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
 * Note:
 * Each element in the result must be unique.
 * The result can be in any order.
 *
 * 解决思路:
 * 嵌套循环对比, 判断是否已存在在返回list中, 加入返回list
 *
 * Created by huajun on 17-8-11.
 */
public class IntersectionOfTwoArrays {

    public static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++){
            if (list.contains(nums1[i])) continue;
            for (int j = 0; j < nums2.length; j++) if (nums1[i] == nums2[j] && !list.contains(nums2[j])) list.add(nums1[i]);
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) result[i] = list.get(i);
        return result;
    }

}
