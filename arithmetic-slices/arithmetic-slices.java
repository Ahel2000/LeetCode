class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        int n=A.length;
        if(n<3)return 0;
        int[][] a=new int[n][n];
        
        
        
        for(int i=0;i<n-2;i++){
            for(int j=i+2;j<n;j++){
                int diff=A[i+1]-A[i];
                for(int k=i+1;k<j;k++){
                    if(A[k+1]-A[k]!=diff){
                        a[i][j]=1;
                        break;
                    }
                }
            }
        }
        
        int num=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+2;j<n;j++){
                if(a[i][j]==0)num++;
            }
        }
        return num;
    }
}