// Last updated: 8/21/2026, 11:55:14 AM
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> arr = new ArrayList<>();
        if(root == null) {
            return arr;
        }
        q.offer(root);
        while(!q.isEmpty()) {
            int size = q.size();
            List<Integer> l = new ArrayList<>();
            for(int i = 0; i < size; i++) {
                TreeNode t = q.poll();
                l.add(t.val);
                if(t.left != null) {
                    q.offer(t.left);
                }
                if(t.right != null) {
                    q.offer(t.right);
                }
            }
            arr.add(l);
        }
        return arr;
    }
}