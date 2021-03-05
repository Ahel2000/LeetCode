class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n=arr.length;
        if(n==0)return 0;
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=arr[0];
        for(int i=1;i<n;i++){
            dp[i+1]=0;
            int max=0;
            for(int j=1;j<=k;j++){
                if(i-j+1<0){
                    break;
                }
                
                max=Math.max(arr[i-j+1],max);
                dp[i+1]=Math.max(dp[i+1],dp[i-j+1]+max*j);    
            }
        }
        return dp[n];
    }
}