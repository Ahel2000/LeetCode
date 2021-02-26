class Solution {
    public int arrangeCoins(int n) {
        int count=0,m=n;
        for(int i=1;i<=m;i++){
            if(n>=i){
                count++;
                n-=i;
            }else{
                break;
            }
        }
        return count;
    }
}