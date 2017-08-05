package easy;

/**
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 *
 * 解决思路:
 * 递归解决，边界为传入节点为null
 * 如果hean.next != null 且当前节点的值和下一个节点值相同的话，指针后移
 * 无重复继续递归
 *
 * Created by second on 2017/8/5.
 */
public class RemoveDuplicatesFromSortedList {

    public ListNode deleteDuplicates(ListNode head) {
       delete(head);
       return head;
    }

    public void delete(ListNode head){
        if (head == null) return;
        while (head.next != null && head.val == head.next.val){
            head.next = head.next.next;
        }
        delete(head.next);
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
