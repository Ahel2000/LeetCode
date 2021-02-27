class Solution {
    public int maximumScore(int a, int b, int c) {
        if((a==0 && b==0) || (b==0 && c==0) || (a==0 && c==0)){
            return 0;
        }
        
        if(a<=b && a<=c)return 1+maximumScore(a,b-1,c-1);
        else if(b<=c && b<=a)return 1+maximumScore(a-1,b,c-1);
        else return 1+maximumScore(a-1,b-1,c);
    }
}