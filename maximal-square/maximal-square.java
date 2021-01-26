class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix.length==0)return 0;
        int max=0;
        
        int[][] cache=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++)Arrays.fill(cache[i],-1);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]=='1')max=Math.max(max,maximalSq(cache,matrix,i,j));
            }
        }
        
        return max*max;
    }
    
    public int maximalSq(int[][] cache,char[][] matrix,int i,int j){
        if(i==matrix.length || j==matrix[0].length)return 0;
        if(matrix[i][j]=='0')return 0;
        if(cache[i][j]!=-1)return cache[i][j];
        cache[i][j]=(1+Math.min(Math.min(maximalSq(cache,matrix,i+1,j),maximalSq(cache,matrix,i,j+1)),maximalSq(cache,matrix,i+1,j+1)));
        return cache[i][j];
    }
}
