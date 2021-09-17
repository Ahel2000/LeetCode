class Solution {
    int dx[] = {1,0,-1,0};
    int dy[] = {0,1,0,-1};
    public int minimumEffortPath(int[][] heights) {
        int m = heights.length,n = heights[0].length;
        int ans = Integer.MAX_VALUE;
        
        PriorityQueue<Node> q = new PriorityQueue<>((a,b) -> a.val - b.val);
        q.add(new Node(0,0,0));
        
        int visited[][] = new int[m][n];
        
        while(!q.isEmpty()){
            Node temp = q.poll();
            int x = temp.x;
            int y = temp.y;
            visited[x][y] = 1;
            
            if(x == m - 1 && y == n - 1)return temp.val;
            
            for(int i=0;i<4;i++){
                int newx = x + dx[i];
                int newy = y + dy[i];
                
                if(isSafe(x,y,i,m,n)){
                    if(visited[newx][newy] == 1)continue;
                    int newEff = Math.max(temp.val, 
                                        Math.abs(heights[x][y] - heights[newx][newy]));
                    q.add(new Node(newx,newy,newEff));
                }
            }
        }
        
        return 0;
    }
    
    public boolean isSafe(int x,int y,int i,int m,int n){
        int a = x + dx[i];
        int b = y + dy[i];
        if(a < 0 || b < 0 || a >= m || b >= n)return false;
        
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