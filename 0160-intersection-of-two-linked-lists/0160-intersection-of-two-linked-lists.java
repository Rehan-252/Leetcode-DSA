/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode temp1 = headA;
        ListNode temp2 = headB;

        int m = 0;
        while(temp1 != null){
            m++;
            temp1 = temp1.next;
        }
        
        int n = 0;
        while(temp2 != null){
            n++;
            temp2 = temp2.next;
        }

        temp1 = headA;
        temp2 = headB;
        
        if(m > n){
            int stp = m - n;
            for(int i = 0; i < stp; i++){
                temp1 = temp1.next;
            }
        }
        else{
            int stp = n - m;
            for(int i = 0; i < stp; i++){
                temp2 = temp2.next;
            }
        }

        while(temp1!=temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return temp1;
    }
}