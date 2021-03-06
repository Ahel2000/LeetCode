class Solution {
    public int longestPalindromeSubseq(String s) {
        String p="";
        int memo[][]=new int[s.length()+1][s.length()+1];
        for(int i=s.length()-1;i>=0;i--)p+=String.valueOf(s.charAt(i));
        int m=s.length(),n=s.length();
        
        
        for(int i=0;i<=m;i++){
            memo[i][0]=0;
        }
        
        for(int i=0;i<=n;i++){
            memo[0][i]=0;
        }
        
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s.charAt(i-1)==p.charAt(j-1)){
                    memo[i][j]=1+memo[i-1][j-1];
                }else{
                    memo[i][j]=Math.max(memo[i][j-1],memo[i-1][j]);
                }
            }
        }
        
        return memo[m][n];
        
    }
}