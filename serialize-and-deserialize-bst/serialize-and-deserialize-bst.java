/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder tree = new StringBuilder();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            TreeNode temp = q.poll();
            if(temp != null){
                q.add(temp.left);
                q.add(temp.right);
                
                tree.append(temp.val);
                tree.append(" ");
            }else{
                tree.append("null");
                tree.append(" ");
            }
        }
        
        return tree.toString().trim();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data == null)
            return null;
			
        String[] nodes = data.split(" ");    
        int i = 0;
        TreeNode root = toNode(nodes, i++);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(i < nodes.length){
            int size = q.size();
            while(i < nodes.length && size-- > 0){
                TreeNode node = q.poll();
                node.left = toNode(nodes, i++);
                node.right = toNode(nodes, i++);
            
                if(node.left != null) {
                    q.add(node.left);
                }
           
                if(node.right != null) {
                    q.add(node.right);
                } 

            }
            
        }
        
        return root;
    }
    
    private TreeNode toNode(String[] nodes, int index) {
        
        if(index >= nodes.length || "null".equals(nodes[index]))
            return null;
        
        return new TreeNode(Integer.parseInt(nodes[index]));
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;