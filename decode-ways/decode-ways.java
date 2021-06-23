class Solution {
    public int numDecodings(String s) {
        int dp[] = new int[s.length()+1];
        Arrays.fill(dp,-1);
        
        if(s.length() == 0)return 0;
        if(s.charAt(0) == '0')return 0;
        
        dp[0] = 0;
        dp[1] = 1;
        
        numDecodings(s,s.length(),dp);
        return dp[s.length()];
    }
    
    public int numDecodings(String s,int n,int[] dp){
        if(n == 0)return 1;
        if(n == 1)return 1;
        
        if(dp[n] != -1)return dp[n];
        
        if(s.charAt(n-1) == '0'){
            return dp[n] = ((s.charAt(n-2) == '0') || (
                s.charAt(n-2) !='1' && 
                s.charAt(n-2) != '2')) ? 0 : numDecodings(s,n-2,dp);
        }else{
            int k = numDecodings(s,n-1,dp);
            int l = Integer.valueOf(s.substring(n-2,n));
            if(l>=1 && l<=26 && s.charAt(n-2)!='0')k = k + numDecodings(s,n-2,dp);
            return dp[n] = k;
        }
    }
}