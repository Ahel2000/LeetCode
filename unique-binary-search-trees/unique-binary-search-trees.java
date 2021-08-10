class Solution {
    
    public int numTrees(int n){
        if(n<0)return 0;
        if(n==1||n==0)return 1;
        if(n==2)return 2;
        
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        
        for(int i=3;i<=n;i++){
            for(int j=0;j<=i - 1;j++){
                dp[i] += dp[i - j - 1] * dp[j];
            }
        }
        
        return dp[n];
    }

}