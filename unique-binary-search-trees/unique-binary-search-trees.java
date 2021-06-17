class Solution {
    public int numTrees(int n) {
        if(n<0)return 0;
        if(n==1||n==0)return 1;
        if(n==2)return 2;
        int res=0;
        for(int i=1;i<=n;i++){
            res+=numTrees(i-1)*numTrees(n-i);
        }
        return res;
    }

}