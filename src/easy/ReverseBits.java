package easy;

/**
 * Reverse bits of a given 32 bits unsigned integer.
 * For example, given input 43261596 (represented in binary as 00000010100101000001111010011100), return 964176192 (represented
 * in binary as 00111001011110000010100101000000).
 * Follow up:
 * If this function is called many times, how would you optimize it?
 *
 * 解决思路:
 * 补0，翻转，注意翻转后可能为负
 *
 * Created by second on 2017/9/12.
 */
public class ReverseBits {

    public int reverseBits(int n) {
        String bits = Integer.toBinaryString(n);
        while (bits.length() < 32)
            bits = "0" + bits;
        return Long.valueOf(new StringBuilder(bits).reverse().toString(), 2).intValue();
    }

}
