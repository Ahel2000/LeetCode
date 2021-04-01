class Solution {
    public int numberOfSteps (int n) {
        int k=0;
        while(n>0){
            if(n%2==1)n-=1;
            else n>>=1;
            k++;
        }
        return k;
    }
}