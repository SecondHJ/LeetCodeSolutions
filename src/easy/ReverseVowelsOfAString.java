package easy;

/**
 * Write a function that takes a string as input and reverse only the vowels of a string.
 * Example 1:
 * Given s = "hello", return "holle".
 * Example 2:
 * Given s = "leetcode", return "leotcede".
 * Note: The vowels does not include the letter "y".
 *
 * 解决思路
 * 设置两个指针, 两个指针分别从前后两个方向循环搜索, 判断指针位置所在元素是否是元音字母
 * 如不是则指针后移, 继续循环
 * 如都是元音字母则置换两个位置元素, 并后移两个指针
 * 若两个指针相遇或交叉, 则停止搜索并返回
 *
 * Created by huajun on 17-8-10.
 */
public class ReverseVowelsOfAString {

    public String reverseVowels(String s) {
        if (s == null || "".equals(s)) return "";
        char[] chars = new char[s.length()];
        s.getChars(0, chars.length, chars, 0);
        int a = 0;
        int b = chars.length - 1;
        while (a <= b){
            if (!isVowel(chars[a])){
                a++; continue;
            }
            if (!isVowel(chars[b])){
                b--; continue;
            }
            char tmp = chars[a];
            chars[a] = chars[b];
            chars[b] = tmp;
            a++;
            b--;
        }
        return new String(chars);
    }

    public boolean isVowel(char a){
        return a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' ||
        a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U';
    }

}
