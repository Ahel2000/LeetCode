class Solution {
    public int minFallingPathSum(int[][] A) {
        int n=A.length;
        for(int i=n-2;i>=0;i--){
            for(int j=0;j<n;j++){
                int min=A[i+1][j];
                if(j>0)min=Math.min(min,A[i+1][j-1]);
                if(j<n-1)min=Math.min(min,A[i+1][j+1]);
                A[i][j]+=min;
            }
        }
        
        int min=Integer.MAX_VALUE;
        for(int i=0;i<A.length;i++){
            min=Math.min(A[0][i],min);
        }
        
        return min;
    }
}
