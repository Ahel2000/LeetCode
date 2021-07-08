class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        int n=A.length;
        if(n<3)return 0;
        int num=0;
        
        for(int i=0;i<n-2;i++){
            int diff=A[i+1]-A[i];
            for(int j=i+2;j<n;j++){
                if(A[j]-A[j-1]==diff)num++;
                else break;
            }
        }
        
        return num;
    }
}