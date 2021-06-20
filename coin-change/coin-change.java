class Solution {
    int yo = -1,k = -1;
    public int coinChange(int[] coins, int amount) {
        if(amount == 0)return 0;
        yo = amount;
        
        int [][]dp=new int[coins.length+1][amount+1];
        
        for(int i=0;i<=coins.length;i++)Arrays.fill(dp[i],-1);
        
        coinChange(coins,coins.length,amount,dp);
        if(k == -1)return -1;
        return dp[coins.length][amount];
    }
    
    public int coinChange(int[] coins,int n,int amount,int[][] dp){
        if(amount < 0)return yo;
        if(n==0){
           if(amount == 0){
               k = 0;
               return 0;
           }else return yo;
        }
        
        if(amount == 0){
            k = 0;
            return 0;
        }
        
        
        if(dp[n][amount] != -1)return dp[n][amount];
        
        if(coins[n-1] <= amount){
            return dp[n][amount] = Math.min(1 + coinChange(coins,n,amount-coins[n-1],dp),coinChange(coins,n-1,amount,dp));
        }else{
            return dp[n][amount] = coinChange(coins,n-1,amount,dp);
        }
    }
}