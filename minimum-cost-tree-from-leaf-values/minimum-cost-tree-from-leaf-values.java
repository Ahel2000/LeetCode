class Solution {
    public int mctFromLeafValues(int[] arr) {
        int dp[][]=new int[arr.length][arr.length];
        for(int i=0;i<dp.length;i++)Arrays.fill(dp[i],-1);
        
        return minCost(0,arr.length-1,dp,arr);
    }
    
    public int minCost(int i,int j,int[][] dp,int[] arr){
        if(i>=j)return 0;
        
        if(dp[i][j]!=-1)return dp[i][j];
        
        dp[i][j]=Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            dp[i][j]=Math.min(dp[i][j],minCost(i,k,dp,arr)+minCost(k+1,j,dp,arr)+
                         maxRange(i,k,arr)*maxRange(k+1,j,arr));
        }
        
        return dp[i][j];
    }
    
    public int maxRange(int i,int j,int[] arr){
        int max=Integer.MIN_VALUE;
        for(int k=i;k<=j;k++){
            max=Math.max(arr[k],max);
        }
        return max;
    }
}