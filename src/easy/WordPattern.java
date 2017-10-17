package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a pattern and a string str, find if str follows the same pattern.
 * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.
 * Examples:
 * 1. pattern = "abba", str = "dog cat cat dog" should return true.
 * 2. pattern = "abba", str = "dog cat cat fish" should return false.
 * 3. pattern = "aaaa", str = "dog cat cat dog" should return false.
 * 4. pattern = "abba", str = "dog dog dog dog" should return false.
 * Note:
 * You may assume pattern contains only lowercase letters, and str contains lowercase letters separated by a single space.
 *
 * 解决思路:
 * 用Map进行标记, 比对
 *
 * Created by second on 2017/10/17.
 */
public class WordPattern {

    public boolean wordPattern(String pattern, String str) {
        Map<String, String > map = new HashMap<>();
        String[] patterns = pattern.split("");
        String[] strs = str.split(" ");
        if (patterns.length != strs.length || "".equals(pattern)) return false;
        for (int i = 0; i < strs.length; i++){
            if (map.containsKey(patterns[i])){
                if (!strs[i].equals(map.get(patterns[i])))
                    return false;
            }else {
                if (map.containsValue(strs[i]))
                    return false;
                map.put(patterns[i], strs[i]);
            }
        }
        return true;
    }

}
