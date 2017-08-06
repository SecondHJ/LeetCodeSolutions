package easy;

/**
 * Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
 * Example:
 * Given a = 1 and b = 2, return 3.
 *
 * 解决思路:
 * 不用"+"和"-"进行加法运算
 * 将传入a和b两个十进制转为二进制
 * 如长度不同则将长度较短二进制数前面补0
 * 补0后依次对两个数的当前位与进位进行异或运算，拼接到返回值，并判断是否进位
 * 最后reverse返回值并返回
 *
 * Created by second on 2017/8/6.
 */
public class SumOfTwoIntegers {

    public int getSum(int a, int b) {
        StringBuilder result = new StringBuilder();
        String[] n = Integer.toBinaryString(a).split("");
        String[] m = Integer.toBinaryString(b).split("");
        //补0 (补0后n和m等长)
        int length = m.length > n.length ? m.length : n.length;
        if (n.length != m.length) {
            String[] tmp = new String[length];
            int i = 0;
            for (;i < Math.abs(n.length - m.length); i++) tmp[i] ="0";
            for (int j = 0;i < length; j++) {
                tmp[i] = m.length < n.length ? m[j] : n[j];
                i++;
            }
            if (m.length < n.length) m = tmp;
            else n = tmp;
        }
        //运算
        int into  = 0;
        for (int i = length - 1; i >= 0; i--){
            int x = Integer.parseInt(n[i]);
            int y = Integer.parseInt(m[i]);
            result.append(x ^ y ^ into);
            if ((x == 1 && y == 1) || (x == 1 && into == 1) || (y == 1 && into == 1)) into = 1;
            if (x == 0 && y == 0) into = 0;
        }
        if (into == 1) result.append(1);
        String s = result.reverse().toString();
        return (int) Long.parseLong(s, 2);
    }

}
