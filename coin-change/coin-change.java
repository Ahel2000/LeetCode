class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[][] = new int[amount + 1][coins.length + 1];
        for(int i=0;i<=amount;i++)Arrays.fill(dp[i],amount + 1);
        
        for(int i=0;i<=amount;i++){
            for(int j=0;j<=coins.length;j++){
                
                if(i == 0){
                    dp[i][j] = 0;
                    continue;
                }
                
                if(j == 0)continue;
                
                if(coins[j-1] <= i){
                    dp[i][j] = Math.min(dp[i][j-1],1 + dp[i-coins[j-1]][j]);
                }else{
                    dp[i][j] = dp[i][j-1];
                }
            }
        }
        
        if(dp[amount][coins.length] > amount)return -1;
        return dp[amount][coins.length];
    }
}