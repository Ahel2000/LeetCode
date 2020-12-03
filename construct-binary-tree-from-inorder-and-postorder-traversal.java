/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(postorder.length==0)return null;
        TreeNode root=new TreeNode(postorder[postorder.length-1]);
        int index=0;
        for(int i=0;i<inorder.length;i++){
            if(root.val==inorder[i]){
                index=i;
                break;
            }
        }
        
        int []lin=Arrays.copyOfRange(inorder,0,index);
        int []rin=Arrays.copyOfRange(inorder,index+1,inorder.length);
        int []lpost=Arrays.copyOfRange(postorder,0,index);
        int []rpost=Arrays.copyOfRange(postorder,index,postorder.length-1);
        root.left=buildTree(lin,lpost);
        root.right=buildTree(rin,rpost);
        return root;
            
    }
}
