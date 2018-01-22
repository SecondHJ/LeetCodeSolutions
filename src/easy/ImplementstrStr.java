package easy;

/**
 * Implement strStr().
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 * Example 1:
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 *
 * Example 2:
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1
 *
 * 解决思路：
 * 遍历，截取，对比
 *
 * Created by second on 2018/1/20.
 */
public class ImplementstrStr {

    public int strStr(String haystack, String needle) {
        if (haystack.equals(needle) || needle.length() == 0) return 0;
        for (int i = 0; i <= haystack.length() - needle.length(); i++){
            if (haystack.charAt(i) == needle.charAt(0)){
                String str = haystack.substring(i, i + needle.length());
                if (str.equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }

}
