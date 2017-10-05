package easy;

/**
 * We are playing the Guess Game. The game is as follows:
 * I pick a number from 1 to n. You have to guess which number I picked.
 * Every time you guess wrong, I'll tell you whether the number is higher or lower.
 * You call a pre-defined API guess(int num) which returns 3 possible results (-1, 1, or 0):
 *
 * -1 : My number is lower
 *  1 : My number is higher
 *  0 : Congrats! You got it!
 *
 * Example:
 * n = 10, I pick 6.
 * Return 6.
 *
 * 解决思路:
 * 二分搜索，注意这题描述有问题
 * -1 : My number is lower
 * 这里的"My"指的是调用guessNumber方法给定的数字"n"
 *
 * Created by second on 2017/10/5.
 */
public class GuessNumberHigherOrLower {

    int pick;

    /**guess方法比较的为guessNumber的传入参数n*/
    int n;

    public int guessNumber(int n) {
        int min = 1, max = n;
        while(min < max){
            int mid = min + (max - min) / 2;
            int result = guess(mid);
            if(result == 1){
                min = mid + 1;
            }
            else if (result == -1){
                max = mid - 1;
            }
            else{
                return mid;
            }
        }
        return min;
    }

    private int guess(int n){
        if (n > pick) return 1;
        else if (n < pick) return -1;
        else return 0;
    }

}
