package easy;

/**
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 * Given two integers x and y, calculate the Hamming distance.
 * Note:
 * 0 ≤ x, y < 231.
 * Example:
 * Input: x = 1, y = 4
 * Output: 2
 * Explanation:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 *        ?   ?
 * The above arrows point to positions where the corresponding bits are different.
 *
 * 解决思路:
 * 循环将十进制数转为二进制数
 * 每次取模后比较是否相同
 *
 * Created by second on 2017/7/22.
 */
public class HammingDistance {

    public int hammingDistance(int x, int y) {
        int count = 0;
        while(!(x == 0 && y == 0)){
            int a = x % 2;
            int b = y % 2;
            count = a != b ? count + 1 : count;
            x = x / 2;
            y = y / 2;
        }
        return count;
    }

}
