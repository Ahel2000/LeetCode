class Solution {
    public int minFlips(String target) {
        char rev = '0';
        int count = 0;
        for(int i=0;i<target.length();i++){
            if(target.charAt(i) == rev)continue;
            
            count++;
            if(rev == '0')rev = '1';
            else rev = '0';
        }
        
        return count;
    }
}