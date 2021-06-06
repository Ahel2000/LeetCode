class Solution {
    public int minimumSwap(String s1, String s2) {
        int n = s1.length(),x=0,y=0;
        for(int i=0;i<n;i++){
            if(s1.charAt(i) == s2.charAt(i))continue;
            if(s1.charAt(i)=='x')x++;
            else y++;
        }
        
        if((x+y)%2 == 1)return -1;
        int ans = 0;
        if(x%2 == 1){
            ans = 1 + (x+y)/2;
        }else{
            ans = (x+y)/2;
        }
        
        return ans;
    }
}