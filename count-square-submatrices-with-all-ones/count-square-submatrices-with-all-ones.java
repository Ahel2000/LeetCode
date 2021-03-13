class Solution {
    public int countSquares(int[][] matrix) {
        int ans=0;
        int m=matrix.length,n=matrix[0].length;
        
        int a[][]=new int[m+1][n+1];
        for(int i=0;i<m;i++)if(matrix[i][0]==1)a[i][0]=1;
        for(int i=0;i<n;i++)if(matrix[0][i]==1)a[0][i]=1;
        
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j]==1)a[i][j]=1+Math.min(a[i-1][j],Math.min(a[i][j-1],a[i-1][j-1]));
            }
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans+=a[i][j];
            }
        }
        
        return ans;
    }
}