class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
       int a[] = new int[1001];
        
        for(int i=0;i<=1000;i++){
           for(int j=0;j<trips.length;j++){
               if(i >= trips[j][1] && i < trips[j][2]){
                   a[i] = a[i] + trips[j][0];
               }
           }
        } 
        
        for(int i=0;i<=1000;i++){
            if(a[i] > capacity)return false;
        }
        
        return true;
    }
}