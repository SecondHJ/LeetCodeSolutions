package easy;

/**
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.
 * For example:
 *  1 -> A
 *  2 -> B
 *  3 -> C
 *  ...
 *  26 -> Z
 *  27 -> AA
 *  28 -> AB
 *
 * 解决思路:
 * 递归 n／26 , n %= 26
 * 被整除是特殊情况
 *
 * Created by second on 2017/10/2
 */
public class ExcelSheetColumnTitle {

    public String convertToTitle(int n) {
        String str = "";
        if (n > 26){
            if (n % 26 == 0){
                if (n / 26 - 1 > 26)
                    str += convertToTitle(n / 26 - 1);
                else
                    str += (char) ('A' + (n / 26 - 1) - 1);
                n = 26;
            }else{
                if (n / 26 > 26)
                    str += convertToTitle(n / 26);
                else
                    str += (char)('A' + n / 26 - 1);
                n %= 26;
            }
            str += convertToTitle(n);
        }else {
            str += (char) ('A' + n - 1);
        }
        return str;
    }

}
