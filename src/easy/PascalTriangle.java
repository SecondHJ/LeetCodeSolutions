package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Given numRows, generate the first numRows of Pascal's triangle.
 * For example, given numRows = 5,
 * Return
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 *
 * 解决思路:
 * 除左右两边始终为1以外，数组中的每个数是上面一排数的当前位置与当前位置-1的数的和。
 * 内层循环根据该规则生成每行数组
 *
 * Created by second on 2017/7/17.
 */
public class PascalTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++){
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++){
                if (j == 0 || j == i) {   //三角两边始终为1
                    row.add(1);
                    continue;
                }
                if (i != 0) {    //非第一行
                    List<Integer> up = result.get(i - 1);
                    row.add(up.get(j) + up.get(j - 1));
                }
            }
            result.add(row);
        }
        return result;
    }

}
