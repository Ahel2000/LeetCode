class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int num=flowerbed.length;
        if(n==0)return true;
        if(n>num)return false;
        if(num==1)return flowerbed[0]==0;
        for(int i=0;i<num;i++){
            if(flowerbed[i]==0){
                if(i==0){
                    if(flowerbed[i+1]==0){
                        flowerbed[i]=1;
                        n--;
                    }else{
                        
                    }
                }else if(i==num-1){
                    if(flowerbed[i-1]==0){
                        flowerbed[i]=1;
                        n--;
                    }
                }else{
                    if(flowerbed[i-1]==0 && flowerbed[i+1]==0){
                        flowerbed[i]=1;
                        n--;
                    }
                }
            }
        }
        return n<=0;
    }
}