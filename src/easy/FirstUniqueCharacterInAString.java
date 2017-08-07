package easy;

/**
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 * Examples:
 * s = "leetcode"
 * return 0.
 * s = "loveleetcode",
 * return 2.
 * Note: You may assume the string contain only lowercase letters.
 *
 * 解决思路:
 * 嵌套循环搜索
 * 如遇重复则continue外层
 * 若整个循环搜索结束没有重复则直接返回外层循环下标
 *
 * Created by huajun on 17-8-7.
 */
public class FirstUniqueCharacterInAString {


    public int firstUniqChar(String s) {
        char[] a = new char[s.length()];
        s.getChars(0, s.length() , a, 0);
        loop:
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a.length; j++){
                if (a[i] == a[j] && i != j) continue loop;
            }
            return i;
        }
        return -1;
    }

}
