class Solution {
    public int numEnclaves(int[][] grid) {
        int m = grid.length,n = grid[0].length;
        for(int i=0;i<m;i++){
            if(grid[i][0] == 1){
                dfs(grid,i,0);
            }
            
            if(grid[i][n-1] == 1){
                dfs(grid,i,n-1);
            }
        }
        
        for(int i=0;i<n;i++){
            if(grid[0][i] == 1){
                dfs(grid,0,i);
            }
            
            if(grid[m-1][i] == 1){
                dfs(grid,m-1,i);
            }
        }
        
        int total = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                total += grid[i][j];
            }
        }
        
        return total;
    }
    
    public void dfs(int[][] grid,int i,int j){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length)return;
        if(grid[i][j] == 0)return;
        
        grid[i][j] = 0;
        dfs(grid,i-1,j);
        dfs(grid,i+1,j);
        dfs(grid,i,j-1);
        dfs(grid,i,j+1);
    }
}