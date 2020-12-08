/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;
​
    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }
​
    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/
​
class Solution {
    public Node connect(Node root) {
        if(root==null)return root;
        helper(root.left,root.right);
        return root;
    }
    
    public void helper(Node root1,Node root2){
        if(root1==null || root2==null)return;
        root1.next=root2;
        helper(root1.left,root1.right);
        helper(root1.right,root2.left);
        helper(root2.left,root2.right);
    }
}
