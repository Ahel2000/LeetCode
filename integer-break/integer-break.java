class Solution {
    public int integerBreak(int n) {
        int[] x=new int[n+1];
        if(n<=2)return 1;
        x[0]=1;
        x[1]=1;
        x[2]=1;
        if(n==3)return 2;
        
        for(int i=3;i<=n;i++){
            int max=Integer.MIN_VALUE;
            for(int j=1;j<=i;j++){
                max=Math.max(max,j*x[i-j]);
            }
            x[i]=max;
        }
        
        return x[n];
    }
}