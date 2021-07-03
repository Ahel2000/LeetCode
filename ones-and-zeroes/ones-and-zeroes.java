class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int k = strs.length;
        int arr[][] = new int[k][2];
        for(int i=0;i<k;i++){
            String x = strs[i];
            for(int j=0;j<x.length();j++){
                if(x.charAt(j) == '1')arr[i][1]++;
                else arr[i][0]++;
            }
        }
        
        int dp[][][] = new int[k+1][m+1][n+1];
        return knapSack(k,dp,m,n,arr);
    }
    
    public int knapSack(int i,int[][][] dp,int m,int n,int[][] arr){
        if(i == 0)return 0;
        
        if(dp[i][m][n] > 0)return dp[i][m][n];
        
        if(arr[i-1][0] <=m && arr[i-1][1] <= n){
            return dp[i][m][n] = Math.max(1 + knapSack(i-1,dp,m-arr[i-1][0],n-arr[i-1][1],arr), knapSack(i-1,dp,m,n,arr));
        }else{
            return dp[i][m][n] = knapSack(i-1,dp,m,n,arr);
        }
    }
}