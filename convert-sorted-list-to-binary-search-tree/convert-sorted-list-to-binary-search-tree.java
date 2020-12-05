/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> l=new ArrayList<>();
        while(head!=null){
            l.add(head.val);
            head=head.next;
        }
        int []a=new int[l.size()];
        for(int i=0;i<l.size();i++)a[i]=l.get(i);
        return findTree(a,0,a.length-1);
    }
    
    public TreeNode findTree(int[] a,int p,int q){
        if(p<q){
            int mid=(p+q)/2;
            TreeNode root=new TreeNode(a[mid]);
            root.left=findTree(a,p,mid-1);
            root.right=findTree(a,mid+1,q);
            return root;
        }
        return p==q?new TreeNode(a[p]):null;
    }
}
