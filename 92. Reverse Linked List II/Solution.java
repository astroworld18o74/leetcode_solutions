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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head==null)return null;
        ListNode prev=null,current=head;
        while(m-->1){
            prev=current;
            current=current.next;
            n--;
        }
        ListNode tail=current,con=prev;
        while(n-->0){
            ListNode next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        if(con!=null)
            con.next=prev;
        else
            head=prev;
        tail.next=current;
        return head;
    }
}
