package easy;

/**
 * Merge two sorted linked lists and return it as a new list.
 * The new list should be made by splicing together the nodes of the first two lists.
 *
 * Created by second on 2017/7/13.
 */
public class MergeTwoSortedLists {

    /******************************Solution1***************************************/
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode a, b;
        if(l1 == null && l2 == null) return null;
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode result = null;
        ListNode r = null;
        boolean boo = false;
        while(true){
            if(l1.val < l2.val){
                if(!boo){
                    result = l1;
                    r = result;
                    boo = true;
                }else{
                    result.next = l1;
                    result = result.next;
                }
                if(l1.next != null) l1 = l1.next;
                else {result.next = l2; return r;}
            }
            else{
                if(!boo){
                    result = l2;
                    r = result;
                    boo = true;
                }else{
                    result.next = l2;
                    result = result.next;
                }
                if(l2.next != null) l2 = l2.next;
                else {result.next = l1; return r;}
            }
        }
    }

    /******************************Solution2***************************************/
    public ListNode solution2(ListNode l1, ListNode l2) {
        ListNode l3 = null;
        l3 = getListNode(l1,l2,l3);
        return l3;
    }

    public ListNode getListNode(ListNode l1, ListNode l2,ListNode l3) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val>l2.val){
            l3=l2;
            l2=l2.next;
        }else {
            l3=l1;
            l1=l1.next;
        }
        l3.next=getListNode(l1,l2, l3.next);
        return l3;
    }

    private class ListNode{
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
