class Solution {
    public int minFallingPathSum(int[][] grid) {
        int n = grid.length;
        int dp[][] = new int[n][n];
        for(int i=0;i<n;i++)Arrays.fill(dp[i],Integer.MAX_VALUE);
        
        for(int i=0;i<n;i++){
            dp[0][i] = grid[0][i];
        }
        
        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    if(k == j)continue;
                    dp[i][j] = Math.min(dp[i][j],grid[i][j] + dp[i-1][k]);
                }
            }
        }
        
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)min = Math.min(min,dp[n-1][i]);
        return min;
    }
}