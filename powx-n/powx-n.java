class Solution {
    public double myPow(double x, int n) {
        if(x==1.00000)return 1.0;
        if(n==-2147483648)return myPow(1.0/x,2147483647)*(1/x);
        if(n<0)return myPow(1.0/x,(-1)*n);
        if(n==0)return 1.0;
        
        if(n==1)return x;
        if(n%2==0)return myPow(x*x,n/2);
        else return myPow(x*x,n/2)*x;
    }
}