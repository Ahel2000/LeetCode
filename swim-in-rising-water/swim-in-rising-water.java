class Solution {
    int dx[] = {1,0,-1,0};
    int dy[] = {0,1,0,-1};
    public int swimInWater(int[][] grid) {
        int n = grid.length;
        
        int ans = 0;
        PriorityQueue<Node> q = new PriorityQueue<>((a,b) -> a.val - b.val);
        int visited[][] = new int[n][n];
        
        q.add(new Node(0,0,grid[0][0]));
        while(!q.isEmpty()){
            Node temp = q.poll();
            int x = temp.x;
            int y = temp.y;
            
            if(x == n-1 && y == n-1)return temp.val;
            visited[x][y] = 1;
            
            for(int j=0;j<4;j++){
                int newx = x + dx[j];
                int newy = y + dy[j];
                
                if(isSafe(newx,newy,n)){
                    if(visited[newx][newy] == 1)continue;
                    q.add(new Node(newx,newy,Math.max(temp.val,grid[newx][newy])));
                }
            }
        }
        
        return -1;
    }
    
    
    public boolean isSafe(int x,int y,int n){
        if(x < 0 || y < 0 || x >= n || y >= n)return false;
        return true;
    }
    
    public class Node{
        public int x;
        public int y;
        public int val;
        
        public Node(int x,int y,int val){
            this.x = x;
            this.y = y;
            this.val = val;
        }
    }
}