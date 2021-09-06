class Solution {
    public boolean containsCycle(char[][] grid) {
        int m = grid.length,n = grid[0].length;
        int visited[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(visited[i][j] == 0){
                    if(formsCycle(grid,visited,i,j,grid[i][j],0))return true;
                }
            }
        }
        
        return false;
    }
    
    public boolean formsCycle(char[][] grid,int[][] visited,int i,int j,char curr,int dir){
        if(i <0 || j <0 || i >= grid.length || j >= grid[0].length)return false;
        if(grid[i][j] != curr)return false;
        
        if(visited[i][j] == 1)return true;
        
        visited[i][j] = 1;
        boolean res = false;
        if(dir != 2)res = res || formsCycle(grid,visited,i-1,j,curr,1);
        if(dir != 1)res = res || formsCycle(grid,visited,i+1,j,curr,2);
        if(dir != 3)res = res || formsCycle(grid,visited,i,j-1,curr,4);
        if(dir != 4)res = res || formsCycle(grid,visited,i,j+1,curr,3);
        
        return res;
    }
}