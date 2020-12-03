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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0)return null;
        TreeNode root=new TreeNode(preorder[0]);
        int index=0;
        for(int i=0;i<inorder.length;i++){
            if(root.val==inorder[i]){
                index=i;
                break;
            }
        }
            
        int []lpre=Arrays.copyOfRange(preorder,1,index+1);
        int []rpre=Arrays.copyOfRange(preorder,index+1,preorder.length);
        int []lin=Arrays.copyOfRange(inorder,0,index);
        int []rin=Arrays.copyOfRange(inorder,index+1,inorder.length);
        root.left=buildTree(lpre,lin);
        root.right=buildTree(rpre,rin);
        return root;
        
    }
}
