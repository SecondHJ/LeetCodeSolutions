package easy;

/**
 * Remove all elements from a linked list of integers that have value val.
 * Example:
 * Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
 * Return: 1 --> 2 --> 3 --> 4 --> 5
 *
 * 解决思路:
 *
 * 解法1: 指针指向当前节点，删除当前节点: (优点:空间复杂度最低)
 * 删除节点使用 head.val = head.next.val; head.next = head.next.next; 的方式
 * 难点在于删除最后一个节点，因为最后一个节点后面没有可以置换的节点，
 * 且由于是单向链表，到最后一个节点时已经无法改变前一个节点的引用
 * 此时可以设置两个节点引用，一个指向当前节点head，一个指向当前节点的前一个不为val的节点prev
 * 当最后一个节点刚好等于val时，只需将另外一个prev节点的next指向null，即可以删除最后一个节点
 * 在节点后移时也需考虑到是否已经是最后一位(必须保留最后一位在方法结束时判断) 和 后移后的值是否还是val , 如果还是val则节点不后移继续遍历只让指针后移
 *
 * 解法2: 指针指向前一个节点，删除next节点 (优点: 执行效率高)
 * 在创建新的链表头并引用传入链表，使操作引用指向上一个节点，删除下一个节点:
 *
 * Created by huajun on 17-8-14.
 */
public class RemoveLinkedListElements {

    /** 解法1 */
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        ListNode result = head;
        ListNode prev = null;
        while (head.next != null){
            if (head.val == val){
                head.val = head.next.val;
                head.next = head.next.next;
            }
            if (head.val != val) prev = head;
            if (head.next != null && head.val != val) head = head.next;
        }
        if (head.val == val){
            if (prev == null) return null;
            else prev.next = null;
        }
        return result;
    }

    /** 解法2 */
    public ListNode removeElements2(ListNode head, int val) {
        ListNode node = new ListNode(0);
        node.next = head;
        ListNode result = node;
        while (node.next != null){
            if (node.next.val == val) node.next = node.next.next;
            else node = node.next;
        }
        return result.next;
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
