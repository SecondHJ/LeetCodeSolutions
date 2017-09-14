package easy;

/**
 * Given a positive integer num, write a function which returns True if num is a perfect square else False.
 * Note: Do not use any built-in library function such as sqrt.
 * Example 1:
 * Input: 16
 * Returns: True
 * Example 2:
 * Input: 14
 * Returns: False
 *
 * 解决思路:
 * 验证是否是完全平方数
 * 完全平方数有一个规律是符合 1 + 3 + 5 + 7 ...
 * 也就是说
 * 1 = 1
 * 4 = 1 + 3
 * 9 = 1 + 3 + 5
 * 16 = 1 + 3 + 5 + 7
 * ....
 * 依此规律将传入数字依次相减，最后为0即为完全平方数
 *
 * Created by second on 2017/9/14.
 */
public class ValidPerfectSquare {

    public boolean isPerfectSquare(int num) {
        int i = 1;
        while (num > 0){
            num -= i;
            i += 2;
        }
        return num == 0;
    }
}
