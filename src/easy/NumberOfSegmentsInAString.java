package easy;

/**
 * Count the number of segments in a string, where a segment is defined to be a contiguous sequence of non-space characters.
 * Please note that the string does not contain any non-printable characters.
 * Example:
 * Input: "Hello, my name is John"
 * Output: 5
 *
 * 解决思路:
 * 声名一个int计数和一个boo布尔标记
 * 遍历字符串
 * 当如遇到非空格且boo为true时将计数自增并将boo标记为false
 * 如再次遇到空时将boo标记为true
 *
 * Created by second on 2017/9/4.
 */
public class NumberOfSegmentsInAString {

    public int countSegments(String s) {
        char[] chars = new char[s.length()];
        s.getChars(0, s.length(), chars, 0);
        int count = 0;
        boolean boo = true;
        for (char c: chars){
            if (c != ' ' && boo){
                boo = false;
                count++;
            }
            if (c == ' '){
                boo = true;
            }
        }
        return count;
    }

}
