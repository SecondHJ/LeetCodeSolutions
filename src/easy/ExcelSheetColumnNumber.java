package easy;

/**
 * Related to question Excel Sheet Column Title
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 *
 * For example:
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 *
 * 解决思路
 * 从右往左依次累计当前数 * 进位
 *
 * Created by second on 2017/9/30.
 */
public class ExcelSheetColumnNumber {

    public int titleToNumber(String s) {
        char[] words = s.toCharArray();
        int count = 1;
        int result = 0;
        for (int i = words.length - 1; i >= 0; i--){
            result += count * (words[i] - 64);
            count *= 26;
        }
        return result;
    }

}
