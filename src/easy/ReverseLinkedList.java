package easy;

/**
 * Reverse a singly linked list.
 *
 * 解决思路：
 * 边界设为当传入结点为null时(给定链表就为null)或结点的下一个结点为null(已为最后一个结点), 返回该结点(作为翻转后的头结点)
 * 递归调用使head.next.next = head(使当前结点的下一个结点引用当前结点)
 * 最后置当前结点的下一个结点的引用为null(当后面的都翻转完成时，最开始的那个结点的next会被置空，变为最尾结点)
 *
 * Created by second on 2017/8/3.
 */
public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode reversedHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return reversedHead;
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
