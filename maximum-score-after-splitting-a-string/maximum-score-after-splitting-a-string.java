class Solution {
    public int maxScore(String s) {
        int n=s.length();
        int max=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            String s1=s.substring(0,i);
            String s2=s.substring(i,n);
            int r=0,l=0;
            for(int j=0;j<s1.length();j++){
                if(s1.charAt(j)=='0')l++;
            }
            
            for(int j=0;j<s2.length();j++){
                if(s2.charAt(j)=='1')r++;
            }
            
            max=Math.max(max,l+r);
        }
        
        return max;
    }
}