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
    public ListNode removeZeroSumSublists(ListNode head) {
        // The observation here is that the sum from index 0 to index M will be 
        // equal to sum from index 0 to index N if sum from index (M+1) to index N is 0.
        // Thus, here we track the sum from index 0 to each index, using a Map to indicate
        // the farthest index N that we can remove from index M, then we shall be able to
        // remove M+1 -> N and continue from N+1. This works since we don't have to optimize
        // for the number of sequences to be removed
        
        // Map from sum from index 0 to the farthest value that the sum stays unchanged.
        Map<Integer,ListNode> map=new HashMap<>();
        int prefix=0;
        ListNode start=new ListNode(0);
        start.next=head;
        map.put(0,start);
        for(ListNode i=start;i!=null;i=i.next){
            prefix+=i.val;
            map.put(prefix,i);
        }
        prefix=0;
        for(ListNode i=start;i!=null;i=i.next){
            prefix+=i.val;
            i.next=map.get(prefix).next;
        }
        return start.next;
    }
}
