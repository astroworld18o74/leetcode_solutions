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
        //if(head==null || head.next==null)return null;
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                ListNode slow1=head;
                while(slow1!=slow){
                    slow1=slow1.next;
                    slow=slow.next;
                }
                return slow;
            }
        }
        return null;
    }
}
