// Last updated: 8/18/2026, 9:44:37 AM
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
    public void flatten(TreeNode root) {
        LinkedList<Integer> list = new LinkedList<>();
        preorder(root, list);
        TreeNode current = root;
        for (int i = 1; i < list.size(); i++) {
            TreeNode node = new TreeNode(list.get(i));
            current.right = node;
            current.left = null;
            current = current.right;
        }
    }
    void preorder(TreeNode root, LinkedList<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        preorder(root.left, list);
        preorder(root.right, list);
    }
}