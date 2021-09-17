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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null)return res;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        int parity = 0;
        
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> t = new ArrayList<>();
            
            for(int i=0;i<size;i++){
                TreeNode temp = q.poll();
                if(temp.left != null)q.add(temp.left);
                if(temp.right != null)q.add(temp.right);
                t.add(temp.val);
            }
            
            if(parity == 0)res.add(t);
            else{
                Collections.reverse(t);
                res.add(t);
            }
            
            parity = 1 - parity;
        }
        
        return res;
    }
}