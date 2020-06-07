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
class Solution{
    public ListNode insertionSortList(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode prev,current,result=new ListNode(0);
        result.next=head;
        while(head!=null && head.next!=null){
            if(head.val<=head.next.val)
                head=head.next;
            else{
                current=head.next; //the node which is less than prev node 
                prev=result; //prev used to determine the position of the current node
                while(prev.next.val<current.val)
                    prev=prev.next;
                head.next=current.next;
                current.next=prev.next;
                prev.next=current;
            }
        }
        return result.next;
    }
}
