package easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a linked list, determine if it has a cycle in it.
 * Follow up:
 * Can you solve it without using extra space?
 *
 * 解决思路:
 *
 * 1) Solution1: 利用HashSet
 * 不断遍历链表
 * 将结点加入HashSet
 * 如果next为null则说明不是cycle，如果next已经在HashSet中存在，说明链表是一个cycle
 * 缺点: Node如果未实现equals和hashcode方法怎么玩？
 *
 * 2) Solution2: 利用两个速度不同(2:1)的指针
 * 思路: 想象两个不同速度的runner在同一个轨迹上赛跑，如果这个轨迹是一个圆，最后会发生什么？
 * 通过两个速度不同指针解决问题可以使空间复杂度为O(1), 无需多余空间
 * 慢速的指针一次后移一步， 快速的指针一次后移两步
 * 如两指针相遇(引用对象相同)，说明链表是一个是一个cycle， 如果其中一个指针下一步为null说明不是cycle
 *
 *
 * Created by second on 2017/7/22.
 */
public class LinkedListCycle {

    /**
     * Solution1
     * @param head
     * @return
     */
    public boolean hasCycle1(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null){
            if (set.contains(head)) return true;
            else set.add(head);
            head = head.next;
        }
        return false;
    }

    /**
     * Solution2
     * @param head
     * @return
     */
    public boolean hasCycle2(ListNode head){
        if (head == null || head.next == null) return false;
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast){
            if (fast == null || fast.next == null) return false;
            slow = slow.next;
            fast = fast.next.next;
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
