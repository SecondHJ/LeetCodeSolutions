package medium;

/**
 * Created by second on 2017/10/18.
 */
public class ReverseLinkedListII {

    int index = 0;

    ListNode left;

    ListNode right;

    ListNode fuck;

    public ListNode reverseBetween(ListNode head, int m, int n) {
        index++;
        if (head == null || head.next == null) return head;
        if (index == m - 1) left = head;
        if (index == n){
            right = head;
            fuck = head.next;
        }
        reverseBetween(head.next, m, n);
        index--;
        if (index > m && index < n) {
            if (index == n - 1 && left != null) {
                left.next = head.next;
            }
            head.next.next = head;
            head.next = null;
        }
        if (index == m){
            head.next.next = head;
            head.next = fuck;
        }
        if (index == m - 1) {
            head.next = right;
        }
        return head;
    }

    // left.next = 4
    // 1 -> 2 -> 3 <- 4 -> 5

    private class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public void test(){
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);
        ListNode boo = reverseBetween(node, 1,2);
        while (boo != null){
            System.out.println(boo.val);
            boo = boo.next;
        }

    }

    public static void main(String[] args) {
        ReverseLinkedListII list = new ReverseLinkedListII();
        list.test();
    }
}
