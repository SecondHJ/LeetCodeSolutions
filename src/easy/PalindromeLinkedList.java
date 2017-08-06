package easy;

import java.util.Stack;

/**
 * Given a singly linked list, determine if it is a palindrome.
 * Created by second on 2017/8/7.
 *
 * 解决思路:
 * 因为回文的正向顺序等于它的反向顺序
 * 可以利用栈结构将list循环入栈
 * 再出栈依次对比是否一致
 */
public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> stack = new Stack();
        ListNode p = head;
        while (head != null){
            stack.push(head);
            head = head.next;
        }
        while (p != null){
            if (p.val != stack.pop().val) return false;
            p = p.next;
        }
        return true;
    }

    private class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
