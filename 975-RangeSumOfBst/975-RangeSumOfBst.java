// Last updated: 8/1/2026, 4:45:57 PM
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
    public int rangeSumBST(TreeNode root, int low, int high) {
        ArrayList<Integer> arr=new ArrayList<>();
        bst(root,arr);
        int sum=0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)<=high && arr.get(i)>=low){
                sum+=arr.get(i);
            }
        }
        return sum;
    }
    void bst(TreeNode root,List<Integer> arr){
        if(root==null){
            return;
        }
        bst(root.left,arr);
        bst(root.right,arr);
        arr.add(root.val);
    }
}