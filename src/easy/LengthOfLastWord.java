package easy;

/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ',
 * return the length of last word in the string. If the last word does not exist, return 0.
 * Note:
 * A word is defined as a character sequence consists of non-space characters only.
 * For example,
 * Given s = "Hello World",
 * return 5.
 *
 * 解决思路:
 * 判断参数非空非" "
 * split参数判断长度是否为0
 * 如不为0返回spilt后String数组的最后一位长度
 *
 * Created by second on 2017/7/15.
 */
public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        if (s == null) return 0;
        String[] strs = s.split(" ");
        if (strs.length == 0) return 0;
        return strs[strs.length - 1].length();
    }

}
