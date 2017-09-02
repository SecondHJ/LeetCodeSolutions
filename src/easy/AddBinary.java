package easy;

/**
 * Given two binary strings, return their sum (also a binary string).
 * For example,
 * a = "11"
 * b = "1"
 * Return "100".
 *
 * 解决思路:
 * 二进制加法
 *
 * Created by second on 2017/9/2.
 */
public class AddBinary {

    public String addBinary(String a, String b) {
        // fix zero
        int length = a.length() > b.length() ? a.length() : b.length();
        char[] ac = new char[a.length()];
        char[] bc = new char[b.length()];
        a.getChars(0, a.length(), ac, 0);
        b.getChars(0, b.length(), bc, 0);
        char[] charsA = fixZero(ac, length);
        char[] charsB = fixZero(bc, length);
        // plus
        StringBuilder result = new StringBuilder();
        int into = 0;
        for (int i = length - 1; i >= 0; i--){
            int ai = Integer.parseInt(String.valueOf(charsA[i]));
            int bi = Integer.parseInt(String.valueOf(charsB[i]));
            int sum = ai + bi + into;
            if (sum == 3){
                result.append(1);
                into = 1;
            }
            if (sum == 2){
                result.append(0);
                into = 1;
            }
            if (sum == 1){
                result.append(1);
                into = 0;
            }
            if (sum == 0){
                result.append(0);
                into = 0;
            }
        }
        if (into == 1) result.append(1);
        return result.reverse().toString();
    }

    private char[] fixZero(char[] c, int length){
        if (c.length >= length) return c;
        char[] result = new char[length];
        for (int i = 0; i < length; i++){
            if (i < length - c.length) result[i] = '0';
            else result[i] = c[i - (length - c.length)];
        }
        return result;
    }

}
