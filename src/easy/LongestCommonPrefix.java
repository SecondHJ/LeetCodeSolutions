package easy;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * 解决思路:
 * 不断遍历给定String数组, 设置一个index下标每次循环完index递增
 * 每次遍历比较当前位字符, 如有不同返回0-前一位下标的子串
 *
 * Created by huajun on 17-8-8.
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String s = "";
        int index = 0;
        while (true) {
            for (int i = 0; i < strs.length; i++) {
                if (strs[i].length() < index + 1) return strs[i];
                String t = strs[i].substring(index, index + 1);
                if (i == 0) s = t;
                if (!t.equals(s)) return strs[i].substring(0, index);
            }
            index++;
        }
    }

}
