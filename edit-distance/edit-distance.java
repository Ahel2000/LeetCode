class Solution {
    public int minDistance(String word1, String word2) {
        int memo[][]=new int[word1.length()+1][word2.length()+1];
        return minDistance(word1,word2,word1.length(),word2.length(),memo);
    }
    
    public int minDistance(String word1,String word2,int m,int n,int[][] memo){
        if(m==0)return n;
        if(n==0)return m;
        if(memo[m][n]>0)return memo[m][n];
        
        if(word1.charAt(m-1)==word2.charAt(n-1))memo[m][n]= minDistance(word1,word2,m-1,n-1,memo);
        
        else memo[m][n]= 1+Math.min(Math.min(minDistance(word1,word2,m,n-1,memo),minDistance(word1,word2,m-1,n,memo)),minDistance(word1,word2,m-1,n-1,memo));
        return memo[m][n];
    }
}