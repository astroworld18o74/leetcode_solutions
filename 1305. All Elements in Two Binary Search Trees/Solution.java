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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> result=new ArrayList<>();
        fn(result,root1);
        fn(result,root2);
        Collections.sort(result);
        return result;
        
    }
    public void fn(List<Integer> result,TreeNode node){
        if(node==null)return;
        result.add(node.val);
        fn(result,node.left);
        fn(result,node.right);
        return;
    }
}
