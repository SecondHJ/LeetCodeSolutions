package easy;

/**
 * Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the Hamming weight).
 * For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011, so the function should return 3.
 *
 * 解决思路:
 * 调API...统计
 *
 * Created by second on 2017/9/28.
 */
public class NumberOf1Bits {

    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String[] numbers = Integer.toBinaryString(n).split("");
        int count = 0;
        for(String num: numbers){
            if ("1".equals(num)) count++;
        }
        return count;
    }

}
