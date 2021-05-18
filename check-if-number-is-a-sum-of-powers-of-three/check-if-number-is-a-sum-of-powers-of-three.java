class Solution {
    public boolean checkPowersOfThree(int n) {
        int maxpow = 0;
        int arr[] = new int[17];
        HashMap<Integer,Boolean> map = new HashMap<>();
        int z = 1;
        while(z<=n){
            z*=3;
            maxpow++;
        }
        
        return checkPowers(n,maxpow,arr,map);
    }
    
    public boolean checkPowers(int n,int maxpow,int[] arr,HashMap<Integer,Boolean> map){
        if(n<0)return false;
        if(n==0)return true;
        if(map.containsKey(n))return map.get(n);
        
        
        for(int i = 0; i<maxpow; i++){
            if(arr[i] != 1){
                arr[i] = 1;
                if(checkPowers(n - (int)Math.pow(3,i), maxpow, arr,map)){
                    map.put(n,true);
                    return true;
                }
                arr[i] = 0;
            }
        }
        
        map.put(n,false);
        return false;
    }
}