/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        if(fast == null || fast.next == null) return null;

        while(fast != null){
            slow = slow.next;
            if(fast.next == null) return null;
            fast = fast.next.next;
            if(fast == slow) break;
        }

        ListNode temp = head;
        while(temp != null){
            if(slow == temp) return temp;
            if(slow.next == null) return null;
            slow = slow.next;
            temp = temp.next;
        }
        return null;
    }
}