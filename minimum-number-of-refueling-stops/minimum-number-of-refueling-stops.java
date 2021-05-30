class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        int n = stations.length;
        int dp[][] = new int[n+1][n+1];
        for(int i=0;i<=n;i++)dp[i][0]=startFuel;
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                dp[i][j] = dp[i-1][j];
                if(dp[i-1][j-1] >= stations[i-1][0]) 
                    dp[i][j] = Math.max(dp[i-1][j-1] + stations[i-1][1], 
                                        dp[i-1][j]);
            }
        }
        
        int num = -1;
        for(int i=0;i<=n;i++){
            if(dp[n][i] >= target){
                num = i;
                break;
            }
        }
        
        return num;
    }
}