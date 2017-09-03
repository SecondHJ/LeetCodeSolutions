package easy;

/**
 * Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.
 * Note:
 * The given integer is guaranteed to fit within the range of a 32-bit signed integer.
 * You could assume no leading zero bit in the integer’s binary representation.
 * Example:
 * Input: 5 Output: 2
 * Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.
 *
 * 解决思路:
 * 直接翻转二进制
 * 没懂为啥直接翻转叫这个是 complement number 补码。。？
 *
 * Created by second on 2017/9/3.
 */
public class NumberComplement {

    public int findComplement(int num) {
        String a = Integer.toBinaryString(num);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length(); i++){
            if ('0' == a.charAt(i)) sb.append(1);
            if ('1' == a.charAt(i)) sb.append(0);
        }
        return Integer.parseInt(sb.toString(), 2);
    }

}
