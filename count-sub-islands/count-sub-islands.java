class Solution {
    int flag = 1;
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int m = grid1.length;
        int n = grid1[0].length;
        int num = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid2[i][j] == 1 && grid1[i][j] == 1){
                    flag = 1;
                    dfs(grid1,grid2,i,j);
                    num += flag;
                }
            }
        }
        
        return num;
    }
    
    public void dfs(int[][] grid1,int[][] grid2,int i,int j){
        if(i <0 || j < 0 || i >= grid2.length || j >= grid2[0].length)return;
        if(grid2[i][j] == 0)return;
        if(grid2[i][j] == 1 && grid1[i][j] == 0){
            flag = 0;
        }
        
        grid2[i][j] = 0;
        dfs(grid1,grid2,i-1,j);
        dfs(grid1,grid2,i+1,j);
        dfs(grid1,grid2,i,j-1);
        dfs(grid1,grid2,i,j+1);
    }
}