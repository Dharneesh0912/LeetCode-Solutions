// Last updated: 7/14/2026, 2:14:06 PM
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
    public int countNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int count=0;
        while(!q.isEmpty()){
            TreeNode dummy=q.poll();
            count++;
            if(dummy.left!=null){
                q.offer(dummy.left);
            }
            if(dummy.right!=null){
                q.offer(dummy.right);
            }
        }
        return count;
    }
}