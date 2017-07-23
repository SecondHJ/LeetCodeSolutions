package easy;

/**
 * Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.
 * You may assume the integer do not contain any leading zero, except the number 0 itself.
 * The digits are stored such that the most significant digit is at the head of the list.
 *
 * 解决思路:
 * 反向遍历数组依次进行加法的进位运算，如无进位则立即break循环
 * 如计算完成最后还有进位则拓展数组将1进位
 *
 * Created by second on 2017/7/23.
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {
        int into = 0;
        for (int i = digits.length - 1; i >= 0; i--){
            int sum = i == digits.length - 1 ? digits[i] + into + 1: digits[i] + into;
            if (sum >= 10){
                digits[i] = sum % 10;
                into = 1;
            }else{
                digits[i] = sum;
                into = 0;
                break;
            }
        }
        if (into == 1){
            int[] a = new int[digits.length + 1];
            a[0] = into;
            for(int i = 1; i < a.length; i++)
                a[i] = digits[i - 1];
            return a;
        }
        return digits;
    }

}
