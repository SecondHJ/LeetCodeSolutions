package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an index k, return the kth row of the Pascal's triangle.
 * For example, given k = 3,
 * Return [1,3,3,1].
 * Note:
 * Could you optimize your algorithm to use only O(k) extra space?
 *
 * 解决思路:
 * 在答案中看到的O(k)解决法
 * 思路为一个List两层循环
 * 外层执行行数+1次，内层每次让当前数等于前一次循环的当前和前一个数的和
 *
 * Created by second on 2017/8/30.
 */
public class PascalsTriangleII {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        for(int i = 0;i < rowIndex + 1;i++) {
            res.add(1);
            for(int j = i - 1; j > 0; j--) {
                res.set(j, res.get(j - 1) + res.get(j));
            }
        }
        return res;
    }

}
