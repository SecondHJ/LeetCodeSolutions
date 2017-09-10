package easy;

/**
 * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than
 * index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution and you may not use the same element twice.
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 *
 * 解决思路:
 * 嵌套循环搜索
 * 类似TwoSumI，由于这次数组是有序的
 * 当内层循环的i,j和大于target时break循环
 * 当i与上一次相同时continue外层循环
 *
 * Created by second on 2017/9/10.
 */
public class TwoSumII {

    public int[] twoSum(int[] numbers, int target) {
        int last = 0;
        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] == last && i != 0) continue;
            last = numbers[i];
            for(int j = i + 1; j < numbers.length; j++){
                if((numbers[i] + numbers[j]) >  target) break;
                if((numbers[i] + numbers[j]) == target && i != j) return new int[]{++i, ++j};
            }
        }
        return null;
    }

}
