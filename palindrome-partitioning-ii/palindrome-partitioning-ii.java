class Solution {
    public int minCut(String s) {
        int memo[][]=new int[s.length()+1][s.length()+1];
        int palindrome[][]=new int[s.length()+1][s.length()+1];
        
        for(int i=0;i<s.length();i++)Arrays.fill(memo[i],-1);
        for(int i=0;i<s.length();i++)Arrays.fill(palindrome[i],-1);
        
        return minCut(s,0,s.length()-1,memo,palindrome);
    }
    
    public int minCut(String s,int i,int j,int[][] memo,int[][] palindrome){
        if(i>=j)return 0;
        
        
        if(memo[i][j]!=-1)return memo[i][j];
        
        int palindome;
        if(palindrome[i][j]!=-1){
            palindome=palindrome[i][j];
        }else{
            palindome=isPalindrome(s,i,j);
            palindrome[i][j]=palindome;
        }
        if(palindome==1){
            return 0;
        }
        
        int min=Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int left=0,right=0;
            if(memo[i][k]==-1){
                left=minCut(s,i,k,memo,palindrome);
                memo[i][k]=left;
            }else{
                left=memo[i][k];
            }
            
            if(memo[k+1][j]==-1){
                right=minCut(s,k+1,j,memo,palindrome);
                memo[k+1][j]=right;
            }else{
                right=memo[k+1][j];
            }
            
            int temp=left+right+1;
            min=Math.min(min,temp);
        }
        
        return memo[i][j]=min;
    }
    
    public int isPalindrome(String s,int i,int j){
        if(i>=j)return 1;
        StringBuilder sb=new StringBuilder(s.substring(i,j+1));
        String s1=sb.reverse().toString();
        
        if(s1.equals(s.substring(i,j+1)))return 1;
        else return 0;
    }
}