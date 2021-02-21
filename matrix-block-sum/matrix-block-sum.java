class Solution {
    public int[][] matrixBlockSum(int[][] mat, int K) {
        int m=mat.length,n=mat[0].length;
        
        for(int i=0;i<m;i++){
            for(int j=1;j<n;j++){
                mat[i][j]+=mat[i][j-1];
            }
        }
        
        int answer[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                for(int k=Math.max(0,i-K);k<=Math.min(m-1,i+K);k++){
                    answer[i][j]+=mat[k][Math.min(j+K,n-1)]-((j-K<=0)?0:mat[k][j-K-1]);
                }
            }
        }
        
        return answer;
    }
}