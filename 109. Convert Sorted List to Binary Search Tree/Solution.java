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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> values=new ArrayList<Integer>();
    private void array(ListNode head){
        while(head!=null){
            values.add(head.val);
            head=head.next;
        }
    }
    public TreeNode sortedListToBST(ListNode head) {
        array(head);
        return fn(0,values.size()-1);
    }
    private TreeNode fn(int left,int right){
        if(left>right)return null;
        int m=left+(right-left)/2;
        TreeNode node=new TreeNode(values.get(m));
        if(left==right)return node;
        node.left=fn(left,m-1);
        node.right=fn(m+1,right);
        return node;
    }
}
