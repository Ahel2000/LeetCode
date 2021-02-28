class Solution {
    public int countSubstrings(String s) {
        int count=0,n=s.length();
        
        int [][]dp=new int[n][n];
        
        for(int i=0;i<n;i++)dp[i][i]=1;
        
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)==s.charAt(i+1))dp[i][i+1]=1;
        }
        
        for(int i=n-3;i>=0;i--){
            for(int j=i+2;j<n;j++){
                if(dp[i+1][j-1]==1 && s.charAt(i)==s.charAt(j)){
                    dp[i][j]=1;
                }
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(dp[i][j]==1)count++;
            }
        }
        
        return count;
    }
}