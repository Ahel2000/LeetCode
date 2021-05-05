class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        int num=0;
        if(arr[0]!=1){
            num++;
            arr[0]=1;
        }
        
        for(int i=1;i<arr.length;i++){
            if((arr[i]-arr[i-1])>1){
                arr[i]=arr[i-1]+1;
                num++;
            }else if(arr[i]-arr[i-1]<-1){
                arr[i-1]=arr[i];
            }
        }
        
        return arr[arr.length-1];
    }
}