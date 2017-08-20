package easy;

/**
 * Given an integer, write a function to determine if it is a power of three.
 * Follow up:
 * Could you do it without using any loop / recursion?
 *
 * 解决思路:
 * 最low解决办法。。 循环取模，再／3，判断最后是否等于3
 *
 * Created by second on 2017/8/20.
 */
public class PowerOfThree {

    public boolean isPowerOfThree(int n) {
        if (n == 1) return true;
        if (n < 3) return false;
        while(n > 3) {
            if (n % 3 != 0) return false;
            else n = n / 3;
        }
        return n == 3;
    }

}
