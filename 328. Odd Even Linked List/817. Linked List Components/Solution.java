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
    public int numComponents(ListNode head, int[] G) {
        Set<Integer> set=new HashSet<>();
        for(int x: G)set.add(x);
        int res=0;
        ListNode temp=head;
        while(temp!=null){
            if(set.contains(temp.val)&&(temp.next==null || !set.contains(temp.next.val)))
                res++;
            temp=temp.next;
        }
        return res;
    }
}
