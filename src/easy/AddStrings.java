package easy;

/**
 * Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.
 * Note:
 * 1. The length of both num1 and num2 is < 5100.
 * 2. Both num1 and num2 contains only digits 0-9.
 * 3. Both num1 and num2 does not contain any leading zero.
 * 4. You must not use any built-in BigInteger library or convert the inputs to integer directly.
 *
 * 解决思路:
 * 设置加法位和进位位
 * 对num1和num2进行十进制的加法位运算
 * 拼接到返回String并在最后反转
 *
 * Created by second on 2017/7/19.
 */
public class AddStrings {

    public String addStrings(String num1, String num2) {
        // fix zero
        int zero = num1.length() - num2.length();
        String z = "";
        for (int i = 0; i < Math.abs(zero); i++) z += "0";
        if (zero > 0) num2 = z + num2;
        else num1 = z + num1;
        // plus
        StringBuilder sb = new StringBuilder();
        int into = 0;
        while (num1.length() != 0 && num2.length() != 0) {
            int a = Integer.parseInt(num1.substring(num1.length() - 1));
            int b = Integer.parseInt(num2.substring(num1.length() - 1));
            int num;
            if (a + b + into > 9) {
                num = (a + b + into) % 10;
                into = 1;
            }else {
                num = a + b + into;
                into = 0;
            }
            num1 = num1.substring(0, num1.length() - 1);
            num2 = num2.substring(0, num2.length() - 1);
            sb.append(num);
        }
        if (into != 0) sb.append(into);
        return sb.reverse().toString();
    }

}
