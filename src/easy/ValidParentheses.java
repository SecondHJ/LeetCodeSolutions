package easy;

import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 * The brackets must close in the correct order,
 * "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 *
 * 解决思路:
 * 经典出入栈应用问题
 * 判断左右括号
 * 利用栈结构进行入栈和出栈对比
 *
 * Created by second on 2017/7/17.
 */
public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        boolean boo = true;
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            //左括号入栈
            if (isLeft(c)){
                stack.push(c);
            }else {
                //右括号出栈对比
                if (stack.isEmpty() || !match(stack.pop(), c)){
                    boo = false;
                }
            }
        }
        if (!stack.isEmpty()) return false; //遍历结束正确情况下栈应该为空
        return boo;
    }

    private boolean isLeft(char c){
        return '(' == c || '{' == c || '[' == c;
    }

    private boolean match(char a, char b){
        if (a == '(') return b == ')';
        if (a == '{') return b == '}';
        if (a == '[') return b == ']';
        return false;
    }

}
