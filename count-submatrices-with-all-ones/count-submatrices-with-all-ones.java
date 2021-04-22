class Solution {
    public int numSubmat(int[][] mat) {
        int m=mat.length,n=mat[0].length;
        int dp[][]=new int[m][n];
        
        for(int i=0;i<m;i++){
            int c=0;
            for(int j=n-1;j>=0;j--){
                if(mat[i][j]==1){
                    c++;
                }else{
                    c=0;
                }
                
                dp[i][j]=c;
            }
        }
        
        int ans=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int x=Integer.MAX_VALUE;
                for(int k=i;k<m;k++){
                    x=Math.min(dp[k][j],x);
                    ans+=x;
                }
            }
        }
        
        return ans;
    }
}