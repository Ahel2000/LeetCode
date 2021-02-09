class Solution {
    public int countPrimes(int n) {
        int num=0;
        int primes[]=new int[n+1];
        if(n==0 || n==1)return 0;
        primes[0]=1;
        primes[1]=1;
        
        for(int i=2;i*i<=n;i++){
            if(primes[i]==1)continue;
            for(int j=i*i;j<=n;j+=i){
                primes[j]=1;
            }
        }
        
        for(int i=0;i<n;i++){
            if(primes[i]==0)num++;
        }
        
        return num;
    }
}