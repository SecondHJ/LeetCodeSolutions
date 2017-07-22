package easy;

/**
 * Write a program to check whether a given number is an ugly number.
 * Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.
 * For example, 6, 8 are ugly while 14 is not ugly since it includes another prime factor 7.
 * Note that 1 is typically treated as an ugly number.
 *
 * 解决思路:
 * 轮流除以因数2，3，5
 * 无法除尽后余1说明所有因子都是2，3，5则是ugly number
 *
 * Created by second on 2017/7/22.
 */
public class UglyNumber {

    public boolean isUgly(int num) {
        while (true){
            if (num % 2 == 0) num /= 2;
            else if (num % 3 == 0) num /= 3;
            else if (num % 5 == 0) num /= 5;
            else break;
        }
        return num == 1;
    }

}
