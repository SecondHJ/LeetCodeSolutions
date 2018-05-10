package easy;

/**
 * You are given a license key represented as a string S which consists only alphanumeric character and dashes. The string is separated
 * into N+1 groups by N dashes.
 *
 * Given a number K, we would want to reformat the strings such that each group contains exactly K characters, except for the first group
 * which could be shorter than K, but still must contain at least one character. Furthermore, there must be a dash inserted between two
 * groups and all lowercase letters should be converted to uppercase.
 *
 * Given a non-empty string S and a number K, format the string according to the rules described above.
 *
 * Example 1:
 * Input: S = "5F3Z-2e-9-w", K = 4
 * Output: "5F3Z-2E9W"
 * Explanation: The string S has been split into two parts, each part has 4 characters. Note that the two extra dashes are not needed and can be removed.
 *
 * Example 2:
 * Input: S = "2-5g-3-J", K = 2
 * Output: "2-5G-3J"
 * Explanation: The string S has been split into three parts, each part has 2 characters except the first part as it could be shorter as mentioned above.
 *
 * Note:
 * 1.The length of string S will not exceed 12,000, and K is a positive integer.
 * 2.String S consists only of alphanumerical characters (a-z and/or A-Z and/or 0-9) and dashes(-).
 * 3.String S is non-empty.
 *
 * 解决思路:
 * 反向循环字符串，忽略"-"号.
 * 添加计数变量，注意计数达到K值需补"-"并重置计数
 * 追加循环的字符的大写字母到返回字符串
 * 最后翻转拼装的字符串
 *
 * Created by second on 2018/5/10.
 */
public class LicenseKeyFormatting {

    public String licenseKeyFormatting(String S, int K) {
        StringBuilder result = new StringBuilder();
        String s[] = S.split("");
        int count = 0;
        for (int i = s.length - 1; i >= 0; i--){
            if (s[i].equals("-")) continue;
            if (count == K){
                result.append("-");
                count = 0;
            }
            result.append(s[i].toUpperCase());
            count++;
        }
        return result.reverse().toString();
    }

}
