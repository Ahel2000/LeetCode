class Solution {
    public void solve(char[][] grid) {
        int m = grid.length,n = grid[0].length;
        for(int i=0;i<m;i++){
            if(grid[i][0] == 'O'){
                dfs(i,0,grid);
            }
            
            if(grid[i][n-1] == 'O'){
                dfs(i,n-1,grid);
            }
        }
        
        for(int i=0;i<n;i++){
            if(grid[0][i] == 'O'){
                dfs(0,i,grid);
            }
            
            if(grid[m-1][i] == 'O'){
                dfs(m-1,i,grid);
            }
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 'O')grid[i][j] = 'X';
            }
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 'T')grid[i][j] = 'O';
            }
        }
    }
    
    public void dfs(int i,int j,char[][] grid){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length)return;
        if(grid[i][j] != 'O')return;
        
        grid[i][j] = 'T';
        dfs(i,j-1,grid);
        dfs(i,j+1,grid);
        dfs(i+1,j,grid);
        dfs(i-1,j,grid);
    }
}