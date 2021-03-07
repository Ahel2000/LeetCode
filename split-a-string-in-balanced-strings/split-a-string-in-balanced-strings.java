class Solution {
    public int balancedStringSplit(String s) {
        int L=0,R=0,split=0;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L')L++;
            else R++;
            if(L==R){
                split++;
                L=0;
                R=0;
            }
        }
        
        return split;
    }
}