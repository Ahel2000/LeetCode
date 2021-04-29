class Solution {
    public int minScoreTriangulation(int[] values) {
        int t[][]=new int[values.length][values.length];
        for(int i=0;i<t.length;i++)Arrays.fill(t[i],-1);
        return solve(values,0,values.length-1,t);
    }
    
    public int solve(int[] values,int i,int j,int[][] t){
        if(i+2>j)return t[i][j]=0;
        
        if(t[i][j]!=-1)return t[i][j];
        
        int min=Integer.MAX_VALUE;
        for(int k=i+1;k<=j-1;k++){
            int temp=solve(values,i,k,t)+solve(values,k,j,t)+values[i]*values[k]*values[j];
            min=Math.min(min,temp);    
        }
        
        return t[i][j]=min;
    }
}