class Solution {
    int max;
    public int findLength(int[] A, int[] B) {
        int m=A.length,n=B.length;
        int memo[][]=new int[m+1][n+1];
        int max=0;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(A[i-1]==B[j-1]){
                    memo[i][j]=1+memo[i-1][j-1];
                    max=Math.max(memo[i][j],max);
                }else{
                    memo[i][j]=0;
                }
            }
        }
       return max;
    }
}