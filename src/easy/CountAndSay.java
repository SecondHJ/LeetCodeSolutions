package easy;

/**
 * The count-and-say sequence is the sequence of integers with the first five terms as following:
 *
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 6.     312211
 *
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 *
 * Given an integer n, generate the nth term of the count-and-say sequence.
 * Note: Each term of the sequence of integers will be represented as a string.
 *
 * Example 1:
 * Input: 1
 * Output: "1"
 * Example 2:
 * Input: 4
 * Output: "1211"
 *
 * 解决思路:
 * 计数
 *
 * Created by second on 2017/9/28.
 */
public class CountAndSay {

    public String countAndSay(int n) {
        String str = "1";
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i < n; i++){
            int count = 0;
            char prev = str.charAt(0);
            for (int j = 0; j < str.length(); j++){
                if (prev != str.charAt(j)){
                    builder.append(count);
                    builder.append(prev);
                    count = 1;
                }else {
                    count++;
                }
                prev = str.charAt(j);
            }
            builder.append(count);
            builder.append(prev);
            str = builder.toString();
            builder.delete(0, builder.length());
        }
        return str;
    }


}
