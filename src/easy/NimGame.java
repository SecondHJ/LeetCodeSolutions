package easy;

/**
 * You are playing the following Nim Game with your friend:
 * There is a heap of stones on the table, each time one of you take turns to remove 1 to 3 stones.
 * The one who removes the last stone will be the winner. You will take the first turn to remove the stones.
 * Both of you are very clever and have optimal strategies for the game.
 * Write a function to determine whether you can win the game given the number of stones in the heap.
 *
 * For example, if there are 4 stones in the heap, then you will never win the game: no matter 1, 2, or 3 stones you remove,
 * the last stone will always be removed by your friend.
 *
 * 解决思路:
 * 如事例所说，如果桌上有4个石头先手必输那么只要石头是4的倍数先手必输 (因为后手可以永远将剩余石头维持在4的倍数)
 * 判断n是否为4的倍数并且是否小于4
 *
 * Created by second on 2017/7/19.
 */
public class NimGame {

    public boolean canWinNim(int n) {
        return n < 4 || !(n % 4 == 0);
    }

}
