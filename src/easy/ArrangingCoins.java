package easy;

/**
 * You have a total of n coins that you want to form in a staircase shape, where every k-th row must have exactly k coins.
 * Given n, find the total number of full staircase rows that can be formed.
 * n is a non-negative integer and fits within the range of a 32-bit signed integer.
 *
 * Example 1:
 * n = 5
 * The coins can form the following rows:
 * ¤
 * ¤ ¤
 * ¤ ¤
 * Because the 3rd row is incomplete, we return 2.
 *
 * Example 2:
 * n = 8
 * The coins can form the following rows:
 * ¤
 * ¤ ¤
 * ¤ ¤ ¤
 * ¤ ¤
 * Because the 4th row is incomplete, we return 3.
 *
 * 解决思路:
 * 循环计数阶级减，返回时判断最后一级是否满足
 *
 * Created by second on 2017/9/21.
 */
public class ArrangingCoins {

    public int arrangeCoins(int n) {
        int arrange = 0;
        while (n > 0){
            n -= arrange + 1;
            arrange++;
        }
        return n < 0 ? arrange - 1 : arrange;
    }

}
