package medium;

import java.util.LinkedList;
import java.util.List;

/**
 * Reverse a linked list from position m to n. Do it in-place and in one-pass.
 *
 * For example:
 *      Given 1->2->3->4->5->NULL, m = 2 and n = 4,
 *      return 1->4->3->2->5->NULL.
 * Note:
 *      Given m, n satisfy the following condition:
 *      1 ≤ m ≤ n ≤ length of list.
 *
 * 解决思路:
 * step 1
 *     将需要被反转的一节链表加入一个单独的list
 * step 2
 *     遍历原链表并反向组合list
 *
 * Created by second on 2017/11/18.
 */
public class ReverseLinkedListII {

    public ListNode reverseBetween(ListNode head, int m, int n) {
        List<Integer> list = new LinkedList<>();
        // step 1
        int index = 1;
        ListNode node = head;
        while (node != null && index <= n){
            if (index >= m) {
                list.add(node.val);
            }
            index++;
            node = node.next;
        }
        // step 2
        node = head;
        index = 1;
        int count = 1;
        while (node != null && index <= n){
            if (index >= m) {
                node.val = list.get(list.size() - count);
                count++;
            }
            index++;
            node = node.next;
        }
        return head;
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
