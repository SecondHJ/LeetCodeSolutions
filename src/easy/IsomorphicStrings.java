package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given two strings s and t, determine if they are isomorphic.
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 * All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may
 * map to the same character but a character may map to itself.
 * For example,
 * Given "egg", "add", return true.
 * Given "foo", "bar", return false.
 * Given "paper", "title", return true.
 * Note:
 * You may assume both s and t have the same length.
 *
 * 解决思路:
 * 遍历字符串，通过map对出现字符计数，在按顺序存入计数List，最后对比两个字符串的字符计数List是否相同
 *
 * Created by second on 2017/9/13.
 */
public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        return charsCountingMap(s).equals(charsCountingMap(t));
    }

    public List<Integer> charsCountingMap(String str){
        Map<Character, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if (map.containsKey(c)) list.add(map.get(c));
            else map.put(c, ++count);
        }
        return list;
    }

}
