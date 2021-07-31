/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null)return null;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Queue<Node> temp = new LinkedList<>();
            while(!queue.isEmpty()){
                Node x = queue.poll();
                Node y = queue.peek();
                if(x.left != null)temp.add(x.left);
                if(x.right != null)temp.add(x.right);
                x.next = y;
            }
            
            queue = temp;
        }
        
        return root;
    }
}