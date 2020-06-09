/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if(head==null || head.next==null)return;
        // Find mid and divide in two halves
        ListNode slow=head,fast=head,prev=null,l1=head;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        
        // reverse second half
        ListNode prevv=null,current=slow,next=null;
        while(current!=null){
            next=current.next;
            current.next=prevv;
            prevv=current;
            current=next;
        }
        ListNode l2=prevv;
        
        // merge 1st half and 2nd half
        while(l1!=null){
            ListNode n1=l1.next, n2=l2.next;
            l1.next=l2;
            if(n1==null)return;
            l2.next=n1;
            l1=n1;
            l2=n2;
        }
    }
}
