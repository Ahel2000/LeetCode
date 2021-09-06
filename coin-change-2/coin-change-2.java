class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int dp[][] = new int[amount + 1][n + 1];
        
        Arrays.fill(dp[0],1);
        for(int i=1;i<=amount;i++){
            for(int j=1;j<=n;j++){
                if(coins[j-1] <= i){
                    dp[i][j] = dp[i - coins[j-1]][j] + dp[i][j-1];
                }else{
                    dp[i][j] = dp[i][j-1];
                }
            }
        }
        
        return dp[amount][n];
    }
}