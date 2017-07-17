package easy;

/**
 * Determine whether an integer is a palindrome. Do this without extra space.
 *
 * 解决思路:
 * 运用StringBuffer类型的reverse方法翻转字符串（或自写翻转方法），判断翻转后是否是其本身
 * Created by second on 2017/7/17.
 */
public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        String num = String.valueOf(x);
        return new StringBuffer(num).reverse().toString().equals(num);
    }

}
