package easy;

/**
 * Reverse digits of an integer.
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 *
 * Note:
 * The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer overflows.
 *
 * Created by second on 2017/7/13.
 */
public class ReverseInteger {

    public int reverse(int x) {
        boolean boo = x >= 0;
        x = Math.abs(x);
        long a = 0;
        while (x > 0){
            int t = x;
            x = x / 10 * 10;
            a += t - x;
            a = a * 10;
            x = x / 10;
        }
        a = a / 10;
        int result = (int) a;
        if (result != a) return 0;
        return boo ? result : -result;
    }

}
