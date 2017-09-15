package easy;

/**
 * Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle, which means it moves back
 * to the original place.
 * The move sequence is represented by a string. And each move is represent by a character. The valid robot moves are R (Right), L
 * (Left), U (Up) and D (down). The output should be true or false representing whether the robot makes a circle.
 *
 * Example 1:
 * Input: "UD"
 * Output: true
 *
 * Example 2:
 * Input: "LL"
 * Output: false
 *
 * 解决思路:
 * 要回到原点
 * 往左走了多远，相应的往右就要走多远
 * 往上走了多远，相应的往下就要走多远
 * 所以设置上下和左右两个计数
 * 如果最后都归零了的话，它就回到了原点
 *
 * Created by second on 2017/9/15.
 */
public class JudgeRouteCircle {

    public boolean judgeCircle(String moves) {
        int ud = 0;
        int lr = 0;
        for (int i = 0; i < moves.length(); i++){
            if (moves.charAt(i) == 'U') ud++;
            else if (moves.charAt(i) == 'D') ud--;
            else if (moves.charAt(i) == 'L') lr++;
            else lr--;
        }
        return ud == 0 && lr == 0;
    }

}
