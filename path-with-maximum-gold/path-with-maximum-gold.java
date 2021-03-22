class Solution {
    int max=Integer.MIN_VALUE;
    public int getMaximumGold(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]!=0)dfs(grid,i,j,0);
            }
        }
        
        return max;
    }
    
    public void dfs(int[][] grid,int i,int j,int curr){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length)return;
        if(grid[i][j]==0){
            max=Math.max(curr,max);
            return;
        }
        
        int temp=grid[i][j];
        grid[i][j]=0;
        dfs(grid,i-1,j,curr+temp);
        dfs(grid,i+1,j,curr+temp);
        dfs(grid,i,j+1,curr+temp);
        dfs(grid,i,j-1,curr+temp);
        grid[i][j]=temp;
    }
}