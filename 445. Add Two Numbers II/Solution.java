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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res=new ListNode();
        ListNode n1=reverse(l1);
        ListNode n2=reverse(l2);
        int carry=0;
        ListNode temp=n1,pre=n1;
        while(n1!=null || n2!=null || carry!=0){
            int a=n1==null?0:n1.val, b=n2==null?0:n2.val;
            if(n1==null){
                n1=new ListNode((a+b+carry)%10);
                pre.next=n1; // to connect to previos value when n2 not null or there is carry left
            }else{
                n1.val=(a+b+carry)%10;
            }
            carry=(a+b+carry)/10;
            pre=n1;//connecting next value to previous
            if(n1!=null)n1=n1.next;
            if(n2!=null)n2=n2.next;
        }
        temp=reverse(temp);
        return temp;
    }
    public ListNode reverse(ListNode head){
        ListNode prev=null, current=head,next=null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }
}
