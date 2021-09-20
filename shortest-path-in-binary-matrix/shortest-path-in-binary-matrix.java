class Solution {
    public int dx[] = {1,0,0,-1,1,-1,-1,1};
    public int dy[] = {0,1,-1,0,1,-1,1,-1};
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        PriorityQueue<Node> q = new PriorityQueue<>((a,b) -> a.dist - b.dist);
        if(grid[0][0] == 1)return -1;
        q.add(new Node(0,0,1));
        
        int visited[][] = new int[n][n];
        
        while(!q.isEmpty()){
            int size = q.size();
            while(size-- > 0){
                Node temp = q.poll();
                int x = temp.x;
                int y = temp.y;
                
                if(x == n - 1 && y == n -1 && grid[x][y] == 0)return temp.dist;
                
                
                for(int i=0;i<8;i++){
                    int newx = x + dx[i];
                    int newy = y + dy[i];
                    
                    if(isValid(newx,newy,n) && grid[newx][newy] == 0){
                        if(visited[newx][newy] == 1)continue;
                        q.add(new Node(newx,newy,temp.dist + 1));
                        visited[newx][newy] = 1;
                    }
                }
            }
        }
        
        return -1;
    }
    
    public boolean isValid(int x,int y,int n){
        if(x < 0 || y < 0 || x >= n || y >= n)return false;
        return true;
    }
    
    public class Node{
        public int x;
        public int y;
        public int dist;
        
        public Node(int x,int y,int dist){
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }
}