package easy;

/**
 * Write a function that takes a string as input and returns the string reversed.
 * Example:
 * Given s = "hello", return "olleh".
 *
 * 解决思路:
 * 拆分为char数组, 在循环遍历里对称置换
 *
 * Created by huajun on 17-8-7.
 */
public class ReverseString {

    public String reverseString(String s) {
        char[] a = new char[s.length()];
        s.getChars(0, s.length(), a, 0);
        for (int i = 0; i < a.length / 2; i++){
            char tmp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = tmp;
        }
        return new String(a);
    }

}
